package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name="CUENTACONDOMINIO")
public class CuentaCondominio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCUENTACONDOMINIO")
    private Integer idCuentaCondominio;

    @Column(name="RAZONSOCIAL")
    @Size(max = 255)
    private String razonSocial;

    @Column(name="NUMEROCUENTA")
    @Size(max = 255)
    private String numeroCuenta;

    @Column(name="BANCOEMISOR")
    @Size(max = 255)
    private String bancoEmisor;

    @Column(name="TITULAR")
    @Size(max = 255)
    private String titular;

    @Column(name="TIPOCUENTA")
    @Size(max = 255)
    private String tipoCuenta;

    public CuentaCondominio() {
    }

    public CuentaCondominio(Integer id){
        this.idCuentaCondominio = id;
    }

    public Integer getIdCuentaCondominio() {
        return idCuentaCondominio;
    }

    public void setIdCuentaCondominio(Integer idCuentaCondominio) {
        this.idCuentaCondominio = idCuentaCondominio;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
