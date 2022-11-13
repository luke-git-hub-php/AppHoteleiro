package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appHoleteiro.model.domain.Apartment;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.ApartmentService;

@Controller
public class ApartmentController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@GetMapping(value = "/apartment/List")
	public String List(Model model) {

		model.addAttribute("apartment", apartmentService.GetList(user));
		
		return "apartment/List";
	}
	
	@GetMapping(value = "/apartment/AddScreen")
	public String AddScreen(Model model) {
		model.addAttribute("food", apartmentService.GetList());
		return "apartment/AddScreen";
	}

	@PostMapping(value = "/apartment/Create")
	public String Create(Apartment apartment, @SessionAttribute("user") User user) {
			
		food.setUser(user);
		apartmentService.Add(apartment);
		
		return "redirect:/apartment/List";
	}
	
	@GetMapping(value = "/apartment/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		apartmentService.Remove(id);
		return "redirect:/apartment/List";
	}
}