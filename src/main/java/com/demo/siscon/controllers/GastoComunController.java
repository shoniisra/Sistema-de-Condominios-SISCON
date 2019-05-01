package com.demo.siscon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.siscon.models.entities.GastoComun;
import com.demo.siscon.models.services.IGastoComunService;

@Controller
@RequestMapping(value="/gastocomun")
public class GastoComunController {
	
	@Autowired
	private IGastoComunService service; 
	
	@GetMapping(value="/create")
	public String create(Model model) {
		GastoComun gastocomun = new GastoComun();
		model.addAttribute("gastocomun",gastocomun);
		return "gastocomun/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		GastoComun gastocomun = service.findById(id);
		model.addAttribute("gastocomun",gastocomun);
		return "gastocomun/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		GastoComun gastocomun = service.findById(id);
		model.addAttribute("gastocomun",gastocomun);
		return "gastocomun/form";
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
		return "redirect:/gastocomun/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<GastoComun> gastoscomunes = service.findAll();
		model.addAttribute("lista", gastoscomunes);
		return "gastocomun/list";		
	}
	
	@PostMapping(value="/save")
	public String save(GastoComun gastocomun, Model model) {
		try {
			service.save(gastocomun);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/gastocomun/list";
	}

}
