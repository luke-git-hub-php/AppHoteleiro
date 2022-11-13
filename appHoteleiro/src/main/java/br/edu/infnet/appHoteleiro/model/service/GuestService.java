package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Guest;

import br.edu.infnet.appHoleteiro.model.domain.Guest;
import br.edu.infnet.appHoleteiro.model.repository.GuestRepository;

@Service
public class GuestService {
	@Autowired 
	private GuestRepository guestRepository;
	
	public void Add(Guest guest) {
		guestRepository.Save(guest);
	}
	
	public void Remove(Integer id) {
		guestRepository.DeleteById(id);
	}
	
	public Collection<Guest> GetList(){
		return (Collection<Guest>) guestRepository.findAll();
	}
	
	public Optional<Guest> GetById(Integer id){
		return guestRepository.findById(id);
	}
}