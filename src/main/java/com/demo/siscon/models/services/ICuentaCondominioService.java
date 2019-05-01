package com.demo.siscon.models.services;

import java.util.List;

import com.demo.siscon.models.entities.CuentaCondominio;

public interface ICuentaCondominioService {
	
	public void save(CuentaCondominio cuentaCondominio);

    public void delete(Integer id);

    public CuentaCondominio findById(Integer id);

    public List<CuentaCondominio> findAll();
}
