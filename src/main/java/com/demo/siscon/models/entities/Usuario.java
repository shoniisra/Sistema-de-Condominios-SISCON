package com.demo.siscon.models.entities;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private Integer idUsuario;

    @Size(max = 35)
    @Column(name = "USUARIO")
    @NotEmpty
    private String usuario;

    @Size(max = 35)
    @Column(name = "PASSWORD")
    @NotEmpty
    private String password;

    @Size(max = 35)
    @Column(name = "ESTADO")
    @NotEmpty
    private String estado;

    @Size(max = 35)
    @Column(name = "CARGO")
    @NotEmpty
    private String cargo;

    @OneToOne
    @MapsId
    private Propietario propietario;

//    @JoinColumn(name="IDMEDICO", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Medico medico;
//
//    @JoinColumn(name="IDPACIENTE", referencedColumnName = "IDPERSONA")
//    @ManyToOne
//    private Paciente paciente;

//    @OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
//    private List<DetalleUsuario> detalles;

    public Usuario() {

    }

    public Usuario(@Min(value = 0) Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
