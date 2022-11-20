package br.edu.infnet.appHoteleiro.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appHoteleiro.model.domain.Reservation;

@FeignClient(url = "localhost:8081/api/reservation", name = "reservationClient")
public interface IReservationClient {

	@PostMapping(value = "/add")
	public void Add(@RequestBody Reservation reservation);
	
	@DeleteMapping(value = "/{id}/delete")
	public void Delete(@PathVariable Integer id);
	
	@GetMapping(value = "/get")
	public List<Reservation> getList();
}