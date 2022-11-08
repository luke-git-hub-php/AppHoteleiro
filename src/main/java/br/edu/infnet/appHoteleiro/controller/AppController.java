package br.edu.infnet.appHoleteiro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.model.service.UserService;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value = "/")
	public String HomeScreen() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String Login() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String Login(Model model, @RequestParam String email, @RequestParam String password) {
		
		User user = userService.Validate(email, password);
		
		if(user != null) {
			
			model.addAttribute("user", user);
			
			return "home";
		}
		
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String Logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}
}