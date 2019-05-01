package com.demo.siscon.models.services;

import java.util.List;

import com.demo.siscon.models.entities.Condominio;;

public interface ICondominioService {
	
	public void save(Condominio condominio);

    public void delete(Integer id);

    public Condominio findById(Integer id);

    public List<Condominio> findAll();
}
