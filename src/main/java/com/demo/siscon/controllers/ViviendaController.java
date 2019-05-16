package com.demo.siscon.controllers;
import com.demo.siscon.models.entities.Vivienda;
import com.demo.siscon.models.services.IViviendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping(value="/vivienda")
public class ViviendaController {

    @Autowired
    //private IViviendaDAO service;
    private IViviendaService service;


    @GetMapping(value="/create" )
    public String create(Model model){
        Vivienda vivienda=new Vivienda();
        model.addAttribute("title","Registro de nuevo vivienda");
        model.addAttribute("vivienda",vivienda);
        return "vivienda/form";
    }

    @PostMapping(value="/save" )
    public String save(Vivienda vivienda, BindingResult result,
                       Model model,
                       RedirectAttributes message, SessionStatus session){
        try{
            if(result.hasErrors()) {
                return "vivienda/form";
            }
            String msg = vivienda.getIdVivienda() == null ? vivienda.getCodigoVivienda() + " ha sido agregado." : vivienda.getCodigoVivienda() + " ha sido actualizado.";

            service.save(vivienda);
            session.setComplete();
            message.addFlashAttribute("success", msg);
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
        model.addAttribute("title","Actualización de vivienda: " + vivienda.getCodigoVivienda());
        return "vivienda/form";
    }

    @GetMapping(value="/delete/{id}" )
    public String delete(@PathVariable(value = "id") Integer id,
                         Model model, RedirectAttributes message){
        try{
            service.delete(id);
            message.addFlashAttribute("success", "Vivienda eliminado correctamente");

        }catch (Exception ex){
            model.addAttribute("error: ",ex.toString());
        }
        return "redirect:/vivienda/list";
    }

    @GetMapping(value="/list" )
    public String list(Model model){
        List<Vivienda> viviendas=service.findAll();
        model.addAttribute("lista",viviendas);
        model.addAttribute("title","Listado de viviendas");
        return "vivienda/list";
    }
}