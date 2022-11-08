package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.model.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	private UserRepository userRepository;
	
	public void Add(User user) {
		userRepository.Save(user);
	}
	
	public void Remove(Integer id) {
		userRepository.DeleteById(id);
	}
	
	public Collection<User> GetList(){
		return (Collection<User>) userRepository.findAll();
	}
	
	public User Validate(String email, String password) {
		User user = userRepository.findByEmail(email);
		
		if(user != null && password.equals(user.getPassword())) {
			return user;
		}
		
		return null;
	}
}