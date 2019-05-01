package com.demo.siscon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.siscon.models.entities.DetalleGastoComun;
import com.demo.siscon.models.services.IDetalleGastoComunService;

@Controller
@RequestMapping(value="/detallegastocomun")
public class DetalleGastoComunController {
	
	@Autowired
	private IDetalleGastoComunService service; 

	@GetMapping(value="/create")
	public String create(Model model) {
		DetalleGastoComun detallegastocomun = new DetalleGastoComun();
		model.addAttribute("detallegastocomun",detallegastocomun);
		return "detallegastocomun/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		DetalleGastoComun detallegastocomun = service.findById(id);
		model.addAttribute("detallegastocomun",detallegastocomun);
		return "detallegastocomun/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		DetalleGastoComun detallegastocomun = service.findById(id);
		model.addAttribute("detallegastocomun",detallegastocomun);
		return "detallegastocomun/form";
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
		return "redirect:/detallegastocomun/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<DetalleGastoComun> detallegastoscomunes = service.findAll();
		model.addAttribute("lista", detallegastoscomunes);
		return "detallegastocomun/list";		
	}
	
	@PostMapping(value="/save")
	public String save(DetalleGastoComun detallegastocomun, Model model) {
		try {
			service.save(detallegastocomun);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/detallegastocomun/list";
	}
}
