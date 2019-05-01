package com.demo.siscon.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.siscon.models.dao.IDetalleGastoComunDAO;
import com.demo.siscon.models.entities.DetalleGastoComun;

@Service 
public class DetalleGastoComunService implements IDetalleGastoComunService {

	@Autowired 
	private IDetalleGastoComunDAO dao;
	@Override
	public void save(DetalleGastoComun detalleGastoComun) {
		dao.save(detalleGastoComun);
		
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public DetalleGastoComun findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<DetalleGastoComun> findAll() {
		return (List<DetalleGastoComun>)dao.findAll();
	}

}
