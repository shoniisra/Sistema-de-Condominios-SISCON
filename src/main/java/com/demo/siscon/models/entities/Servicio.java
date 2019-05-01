package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name="SERVICIO")
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSERVICIO")
    private Integer idServicio;

    @Column(name = "NOMBRE")
    @Size(max = 100)
    private String nombre;

    @Column(name = "PRECIO")
    private float precio;

    @Column(name = "DESCRIPCION")
    @Size(max = 255)
    private String descripcion;

    @Column(name = "CODIGO")
    @Size(max = 100)
    private String codigo;

    @JoinColumn(name = "IDPROVEEDORSERVICIO", referencedColumnName = "IDPROVEEDORSERVICIO", nullable = false)
    @ManyToOne
    private ProveedorServicio proveedorServicio;

    public Servicio() {
    }

    public Servicio(Integer id) {
        this.idServicio = id;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ProveedorServicio getProveedorServicio() {
        return proveedorServicio;
    }
}
