package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Apartment;

import br.edu.infnet.appHoleteiro.model.domain.ApartmentService;
import br.edu.infnet.appHoleteiro.model.repository.ApartmentRepository;

@Service
public class ApartmentService {
	@Autowired 
	private ApartmentRepository apartmentRepository;
	
	public void Add(Apartment apartment) {
		apartmentRepository.Save(leisure);
	}
	
	public void Remove(Integer id) {
		apartmentRepository.DeleteById(id);
	}
	
	public Collection<Apartment> GetList(){
		return (Collection<Apartment>) apartmentRepository.findAll();
	}
	
	public Optional<Apartment> GetById(Integer id){
		return apartmentRepository.findById(id);
	}
}