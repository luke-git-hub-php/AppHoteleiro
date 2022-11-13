package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.Reservation;
import br.edu.infnet.appHoleteiro.model.repository.ReservationRepository;

@Service
public class ReservationService {
	@Autowired 
	private ReservationRepository reservationRepository;
	
	public void Add(Reservation reservation) {
		reservationRepository.Save(reservation);
	}
	
	public void Remove(Integer id) {
		reservationRepository.DeleteById(id);
	}
	
	public Collection<Reservation> GetList(){
		return (Collection<Reservation>) reservationRepository.findAll();
	}
	
	public Optional<Reservation> GetById(Integer id){
		return reservationRepository.findById(id);
	}
}