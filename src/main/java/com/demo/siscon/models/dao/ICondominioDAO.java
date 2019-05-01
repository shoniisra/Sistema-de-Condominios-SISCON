package com.demo.siscon.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.siscon.models.entities.Condominio;

public interface ICondominioDAO extends CrudRepository<Condominio, Integer> {

}
