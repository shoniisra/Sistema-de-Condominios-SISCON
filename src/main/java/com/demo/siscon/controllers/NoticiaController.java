package com.demo.siscon.controllers;

import com.demo.siscon.models.entities.Noticia;
import com.demo.siscon.models.services.INoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/noticia")
public class NoticiaController {

    @Autowired
    private INoticiaService service;

    @GetMapping(value = "/create")
    public String create(Model model){
        Noticia noticia = new Noticia();
        model.addAttribute("noticia", noticia);
        return "noticia/form";
    }

    @PostMapping(value="/save" )
    public String save(Noticia noticia,Model model){
        try{
            service.save(noticia);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/noticia/list";
    }
    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Noticia noticia=service.findById(id);
        model.addAttribute("noticia",noticia);
        return "noticia/card";
    }
    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Noticia noticia=service.findById(id);
        model.addAttribute("noticia",noticia);
        return "noticia/form";
    }
    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/noticia/List";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Noticia> noticias=service.findAll();
        model.addAttribute("lista",noticias);
        return "noticia/list";
    }

}
