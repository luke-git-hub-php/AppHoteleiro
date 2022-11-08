package br.edu.infnet.appHoleteiro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appHoleteiro.model.domain.Leisure;

@Repository
public interface LeisureRepository extends CrudRepository<Leisure, Integer>{

}