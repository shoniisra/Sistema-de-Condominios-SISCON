package com.demo.siscon.models.dao;

import com.demo.siscon.models.entities.Noticia;
import org.springframework.data.repository.CrudRepository;

public interface INoticiaDAO extends CrudRepository<Noticia, Integer> {
}
