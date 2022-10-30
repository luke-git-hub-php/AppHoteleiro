package br.edu.infnet.appHoleteiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoleteiro.model.domain.Reservation;

@Controller
public class ReservationController {
	
	private static Map<Integer, Reservation> map = new HashMap<Integer, Reservation>();	
	private static int id = 1;

	public static void Add(Reservation reservation) {
		reservation.setId(id++);
		mapa.put(reservation.getId(), reservation);
		
		System.out.println("> " + reservation);
	}
	
	public static void Remove(int id) {
		mapa.remove(id);
	}
	
	public static Collection<Reservation> getList(){
		return mapa.values();
	}
		
	@GetMapping(value = "/Reservation/List")
	public String ScreenList(Model model) {
		model.addAttribute("List", getList());

		return "Reservation/List";
	}
	
	@GetMapping(value = "/Reservation/{id}/Remove")
	public String RemoveReservation(@PathVariable int id) {

		Remove(id);
		
		return "redirect:/Reservation/Remove";
	}
}