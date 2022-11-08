package br.edu.infnet.appHoleteiro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appHoleteiro.model.domain.Service;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Integer>{

}