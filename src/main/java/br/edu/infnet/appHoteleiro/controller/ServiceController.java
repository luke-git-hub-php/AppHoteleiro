package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appHoleteiro.model.domain.Service;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.Service_Service

@Controller
public class ServiceController {
	
	@Autowired
	private Service_Service service_Service;
	
	@GetMapping(value = "/service/List")
	public String List(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("service", service_Service.GetList(user));
		
		return "service/List";
	}
	
	@GetMapping(value = "/service/AddScreen")
	public String AddScreen(Model model) {
		model.addAttribute("service", service_Service.GetList());
		return "service/AddScreen";
	}

	@PostMapping(value = "/service/Create")
	public String Create(Service service, @SessionAttribute("user") User user) {

		service.setUser(user);
		service_Service.Add(service);
		
		return "redirect:/service/List";
	}
	
	@GetMapping(value = "/service/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		service_Service.Remove(id);
		return "redirect:/service/List";
	}
}