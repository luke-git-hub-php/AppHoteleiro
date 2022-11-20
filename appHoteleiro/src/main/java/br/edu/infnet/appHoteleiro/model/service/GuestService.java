package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.Guest;
import br.edu.infnet.appHoleteiro.clients.IGuestClient;

@Service
public class GuestService {

	@Autowired
	private IGuestClient guestClient;
	
	public void Add(Guest guest) {
		guestClient.Save(guest);
	}
	
	public void Remove(Integer id) {
		guestClient.DeleteById(id);
	}
	
	public Collection<Guest> GetList(){
		return (Collection<Guest>) guestClient.findAll();
	}
}