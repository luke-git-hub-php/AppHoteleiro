package br.edu.infnet.appHoleteiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoleteiro.model.domain.Guest;

@Controller
public class GuestController {
	
	private static Map<Integer, Guest> map = new HashMap<Integer, Guest>();	
	private static int id = 1;

	public static void Add(Guest guest) {
		guest.setId(id++);
		mapa.put(guest.getId(), guest);
		
		System.out.println("> " + guest);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Guest> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Guest/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Guest/List";
	}
	
	@GetMapping(value = "/Guest/{id}/Remove")
	public String RemoveGuest(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Guest/Remove";
	}
}