package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.Service_Service;

@Controller
public class ServiceController {
	
	@Autowired
	private Service_Service service_Service;
	
	@GetMapping(value = "/service/list")
	public String List(Model model) {
		model.addAttribute("serviços", service_Service.GetList());
		return "service/list";
	}
	
	@GetMapping(value = "/service/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		service_Service.Remove(id);
		return "redirect:/service/list";
	}
}