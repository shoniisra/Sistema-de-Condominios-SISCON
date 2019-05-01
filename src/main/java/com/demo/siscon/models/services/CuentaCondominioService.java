package com.demo.siscon.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.siscon.models.dao.ICuentaCondominioDAO;
import com.demo.siscon.models.entities.CuentaCondominio;

@Service
public class CuentaCondominioService implements ICuentaCondominioService {

	@Autowired 
	private ICuentaCondominioDAO dao; 
	
	@Override
	public void save(CuentaCondominio cuentaCondominio) {
		dao.save(cuentaCondominio);
		
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public CuentaCondominio findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<CuentaCondominio> findAll() {
		return (List<CuentaCondominio>)dao.findAll();
	}

}
