package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appHoleteiro.model.domain.Guest;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.GuestService;

@Controller
public class GuestController {
	
	@Autowired
	private GuestService guestService;
	
	@GetMapping(value = "/guest/List")
	public String List(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("guest", guestService.GetList(user));
		
		return "guest/List";
	}
	
	@GetMapping(value = "/guest/AddScreen")
	public String AddScreen(Model model) {
		model.addAttribute("guest", guestService.GetList());
		return "guest/AddScreen";
	}

	@PostMapping(value = "/guest/Create")
	public String Create(Guest guest, @SessionAttribute("user") User user) {
			
		guest.setUser(user);
		guestService.Add(guest);
		
		return "redirect:/guest/List";
	}
	
	@GetMapping(value = "/guest/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		guestService.Remove(id);
		return "redirect:/guest/List";
	}
}