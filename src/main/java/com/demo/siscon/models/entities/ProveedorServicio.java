package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class ProveedorServicio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPROVEEDORSERVICIO")
    private Integer idProvedorServicio;

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
        this.idProvedorServicio = id;
    }

}
