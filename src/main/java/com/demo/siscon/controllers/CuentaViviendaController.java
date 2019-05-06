package com.demo.siscon.controllers;

import com.demo.siscon.models.entities.CuentaVivienda;
import com.demo.siscon.models.services.ICuentaViviendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/cuentavivienda")
public class CuentaViviendaController {

    @Autowired
    private ICuentaViviendaService service;

    @GetMapping(value = "/create")
    public String create(Model model){
        CuentaVivienda cuentavivienda = new CuentaVivienda();
        model.addAttribute("cuentavivienda", cuentavivienda);
        return "cuentavivienda/form";
    }

    @PostMapping(value="/save" )
    public String save(CuentaVivienda cuentavivienda,Model model){
        try{
            service.save(cuentavivienda);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/cuentavivienda/list";
    }
    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        CuentaVivienda cuentavivienda=service.findById(id);
        model.addAttribute("cuentavivienda",cuentavivienda);
        return "cuentavivienda/card";
    }
    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        CuentaVivienda cuentavivienda=service.findById(id);
        model.addAttribute("cuentavivienda",cuentavivienda);
        return "cuentavivienda/form";
    }
    @GetMapping(value="/delete/{id}" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/cuentavivienda/List";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<CuentaVivienda> cuentaviviendas=service.findAll();
        model.addAttribute("lista",cuentaviviendas);
        return "cuentavivienda/list";
    }

}

