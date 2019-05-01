package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.Vivienda;

import java.util.List;

public interface IViviendaService {
    public void save(Vivienda vivienda);

    public void delete(Integer id);

    public Vivienda findById(Integer id);

    public List<Vivienda> findAll();
}
