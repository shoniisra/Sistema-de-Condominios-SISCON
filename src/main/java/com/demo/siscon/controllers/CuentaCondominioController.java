package com.demo.siscon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.siscon.models.entities.CuentaCondominio;
import com.demo.siscon.models.services.ICuentaCondominioService;


@Controller
@RequestMapping(value="/cuentacondominio")
public class CuentaCondominioController {

	@Autowired
	private ICuentaCondominioService service; 
	
	@GetMapping(value="/create")
	public String create(Model model) {
		CuentaCondominio cuentacondominio = new CuentaCondominio();
		model.addAttribute("cuentacondominio",cuentacondominio);
		return "cuentacondominio/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, 
			Model model) {
		CuentaCondominio cuentacondominio = service.findById(id);
		model.addAttribute("cuentacondominio",cuentacondominio);
		return "cuentacondominio/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id,
			Model model) {
		CuentaCondominio cuentacondominio = service.findById(id);
		model.addAttribute("cuentacondominio",cuentacondominio);
		return "cuentacondominio/form";
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
		return "redirect:/cuentacondominio/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<CuentaCondominio> cuentacondominios = service.findAll();
		model.addAttribute("lista", cuentacondominios);
		return "cuentacondominio/list";		
	}
	
	@PostMapping(value="/save")
	public String save(CuentaCondominio cuentacondominio, Model model) {
		try {
			service.save(cuentacondominio);
		}
		catch(Exception ex) {
			model.addAttribute("error", ex.toString());
		}	
		return "redirect:/cuentacondominio/list";
	}
}
