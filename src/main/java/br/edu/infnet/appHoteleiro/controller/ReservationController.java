package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appHoleteiro.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping(value = "/reservation/list")
	public String List(Model model) {
		model.addAttribute("reservas", reservationService.GetList());
		return "reservation/list";
	}
	
	@GetMapping(value = "/reserva/{id}/delete")
	public String Delete(@PathVariable Integer id) {
		reservationService.Remove(id);
		return "redirect:/reservation/list";
	}
}