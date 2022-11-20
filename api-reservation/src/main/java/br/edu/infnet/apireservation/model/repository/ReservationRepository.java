package br.edu.infnet.apireservation.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apireservations.model.domain.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
	@Query("from Reservation a where a.user.id = :idUser")
	List<Reservation> GetList(Integer userId);
}
