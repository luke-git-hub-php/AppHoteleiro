package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.clients.IAddressClient;
import br.edu.infnet.appHoleteiro.clients.IUserClient;
import br.edu.infnet.appHoleteiro.model.domain.Address;
import br.edu.infnet.appHoleteiro.model.domain.User;
import br.edu.infnet.appHoleteiro.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private IAddressClient addressClient;
	@Autowired
	private IUserClient userClient;

	
	public void Add(User user) {
		userClient.Add(user);
	}
	
	public void Delete(Integer id) {
		userClient.DeleteById(id);
	}
	
	public Collection<User> GetList(){
		return (Collection<User>) userClient.GetList();
	}
	
	public User Validate(String email, String password) {
		User user = userRepository.findByEmail(email);
		
		if(user != null && password.equals(user.getPassword())) {
			return user;
		}
		
		return null;
	}
	
	public Address GetAddressByCEP(String cep) {
		return addressClient.GetCep(cep);
	}
}