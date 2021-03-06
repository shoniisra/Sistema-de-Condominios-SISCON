package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;
@Entity
@Table(name="CUENTAVIVIENDA")
public class CuentaVivienda implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCUENTAVIVIENDA")
    private Integer idCuentaVivienda;

    @Column(name = "DESCRIPCION")
    @Size(max = 255)
    private String descripcion;

    @Column(name = "SALDO")
    @Min(value = 0)
    private float saldo;

    @Column(name = "FACTORALICUOTA")
    @Size(max = 15)
    private String factorAlicuota;

    @Column(name = "FECHAINICIOCONTRATO")
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicioContrato;

    @Column(name = "FECHAPAGOALICUOTA")
    @Temporal(TemporalType.DATE)
    private Calendar fechaPagoAlicuota;

    @JoinColumn(name="IDVIVIENDA", referencedColumnName = "IDVIVIENDA")//claves foraneas
    @ManyToOne
    private Vivienda vivienda;

    public CuentaVivienda() {

    }

    public CuentaVivienda(@Min(value = 0) Integer idCuentaVivienda) {
        this.idCuentaVivienda = idCuentaVivienda;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdCuentaVivienda() {
        return idCuentaVivienda;
    }

    public void setIdCuentaVivienda(Integer idCuentaVivienda) {
        this.idCuentaVivienda = idCuentaVivienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getFactorAlicuota() {
        return factorAlicuota;
    }

    public void setFactorAlicuota(String factorAlicuota) {
        this.factorAlicuota = factorAlicuota;
    }

    public Calendar getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Calendar fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Calendar getFechaPagoAlicuota() {
        return fechaPagoAlicuota;
    }

    public void setFechaPagoAlicuota(Calendar fechaPagoAlicuota) {
        this.fechaPagoAlicuota = fechaPagoAlicuota;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
}
