package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Leisure;

import br.edu.infnet.appHoleteiro.model.domain.Leisure;
import br.edu.infnet.appHoleteiro.model.repository.LeisureRepository;

@Service
public class LeisureService {
	@Autowired 
	private LeisureRepository leisureRepository;
	
	public void Add(Leisure leisure) {
		leisureRepository.Save(leisure);
	}
	
	public void Remove(Integer id) {
		leisureRepository.DeleteById(id);
	}
	
	public Collection<Leisure> GetList(){
		return (Collection<Leisure>) leisureRepository.findAll();
	}
	
	public Optional<Leisure> GetById(Integer id){
		return leisureRepository.findById(id);
	}
}