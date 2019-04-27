package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.List;

public class DetalleGastoComun {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDETALLEGASTOCOMUN")
    private Integer idDetalleGastoComun;

    @Column(name = "CUOTANUMERO")
    @Min(value = 0)
    private int cuotaNumero;

    @Column(name = "TOTALCUOTAS")
    @Min(value = 0)
    private int totalCuotas;

    @Column(name = "MONTO")
    @Min(value = 0)
    private float monto;

    @Column(name = "DESCRIPCION")
    @Size(max = 255)
    private String descripcion;


//    @JoinColumn(name="IDMEDICO", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Medico medico;
//
//    @JoinColumn(name="IDPACIENTE", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Paciente paciente;

//    @OneToMany(mappedBy="detallegastocomun", fetch=FetchType.LAZY)
//    private List<DetalleDetalleGastoComun> detalles;

    public DetalleGastoComun() {

    }

    public DetalleGastoComun(@Min(value = 0) Integer idDetalleGastoComun) {
        this.idDetalleGastoComun = idDetalleGastoComun;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdDetalleGastoComun() {
        return idDetalleGastoComun;
    }

    public void setIdDetalleGastoComun(Integer idDetalleGastoComun) {
        this.idDetalleGastoComun = idDetalleGastoComun;
    }

    public int getCuotaNumero() {
        return cuotaNumero;
    }

    public void setCuotaNumero(int cuotaNumero) {
        this.cuotaNumero = cuotaNumero;
    }

    public int getTotalCuotas() {
        return totalCuotas;
    }

    public void setTotalCuotas(int totalCuotas) {
        this.totalCuotas = totalCuotas;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
