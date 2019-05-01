package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name="PROVEEDORSERVICIO")
public class ProveedorServicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPROVEEDORSERVICIO")
    private Integer idProveedorServicio;

    @Column(name = "RUC")
    @Size(max = 13)
    private String RUC;

    @Column(name = "TELEFONO")
    @Size(max = 15)
    private String telefono;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "DIRECCION")
    @Size(max = 255)
    private String direccion;

    @Column(name = "ESTADO")
    private boolean estado;

    @Column(name = "FRECUENCIA")
    private float frecuencia;

    public ProveedorServicio() {
    }

    public ProveedorServicio(Integer id) {
        this.idProveedorServicio = id;
    }

    public Integer getIdProveedorServicio() {
        return idProveedorServicio;
    }

    public void setIdProveedorServicio(Integer idProveedorServicio) {
        this.idProveedorServicio = idProveedorServicio;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }
}
