package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.Service;
import br.edu.infnet.appHoleteiro.model.repository.ServiceRepository;

@Service
public class Service_Service {
	@Autowired 
	private ServiceRepository serviceRepository;
	
	public void Add(Service service) {
		serviceRepository.Save(service);
	}
	
	public void Remove(Integer id) {
		serviceRepository.DeleteById(id);
	}
	
	public Collection<Service> GetList(){
		return (Collection<Service>) serviceRepository.findAll();
	}
	
	public Optional<Service> GetById(Integer id){
		return serviceRepository.findById(id);
	}
}