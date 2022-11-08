package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.LeisureService;

@Controller
public class LeisureController {
	
	@Autowired
	private LeisureService leisureService;
	
	@GetMapping(value = "/leisure/list")
	public String List(Model model) {
		model.addAttribute("lazeres", leisureService.GetList());
		return "leisure/list";
	}
	
	@GetMapping(value = "/leisure/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		leisureService.Remove(id);
		return "redirect:/leisure/list";
	}
}