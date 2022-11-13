package br.edu.infnet.apiuser.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import br.edu.infnet.apiusuario.model.domain.User;
import br.edu.infnet.apiusuario.model.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void Add(User user) {
		usuarioRepository.save(usuario);
	}

	public void Delete(Integer id) {
		userRepository.deleteById(id);
	}

	public Collection<User> GetList(){

		return (List<User>) userRepository.findAll();
	}

	public User Validate(String email, String password) {
		
		User user = userRepository.findByEmail(email);
		
		if(user != null && password.equals(user.getPassword())) {
			return user;
		}
		
		return null;
	}
}