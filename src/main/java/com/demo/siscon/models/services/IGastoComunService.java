package com.demo.siscon.models.services;

import java.util.List;

import com.demo.siscon.models.entities.GastoComun;;

public interface IGastoComunService {

	public void save(GastoComun gastoComun);

    public void delete(Integer id);

    public GastoComun findById(Integer id);

    public List<GastoComun> findAll();
}
