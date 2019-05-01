package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.IUsuarioDAO;
import com.demo.siscon.models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private IUsuarioDAO dao;

    @Override
    public void save(Usuario medicamento) {
        // TODO Auto-generated method stub
        dao.save(medicamento);
    }

    @Override
    public Usuario findById(Integer id) {
        // TODO Auto-generated method stub
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }

    @Override
    public List<Usuario> findAll() {
        // TODO Auto-generated method stub
        return (List<Usuario>) dao.findAll();
    }
}
