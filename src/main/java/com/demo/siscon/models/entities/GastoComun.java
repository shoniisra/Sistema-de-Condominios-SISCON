package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="GASTOCOMUN")
public class GastoComun implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDGASTOCOMUN")
    private Integer idGastoComun;

    @Column(name = "ESTADO")
    @Min(value = 0)
    private int estado;

    @Column(name = "MONTOTOTAL")
    @Min(value = 0)
    private float montoTotal;

    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicioPago;

    @Column(name = "FECHALIMITE")
    @Temporal(TemporalType.DATE)
    private Calendar fechaLimitePago;

    @Column(name = "OBSERVACION")
    @Size(max = 255)
    private String observacion;


//    @JoinColumn(name="IDMEDICO", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Medico medico;
//
//    @JoinColumn(name="IDPACIENTE", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Paciente paciente;

//    @OneToMany(mappedBy="gastocomun", fetch=FetchType.LAZY)
//    private List<DetalleGastoComun> detalles;
    

    /*RELACIONES*/
    @JoinColumn(name="IDCONDOMINIO", referencedColumnName="IDCONDOMINIO")
	@ManyToOne
	private Condominio condominio;
    
    @OneToMany(mappedBy="gastoComun", fetch = FetchType.LAZY)
   	private List<DetalleGastoComun> detallesGastoComun;

    public GastoComun() {

    }

    public GastoComun(@Min(value = 0) Integer idGastoComun) {
        this.idGastoComun = idGastoComun;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdGastoComun() {
        return idGastoComun;
    }

    public void setIdGastoComun(Integer idGastoComun) {
        this.idGastoComun = idGastoComun;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Calendar getFechaInicioPago() {
        return fechaInicioPago;
    }

    public void setFechaInicioPago(Calendar fechaInicioPago) {
        this.fechaInicioPago = fechaInicioPago;
    }

    public Calendar getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(Calendar fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
