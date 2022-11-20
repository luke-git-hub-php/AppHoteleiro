package br.edu.infnet.apiservice.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiservice.model.domain.Service;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Integer> {
	@Query("from Service a where a.user.id = :idUser")
	List<Service> GetList(Integer userId);
}
