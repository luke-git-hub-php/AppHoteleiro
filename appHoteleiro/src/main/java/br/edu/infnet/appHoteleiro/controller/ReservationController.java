package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appHoleteiro.model.domain.Guest;
import br.edu.infnet.appHoleteiro.model.domain.Reservation;
import br.edu.infnet.appHoleteiro.model.service.guestService;
import br.edu.infnet.appHoleteiro.model.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private GuestService guestService;
	@Autowired
	private Service_Service service_Service;

	@GetMapping(value = "/reservation/AddScreen")
	public String AddScreen(Model model, @SessionAttribute("user") User user) {

		model.addAttribute("guest", guestService.GetList(user));
		model.addAttribute("service", service_Service.GetList(user));
		
		return "reservation/List";
	}
	
	@PostMapping(value = "/reservation/Create")
	public String Create(Reservation reservation, @SessionAttribute("user") User user) {
		
		System.out.println("Hóspede: " + reservation.getGuest());		
		System.out.println("Serviços: " + reservation.getServices());
		
		reservation.setUser(user);
		
		reservationService.Add(reservation);
		
		return "redirect:/reservation/List";
	}

	
	@GetMapping(value = "/reservation/List")
	public String List(Model model) {
		model.addAttribute("reservation", reservationService.GetList());
		return "reservation/list";
	}
	
	@GetMapping(value = "/reservation/{id}/Delete")
	public String Delete(@PathVariable Integer id) {
		reservationService.Remove(id);
		return "redirect:/reservation/list";
	}
}