package com.demo.siscon.models.services;

import java.util.List;

import com.demo.siscon.models.entities.DetalleGastoComun;

public interface IDetalleGastoComunService {

	public void save(DetalleGastoComun detalleGastoComun);

    public void delete(Integer id);

    public DetalleGastoComun findById(Integer id);

    public List<DetalleGastoComun> findAll();
}
