package com.demo.siscon.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.siscon.models.dao.ICondominioDAO;
import com.demo.siscon.models.entities.Condominio;

@Service
public class CondominioService implements ICondominioService {

	@Autowired 
	private ICondominioDAO dao; 
	
	@Override
	public void save(Condominio condominio) {
		dao.save(condominio);
		
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public Condominio findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Condominio> findAll() {
		return (List<Condominio>)dao.findAll();
	}

}
