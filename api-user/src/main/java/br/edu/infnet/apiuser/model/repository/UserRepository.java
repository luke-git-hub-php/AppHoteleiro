package br.edu.infnet.apiuser.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiuser.model.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByEmail(String email);
	@Query("from User a where a.user.id = :idUser")
	List<User> GetList(Integer userId);
}
