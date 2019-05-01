package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.IViviendaDAO;
import com.demo.siscon.models.entities.Vivienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ViviendaService implements IViviendaService{
    @Autowired
    private IViviendaDAO dao;

    @Override
    public void save(Vivienda medicamento) {
        // TODO Auto-generated method stub
        dao.save(medicamento);
    }

    @Override
    public Vivienda findById(Integer id) {
        // TODO Auto-generated method stub
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }

    @Override
    public List<Vivienda> findAll() {
        // TODO Auto-generated method stub
        return (List<Vivienda>) dao.findAll();
    }
}
