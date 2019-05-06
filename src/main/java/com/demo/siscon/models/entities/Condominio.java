package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="CONDOMINIO")
public class Condominio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONDOMINIO")
    private Integer idCondominio;

    @Column(name = "RUC")
    @Size(max = 13)
    private String RUC;

    @Column(name = "NOMBRE")
    @Size(max = 100)
    private String nombre;

    @Column(name = "DIRECCION")
    @Size(max = 255)
    private String direccion;

    @Column(name = "PAGINAWEB")
    @Size(max = 100)
    private String paginaWeb;

    @Column(name = "TELEFONO")
    @Size(max = 15)
    private String telefono;

    @Column(name = "TELEFONO2")
    @Size(max = 15)
    private String telefono2;

    @Column(name = "EMAIL")
    @Email
    private String email;
    
    /*RELACIONES*/
    @OneToMany(mappedBy="condominio", fetch = FetchType.LAZY)
	private List<CuentaCondominio> cuentasCondominios;
    
    @OneToMany(mappedBy="condominio", fetch = FetchType.LAZY)
	private List<GastoComun> gastosComunes;
    
    @OneToMany(mappedBy="condominio", fetch = FetchType.LAZY)
   	private List<ProveedorServicio> proveedoresServicio;

    @OneToMany(mappedBy="condominio", fetch=FetchType.LAZY)
    private List<Vivienda> viviendas;

    @OneToMany(mappedBy = "condominio", fetch = FetchType.LAZY)
    private List<Noticia> noticias;

    public Condominio() {
    }

    public Condominio(Integer id) {
        this.idCondominio = id;
    }

    public Integer getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(Integer idCondominio) {
        this.idCondominio = idCondominio;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public List<CuentaCondominio> getCuentasCondominios() {
		return cuentasCondominios;
	}

	public void setCuentasCondominios(List<CuentaCondominio> cuentasCondominios) {
		this.cuentasCondominios = cuentasCondominios;
	}

	public List<GastoComun> getGastosComunes() {
		return gastosComunes;
	}

	public void setGastosComunes(List<GastoComun> gastosComunes) {
		this.gastosComunes = gastosComunes;
	}

	public List<ProveedorServicio> getProveedoresServicio() {
		return proveedoresServicio;
	}

	public void setProveedoresServicio(List<ProveedorServicio> proveedoresServicio) {
		this.proveedoresServicio = proveedoresServicio;
	}

	public List<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(List<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}

	public List<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}

    
}
