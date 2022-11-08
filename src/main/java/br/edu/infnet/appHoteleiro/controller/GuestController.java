package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.GuestService;

@Controller
public class GuestController {
	
	@Autowired
	private GuestService guestService;
	
	@GetMapping(value = "/guest/list")
	public String List(Model model) {
		model.addAttribute("hóspede", guestService.GetList());
		return "guest/list";
	}
	
	@GetMapping(value = "/guest/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		guestService.Remove(id);
		return "redirect:/guest/list";
	}
}