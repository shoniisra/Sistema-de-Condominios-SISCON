package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.ICuentaViviendaDAO;
import com.demo.siscon.models.entities.CuentaVivienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CuentaViviendaService implements ICuentaViviendaService{
    @Autowired
    private ICuentaViviendaDAO dao;

    @Override
    public void save(CuentaVivienda medicamento) {
        // TODO Auto-generated method stub
        dao.save(medicamento);
    }

    @Override
    public CuentaVivienda findById(Integer id) {
        // TODO Auto-generated method stub
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        dao.deleteById(id);
    }

    @Override
    public List<CuentaVivienda> findAll() {
        // TODO Auto-generated method stub
        return (List<CuentaVivienda>) dao.findAll();
    }
}
