package com.demo.siscon.controllers;

import com.demo.siscon.models.entities.ProveedorServicio;
import com.demo.siscon.models.services.IProveedorServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/proveedorservicio")
public class ProveedorServicioController {

    @Autowired
    private IProveedorServicioService service;

    @GetMapping(value = "/create")
    public String create(Model model){
        ProveedorServicio proveedorServicio = new ProveedorServicio();
        model.addAttribute("proveedorservicio", proveedorServicio);
        return "proveedorservicio/form";
    }

    @PostMapping(value="/save" )
    public String save(ProveedorServicio proveedorServicio,Model model){
        try{
            service.save(proveedorServicio);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/proveedorservicio/list";
    }
    @GetMapping(value="/retrieve/{id}" )
    public String retrieve(@PathVariable(value = "id") Integer id,
                           Model model){
        ProveedorServicio proveedorServicio=service.findById(id);
        model.addAttribute("proveedorservicio",proveedorServicio);
        return "proveedorservicio/card";
    }
    @GetMapping(value="/update/{id}" )
    public String update(@PathVariable(value = "id") Integer id,
                         Model model){
        ProveedorServicio proveedorServicio=service.findById(id);
        model.addAttribute("proveedorservicio",proveedorServicio);
        return "proveedorservicio/form";
    }
    @GetMapping(value="/delete" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model){
        try{
            service.delete(id);
        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }

        return "redirect:/proveedorservicio/List";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<ProveedorServicio> proveedoresServicio=service.findAll();
        model.addAttribute("lista",proveedoresServicio);
        return "proveedorservicio/list";
    }

}
