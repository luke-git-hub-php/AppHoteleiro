package br.edu.infnet.apiservice.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import br.edu.infnet.apiservice.model.domain.Service;
import br.edu.infnet.apiservice.model.repository.ServiceRepository;

@Service
public class Service_Service {
	
	@Autowired
	private ServiceRepository serviceRepository;

	public void Add(Service service) {
		serviceRepository.save(service);
	}

	public void Delete(Integer id) {
		serviceRepository.deleteById(id);
	}

	public Collection<Guest> GetList(){

		return (List<Service>) serviceRepository.findAll();
	}
}