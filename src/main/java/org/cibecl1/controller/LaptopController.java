package org.cibecl1.controller;

import org.cibecl1.model.Laptop;
import org.cibecl1.repository.ILaptopRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LaptopController {
	
	@Autowired
	private ILaptopRpository repo;
	@GetMapping("/listar")
	public String listarLaptop(Model model) {
		model.addAttribute("lstLaptop",repo.findAll());
		return "Listado";
	}
	@GetMapping("/cargar")
	public String CargarLapto(Model model) {
		Laptop lap = new Laptop();
		model.addAttribute("laptop", lap );
		return "crudlaptop";
	}
	 @PostMapping("/Grabar")
	 public String grabarLaptop(@ModelAttribute Laptop Laptop) {
		 repo.save(Laptop);
		 return "Exito";
	 }

}
