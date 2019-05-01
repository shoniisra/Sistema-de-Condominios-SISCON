package com.demo.siscon.models.services;

import com.demo.siscon.models.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void save(Usuario usuario);

    public void delete(Integer id);

    public Usuario findById(Integer id);

    public List<Usuario> findAll();
}
