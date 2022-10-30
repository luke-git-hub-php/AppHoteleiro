package br.edu.infnet.appHoleteiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoleteiro.model.domain.Apartment;

@Controller
public class ApartmentController {
	
	private static Map<Integer, Apartment> map = new HashMap<Integer, Apartment>();	
	private static int id = 1;

	public static void Add(Apartment apartment) {
		apartment.setId(id++);
		mapa.put(apartment.getId(), apartment);
		
		System.out.println("> " + apartment);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Apartment> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Apartment/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Apartment/List";
	}
	
	@GetMapping(value = "/Apartment/{id}/Remove")
	public String RemoveApartment(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Apartment/Remove";
	}
}