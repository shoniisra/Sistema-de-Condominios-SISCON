package com.demo.siscon.controllers;

import com.demo.siscon.models.entities.Vivienda;
import com.demo.siscon.models.services.IViviendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/vivienda")
public class ViviendaController {

    @Autowired
    private IViviendaService service;

    @GetMapping(value = "/create")
    public String create(Model model){
        Vivienda vivienda = new Vivienda();
        model.addAttribute("vivienda", vivienda);
        return "vivienda/form";
    }

    @PostMapping(value="/save" )
    public String save(Vivienda vivienda,Model model){
        try{
            service.save(vivienda);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/vivienda/list";
    }
    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Vivienda vivienda=service.findById(id);
        model.addAttribute("vivienda",vivienda);
        return "vivienda/card";
    }
    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Vivienda vivienda=service.findById(id);
        model.addAttribute("vivienda",vivienda);
        return "vivienda/form";
    }
    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/vivienda/List";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Vivienda> viviendas=service.findAll();
        model.addAttribute("lista",viviendas);
        return "vivienda/list";
    }

}
