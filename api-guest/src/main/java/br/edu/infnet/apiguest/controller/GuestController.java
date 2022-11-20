package br.edu.infnet.apiguest.controller;

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

import br.edu.infnet.apiguest.model.domain.Guest;
import br.edu.infnet.apiguest.model.service.GuestService;

@RestController
@RequestMapping("/api/guest")
public class GuestController {
	
	@Autowired
	private GuestService guestService;

	@PostMapping(value = "/Create")
	public void Create(@RequestBody Guest guest) {
		guestService.Add(guest);
	}
	
	@DeleteMapping(value = "/{id}/Delete")
	public void Delete(@PathVariable Integer id) {
		guestService.Delete(id);
	}
	
	@GetMapping(value = "/List")
	public List<Guest> List(){
		return guestService.GetList();
	}
}
