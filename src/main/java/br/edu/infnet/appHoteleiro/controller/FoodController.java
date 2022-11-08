package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.FoodService;

@Controller
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping(value = "/food/list")
	public String List(Model model) {
		model.addAttribute("alimentações", foodService.GetList());
		return "food/list";
	}
	
	@GetMapping(value = "/food/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		foodService.Remove(id);
		return "redirect:/food/list";
	}
}