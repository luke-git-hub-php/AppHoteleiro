package br.edu.infnet.appHoleteiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoleteiro.model.domain.Leisure;

@Controller
public class FoodController {
	
	private static Map<Integer, Food> map = new HashMap<Integer, Food>();	
	private static int id = 1;

	public static void Add(Food food) {
		food.setId(id++);
		mapa.put(food.getId(), food);
		
		System.out.println("> " + food);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Food> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Food/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Food/List";
	}
	
	@GetMapping(value = "/Food/{id}/Remove")
	public String RemoveFood(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Food/Remove";
	}
}