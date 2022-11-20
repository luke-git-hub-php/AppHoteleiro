package br.edu.infnet.apiguest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import br.edu.infnet.apiguest.model.domain.Guest;
import br.edu.infnet.apiguest.model.repository.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository guestRepository;

	public void Add(Guest guest) {
		guestRepository.save(usuario);
	}

	public void Delete(Integer id) {
		guestRepository.deleteById(id);
	}

	public Collection<Guest> GetList(){

		return (List<Guest>) guestRepository.findAll();
	}
}