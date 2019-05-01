package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.Noticia;

import java.util.List;

public interface INoticiaService {

    public void save(Noticia noticia);

    public Noticia findById(Integer id);

    public void delete(Integer id);

    public List<Noticia> findAll();

}
