package br.edu.infnet.appHoleteiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apappHoleteiroppedido.model.domain.User;
import br.edu.infnet.appHoleteiro.model.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/user/list")
	public String List(Model model) {
		model.addAttribute("listagem", userService.GetList());

		return "user/list";
	}
	
	@PostMapping(value = "/user/add")
	public String Add(User user) {
		
		userService.Add(user);
		
		return "redirect:/user/list";
	}
	
	@PostMapping(value = "/usuario/login")
	public String login(HttpSession session, @RequestParam String email, @RequestParam String password) {
		User user = userService.findByEmail(email);
		if (user != null && password.equals(user.GetPassword())) {
			session.setAttribute("usuario", user);
			return "redirect:/";
		}
		return "redirect:/user/login";
	}

	@PostMapping(value = "/user/signup")
	public String SignUp(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
		userService.Add(new User(name, email, password));
		return "redirect:/user/login";
	}
	
	@GetMapping(value = "/user/{id}/delete")
	public String Remove(@PathVariable int id) {

		usuarioService.delete(id);
		
		return "redirect:/user/list";
	}
	
	@GetMapping(value = "/user/logout")
	public String Logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("usuario");
		return "redirect:/user/login";
	}
}