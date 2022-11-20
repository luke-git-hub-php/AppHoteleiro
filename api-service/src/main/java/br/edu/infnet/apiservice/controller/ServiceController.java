package br.edu.infnet.apiservice.controller;

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

import br.edu.infnet.apiservice.model.domain.Service;
import br.edu.infnet.apiservice.model.service.Service_Service;

@RestController
@RequestMapping("/api/guest")
public class ServiceController {
	
	@Autowired
	private Service_Service service_Service;

	@PostMapping(value = "/Create")
	public void Create(@RequestBody Service service) {
		service_Service.Add(service);
	}
	
	@DeleteMapping(value = "/{id}/Delete")
	public void Delete(@PathVariable Integer id) {
		service_Service.Delete(id);
	}
	
	@GetMapping(value = "/List")
	public List<Service> List(){
		return service_Service.GetList();
	}
}
