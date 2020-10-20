package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Persona;
import com.web.repo.IPersonaRepo;

@Controller
public class WebController {
	
	@Autowired
	private IPersonaRepo repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//logica
		Persona p= new Persona();
		p.setIdPersona(3);
		p.setNombre("Silvia");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		//logica
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}

}
