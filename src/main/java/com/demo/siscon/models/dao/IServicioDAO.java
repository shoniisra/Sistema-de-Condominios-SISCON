package com.demo.siscon.models.dao;

import com.demo.siscon.models.entities.Servicio;
import org.springframework.data.repository.CrudRepository;

public interface IServicioDAO extends CrudRepository<Servicio, Integer> {
}
