package br.edu.infnet.appHoteleiro.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appHoteleiro.model.domain.Usuario;

@FeignClient(url = "localhost:8081/api/user", name = "userClient")
public interface IUserClient {

	@PostMapping(value = "/add")
	public void Add(@RequestBody Usuario usuario);
	
	@DeleteMapping(value = "/{id}/delete")
	public void Delete(@PathVariable Integer id);
	
	@GetMapping(value = "/get")
	public List<User> getList();
	
	@PostMapping(value = "/validate")
	public User Validate(@RequestParam String email, @RequestParam String password);
}