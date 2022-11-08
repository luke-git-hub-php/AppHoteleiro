package br.edu.infnet.appHoleteiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.model.service.UserService;

@Order(1)
@Component
public class UserTest implements ApplicationRunner {

	@Autowired
	private UserService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Usuários ##");
		
		User user = new User();
		user.setEmail("admin@admin.com");
		user.setName("Administrador");
		user.setPassword("123");
		userService.Add(user);
	}
}