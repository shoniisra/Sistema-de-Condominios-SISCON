package com.demo.siscon.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.siscon.models.dao.IGastoComunDAO;
import com.demo.siscon.models.entities.GastoComun;

@Service 
public class GastoComunService implements IGastoComunService {

	@Autowired 
	private IGastoComunDAO dao;
	@Override
	public void save(GastoComun gastoComun) {
		dao.save(gastoComun);
		
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public GastoComun findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<GastoComun> findAll() {
		return (List<GastoComun>)dao.findAll();
	}

}
