package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
@Entity
@Table(name="VIVIENDA")
public class Vivienda implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVIVIENDA")
    private Integer idVivienda;

    @Column(name = "CODIGOVIVIENDA")
    @Size(max = 255)
    private String codigoVivienda;


    @Column(name = "NUMERO")
    @Min(value = 0)
    private int numero;

    @Column(name = "PISO")
    @Min(value = 0)
    private int piso;

    @Column(name = "NUMEROPERSONAS")
    @Min(value = 0)
    private int numeroPersonas;

    @Column(name = "PRECIOREFERENCIA")
    @Min(value = 0)
    private float precioReferencia;

    @Column(name = "TELEFONO")
    @Size(max = 15)
    private String telefono;

    @Column(name = "LUGARESTACIONAMIENTO")
    @Size(max = 15)
    private String lugarEstacionamiento;

    @Column(name = "USOESTACIONAMIENTO")
    private Boolean usoEstacionamiento;

    @Column(name = "DISPONIBLE")
    private Boolean disponible;

//    @JoinColumn(name="IDMEDICO", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Medico medico;
//
//    @JoinColumn(name="IDPACIENTE", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Paciente paciente;


    @OneToMany(mappedBy="vivienda", fetch=FetchType.LAZY)
    private List<CuentaVivienda> cuentas;

    @OneToMany(mappedBy="vivienda", fetch=FetchType.LAZY)
    private List<Propietario> propietarios;

    @JoinColumn(name="IDCONDOMINIO", referencedColumnName = "IDCONDOMINIO")//claves foraneas
    @ManyToOne
    private Condominio condominio;

    public Vivienda() {

    }

    public Vivienda(@Min(value = 0) Integer idVivienda) {
        this.idVivienda = idVivienda;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(Integer idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getCodigoVivienda() {
        return codigoVivienda;
    }

    public void setCodigoVivienda(String codigoVivienda) {
        this.codigoVivienda = codigoVivienda;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public float getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(float precioReferencia) {
        this.precioReferencia = precioReferencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugarEstacionamiento() {
        return lugarEstacionamiento;
    }

    public void setLugarEstacionamiento(String lugarEstacionamiento) {
        this.lugarEstacionamiento = lugarEstacionamiento;
    }

    public Boolean getUsoEstacionamiento() {
        return usoEstacionamiento;
    }

    public void setUsoEstacionamiento(Boolean usoEstacionamiento) {
        this.usoEstacionamiento = usoEstacionamiento;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public List<CuentaVivienda> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaVivienda> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
}
