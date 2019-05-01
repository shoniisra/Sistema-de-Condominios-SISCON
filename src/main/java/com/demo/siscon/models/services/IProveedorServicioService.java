package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.ProveedorServicio;

import java.util.List;

public interface IProveedorServicioService {

    public void save(ProveedorServicio proveedorServicio);

    public ProveedorServicio findById(Integer id);

    public void delete(Integer id);

    public List<ProveedorServicio> findAll();

}
