package br.edu.infnet.appHoleteiro.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appHoleteiro.model.domain.Address;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/user/List")
	public String List(Model model) {
		model.addAttribute("list", userService.GetList());

		return "user/list";
	}
	
	@PostMapping(value = "/user/AddScreen")
	public String AddScreen(User user) {
		
		userService.Add(user);
		
		return "redirect:/user/list";
	}
	
	@PostMapping(value = "/usuario/Login")
	public String Login(HttpSession session, @RequestParam String email, @RequestParam String password) {
		User user = userService.findByEmail(email);
		if (user != null && password.equals(user.GetPassword())) {
			session.setAttribute("user", user);
			return "redirect:/";
		}
		return "redirect:/user/Login";
	}

	@PostMapping(value = "/user/Signup")
	public String SignUp(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
		userService.Add(new User(name, email, password));
		return "redirect:/user/login";L
	}
	
	@GetMapping(value = "/user/{id}/Delete")
	public String Delete(@PathVariable int id) {

		usuarioService.delete(id);
		
		return "redirect:/user/list";
	}
	
	@GetMapping(value = "/user/logout")
	public String Logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/user/login";
	}
	
	@PostMapping(value = "/GetCEP")
	public String GetCEP(Model model, @RequestParam String cep) {
		Address address = userService.GetAddressByCEP(cep);
		model.addAttribute("address", address);
		return "user/Add";
	}
}