package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.IServicioDAO;
import com.demo.siscon.models.entities.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService implements IServicioService {
    @Autowired
    private IServicioDAO dao;

    @Override
    public void save(Servicio servicio) {
        dao.save(servicio);
    }

    @Override
    public Servicio findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Servicio> findAll() {
        return (List<Servicio>) dao.findAll();
    }
}
