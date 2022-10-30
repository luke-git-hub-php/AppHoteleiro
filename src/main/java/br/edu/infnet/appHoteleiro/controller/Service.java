package br.edu.infnet.appHoleteiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoleteiro.model.domain.Service;

@Controller
public class ServiceController {
	
	private static Map<Integer, Guest> map = new HashMap<Integer, Service>();	
	private static int id = 1;

	public static void Add(Service service) {
		service.setId(id++);
		mapa.put(service.getId(), service);
		
		System.out.println("> " + service);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Service> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Service/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Service/List";
	}
	
	@GetMapping(value = "/Service/{id}/Remove")
	public String RemoveService(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Service/Remove";
	}
}