package com.demo.siscon.models.entities;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Calendar;
import java.util.List;

public class Propietario {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPROPIETARIO")
    private Integer idPropietario;

    @Size(max = 35)
    @Column(name = "NOMBRES")
    @NotEmpty
    private String nombre;

    @Size(max = 15)
    @Column(name = "CEDULA")
    private String cedula;

    @Size(max = 35)
    @Column(name = "EMAIL")
    @NotEmpty
    @Email
    private String email;

    @Size(max = 15)
    @Column(name = "TELÉFONO")
    @NotEmpty
    private String telefono;

    @Column(name = "NACIMIENTO")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar nacimiento;

    @Column(name = "ESADMIN")
    private Boolean esAdmin;


//    @JoinColumn(name="IDMEDICO", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Medico medico;
//
//    @JoinColumn(name="IDPACIENTE", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Paciente paciente;

//    @OneToMany(mappedBy="propietario", fetch=FetchType.LAZY)
//    private List<DetallePropietario> detalles;

    public Propietario() {

    }

    public Propietario(@Min(value = 0) Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(Boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
}
