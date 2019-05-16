package com.demo.siscon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class HomeController {

	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("title", "Siscon APP");
		model.addAttribute("framework", "Sistema de Condominios y Alicuotas");
		model.addAttribute("description", "Se define como el proceso de identificación del listado exacto de los medicamentos que el paciente consume desde su casa, e incluye el nombre, dosis, frecuencia y vía de administración y la comparación con la lista de medicamentos ordenados por el médico durante la atención médica con el fin de establecer finalmente un listado único de medicamentos para el manejo intra hospitalario o ambulatorio de cada paciente");
		return "home";
	}
	@GetMapping(value="/home")
	public String index(Model model) {
		model.addAttribute("title", "Control Médico");
		model.addAttribute("framework", "Reconciliación medicamentosa");
		model.addAttribute("description", "Se define como el proceso de identificación del listado exacto de los medicamentos que el paciente consume desde su casa, e incluye el nombre, dosis, frecuencia y vía de administración y la comparación con la lista de medicamentos ordenados por el médico durante la atención médica con el fin de establecer finalmente un listado único de medicamentos para el manejo intra hospitalario o ambulatorio de cada paciente");
		return "index";
	}
	@GetMapping(value="/error")
	public String error(Model model) {
		model.addAttribute("title", "Control Médico");
		model.addAttribute("framework", "Reconciliación medicamentosa");
		model.addAttribute("description", "Se define como el proceso de identificación del listado exacto de los medicamentos que el paciente consume desde su casa, e incluye el nombre, dosis, frecuencia y vía de administración y la comparación con la lista de medicamentos ordenados por el médico durante la atención médica con el fin de establecer finalmente un listado único de medicamentos para el manejo intra hospitalario o ambulatorio de cada paciente");
		return "error";
	}
	
}
