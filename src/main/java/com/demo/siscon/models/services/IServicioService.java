package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.Servicio;

import java.util.List;

public interface IServicioService {

    public void save(Servicio servicio);

    public Servicio findById(Integer id);

    public void delete(Integer id);

    public List<Servicio> findAll();

}
