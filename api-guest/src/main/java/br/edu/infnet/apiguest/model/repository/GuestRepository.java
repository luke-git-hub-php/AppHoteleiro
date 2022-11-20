package br.edu.infnet.apiguest.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiguest.model.domain.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Integer> {
	@Query("from Guest a where a.user.id = :idUser")
	List<Guest> GetList(Integer userId);
}
