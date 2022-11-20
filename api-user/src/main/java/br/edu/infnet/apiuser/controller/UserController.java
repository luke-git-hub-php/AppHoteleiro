package br.edu.infnet.apiuser.controller;

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

import br.edu.infnet.apiuser.model.domain.User;
import br.edu.infnet.apiuser.model.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/Create")
	public void Create(@RequestBody User user) {
		userService.Add(user);
	}
	
	@DeleteMapping(value = "/{id}/Delete")
	public void Delete(@PathVariable Integer id) {
		userService.Delete(id);
	}
	
	@GetMapping(value = "/List")
	public List<User> List(){
		return userService.GetList();
	}
	
	@PostMapping(value = "/Validate")
	public Usuario Validate(@RequestParam String email, @RequestParam String password) {
		return userService.Validate(email, password);
	}
}
