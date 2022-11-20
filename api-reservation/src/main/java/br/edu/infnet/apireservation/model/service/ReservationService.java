package br.edu.infnet.apireservation.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import br.edu.infnet.apireservation.model.domain.Reservation;
import br.edu.infnet.apireservation.model.repository.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	public void Add(Reservation reservation) {
		reservationRepository.save(reservation);
	}

	public void Delete(Integer id) {
		reservationRepository.deleteById(id);
	}

	public Collection<Reservation> GetList(){

		return (List<Reservation>) reservationRepository.findAll();
	}
}