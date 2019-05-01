package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.CuentaVivienda;

import java.util.List;

public interface ICuentaViviendaService {
    public void save(CuentaVivienda cuentavivienda);

    public void delete(Integer id);

    public CuentaVivienda findById(Integer id);

    public List<CuentaVivienda> findAll();
}
