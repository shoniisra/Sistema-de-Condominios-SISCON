package com.demo.siscon.controllers;

import com.demo.siscon.models.entities.Propietario;
import com.demo.siscon.models.services.IPropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/propietario")
public class PropietarioController {

    @Autowired
    private IPropietarioService service;

    @GetMapping(value = "/create")
    public String create(Model model){
        Propietario propietario = new Propietario();
        model.addAttribute("propietario", propietario);
        return "propietario/form";
    }

    @PostMapping(value="/save" )
    public String save(Propietario propietario,Model model){
        try{
            service.save(propietario);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/propietario/list";
    }
    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        Propietario propietario=service.findById(id);
        model.addAttribute("propietario",propietario);
        return "propietario/card";
    }
    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        Propietario propietario=service.findById(id);
        model.addAttribute("propietario",propietario);
        return "propietario/form";
    }
    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/propietario/List";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Propietario> propietarios=service.findAll();
        model.addAttribute("lista",propietarios);
        return "propietario/list";
    }

}
