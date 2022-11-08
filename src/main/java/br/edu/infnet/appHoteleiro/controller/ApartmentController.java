package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.ApartmentService;

@Controller
public class ApartmentController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@GetMapping(value = "/apartment/list")
	public String List(Model model) {
		model.addAttribute("apartamentos", apartmentService.GetList());
		return "apartment/list";
	}
	
	@GetMapping(value = "/apartment/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		apartmentService.Remove(id);
		return "redirect:/apartment/list";
	}
}