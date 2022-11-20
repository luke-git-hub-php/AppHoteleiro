package br.edu.infnet.apireservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apireservation.model.domain.Reservation;
import br.edu.infnet.apireservation.model.service.ReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;

	@PostMapping(value = "/Create")
	public void Create(@RequestBody Reservation reservation) {
		reservationService.Add(reservation);
	}
	
	@DeleteMapping(value = "/{id}/Delete")
	public void Delete(@PathVariable Integer id) {
		reservationService.Delete(id);
	}
	
	@GetMapping(value = "/List")
	public List<User> List(){
		return reservationService.GetList();
	}
}
