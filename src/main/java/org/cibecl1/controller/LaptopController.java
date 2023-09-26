package org.cibecl1.controller;

import org.cibecl1.repository.ILaptopRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaptopController {
	
	@Autowired
	private ILaptopRpository repo;
	@GetMapping("/listar")
	public String listarLaptop(Model model) {
		model.addAttribute("lstLaptop",repo.findAll());
		return "Listado";
	}
	

}
