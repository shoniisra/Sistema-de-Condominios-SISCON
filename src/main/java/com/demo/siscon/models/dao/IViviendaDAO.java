package com.demo.siscon.models.dao;
import com.demo.siscon.models.entities.Vivienda;
import org.springframework.data.repository.CrudRepository;
public interface IViviendaDAO extends CrudRepository<Vivienda, Integer> {
}
