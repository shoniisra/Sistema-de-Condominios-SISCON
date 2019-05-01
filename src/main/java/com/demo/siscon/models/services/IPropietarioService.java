package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.Propietario;

import java.util.List;

public interface IPropietarioService {
    public void save(Propietario propietario);

    public void delete(Integer id);

    public Propietario findById(Integer id);

    public List<Propietario> findAll();
}
