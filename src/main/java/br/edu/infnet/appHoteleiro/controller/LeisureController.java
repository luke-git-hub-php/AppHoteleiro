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
public class LeisureController {
	
	private static Map<Integer, Leisure> map = new HashMap<Integer, Leisure>();	
	private static int id = 1;

	public static void Add(Leisure leisure) {
		leisure.setId(id++);
		mapa.put(leisure.getId(), leisure);
		
		System.out.println("> " + leisure);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Leisure> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Leisure/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Leisure/List";
	}
	
	@GetMapping(value = "/Leisure/{id}/Remove")
	public String RemoveLeisure(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Leisure/Remove";
	}
}