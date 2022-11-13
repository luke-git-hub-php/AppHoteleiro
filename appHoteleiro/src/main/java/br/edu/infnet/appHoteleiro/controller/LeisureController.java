package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appHoleteiro.model.domain.Leisure;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.LeisureService;

@Controller
public class LeisureController {
	
	@Autowired
	private LeisureService leisureService;
	
	@GetMapping(value = "/leisure/List")
	public String List(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("leisure", leisureService.GetList(user));
		
		return "leisure/List";
	}
	
	@GetMapping(value = "/leisure/AddScreen")
	public String AddScreen(Model model) {
		model.addAttribute("leisure", leisureService.GetList());
		return "leisure/AddScreen";
	}

	@PostMapping(value = "/leisure/Create")
	public String Create(Leisure leisure) {
			
		leisure.setUser(user);
		leisureService.Add(leisure);
		
		return "redirect:/leisure/List";
	}
	
	@GetMapping(value = "/leisure/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		leisureService.Remove(id);
		return "redirect:/leisure/List";
	}
}