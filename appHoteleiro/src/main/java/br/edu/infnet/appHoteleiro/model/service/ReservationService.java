package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.Reservation;
import br.edu.infnet.appHoleteiro.clients.IReservationClient;

@Service
public class ReservationService {

	@Autowired
	private IReservationClient reservationClient;
	
	public void Add(Reservation reservation) {
		reservationClient.Save(reservation);
	}
	
	public void Remove(Integer id) {
		reservationClient.DeleteById(id);
	}
	
	public Collection<Reservation> GetList(){
		return (Collection<Reservation>) reservationClient.findAll();
	}
}