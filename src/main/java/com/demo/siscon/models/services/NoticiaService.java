package com.demo.siscon.models.services;

import com.demo.siscon.models.dao.INoticiaDAO;
import com.demo.siscon.models.entities.Noticia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService implements INoticiaService {
    @Autowired
    private INoticiaDAO dao;

    @Override
    public void save(Noticia noticia) {
        dao.save(noticia);
    }

    @Override
    public Noticia findById(Integer id) {
        return dao.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Noticia> findAll() {
        return (List<Noticia>) dao.findAll();
    }
}
