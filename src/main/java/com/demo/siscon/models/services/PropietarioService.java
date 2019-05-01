package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.IPropietarioDAO;
import com.demo.siscon.models.entities.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PropietarioService implements IPropietarioService{
    @Autowired
    private IPropietarioDAO dao;

    @Override
    public void save(Propietario medicamento) {
        // TODO Auto-generated method stub
        dao.save(medicamento);
    }

    @Override
    public Propietario findById(Integer id) {
        // TODO Auto-generated method stub
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }

    @Override
    public List<Propietario> findAll() {
        // TODO Auto-generated method stub
        return (List<Propietario>) dao.findAll();
    }
}
