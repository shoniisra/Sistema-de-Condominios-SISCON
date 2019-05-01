package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.IProveedorServicioDAO;
import com.demo.siscon.models.entities.ProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServicioService implements IProveedorServicioService {
    @Autowired
    private IProveedorServicioDAO dao;

    @Override
    public void save(ProveedorServicio proveedorServicio) {
        dao.save(proveedorServicio);
    }

    @Override
    public ProveedorServicio findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<ProveedorServicio> findAll() {
        return (List<ProveedorServicio>) dao.findAll();
    }
}
