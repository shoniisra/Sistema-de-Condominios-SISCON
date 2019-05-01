package com.demo.siscon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.siscon.models.entities.Condominio;
import com.demo.siscon.models.services.ICondominioService;
@Controller
@RequestMapping(value="/condominio")
public class CondominioController {

	@Autowired
	private ICondominioService service; 
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Condominio condominio = new Condominio();
		model.addAttribute("condominio",condominio);
		return "condominio/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		Condominio condominio = service.findById(id);
		model.addAttribute("condominio",condominio);
		return "condominio/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		Condominio condominio = service.findById(id);
		model.addAttribute("condominio",condominio);
		return "condominio/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id")Integer id, 
			Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex){
			model.addAttribute("error", ex.toString());
		}
		return "redirect:/condominio/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Condominio> condominios = service.findAll();
		model.addAttribute("lista", condominios);
		return "condominio/list";		
	}
	
	@PostMapping(value="/save")
	public String save(Condominio condominio, Model model) {
		try {
			service.save(condominio);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/condominio/list";
	}
}
