package br.edu.infnet.appHoleteiro.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appHoleteiro.model.domain.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{
	@Query("from Reservation p where p.user.id =:userid")
	List<Reservation> GetList(Integer userid);
}