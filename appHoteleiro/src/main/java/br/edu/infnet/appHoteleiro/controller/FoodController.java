package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appHoleteiro.model.domain.Food;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.FoodService;

@Controller
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@GetMapping(value = "/food/List")
	public String List(Model model) {

		model.addAttribute("food", foodService.GetList(user));
		
		return "leisure/List";
	}
	
	@GetMapping(value = "/food/AddScreen")
	public String AddScreen(Model model) {
		model.addAttribute("food", foodService.GetList());
		return "food/AddScreen";
	}

	@PostMapping(value = "/food/Create")
	public String Create(Food food, @SessionAttribute("user") User user) {
			
		food.setUser(user);
		foodService.Add(food);
		
		return "redirect:/food/List";
	}
	
	@GetMapping(value = "/food/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		leisureService.Remove(id);
		return "redirect:/food/List";
	}
}