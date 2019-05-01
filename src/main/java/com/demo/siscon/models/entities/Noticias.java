package com.demo.siscon.models.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name="NOTICIAS")
public class Noticias implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDNOTICIA")
    private Integer idNoticia;

    @Column(name = "TITULO")
    @Size(max = 100)
    private String titulo;

    @Column(name = "DESCRIPCION")
    @Size(max = 255)
    private String descripcion;

    @Column(name = "URLIMAGEN")
    @Size(max = 100)
    private String urlImagen;

    public Noticias() {
    }

    public Noticias(Integer id) {
        this.idNoticia = id;
    }

    public Integer getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
