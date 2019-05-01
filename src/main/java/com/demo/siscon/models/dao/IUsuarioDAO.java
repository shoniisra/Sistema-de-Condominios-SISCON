package com.demo.siscon.models.dao;
import com.demo.siscon.models.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
public interface IUsuarioDAO extends CrudRepository<Usuario, Integer>{
}
