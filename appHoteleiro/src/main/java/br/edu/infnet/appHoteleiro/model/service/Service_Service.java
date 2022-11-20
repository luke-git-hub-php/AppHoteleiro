package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appHoleteiro.model.domain.Service;
import br.edu.infnet.appHoleteiro.clients.IServiceClient;

@Service
public class Service_Service {

	@Autowired
	private IServiceClient serviceClient;
	
	public void Add(Service service) {
		serviceClient.Save(service);
	}
	
	public void Remove(Integer id) {
		serviceClient.DeleteById(id);
	}
	
	public Collection<Service> GetList(){
		return (Collection<Service>) serviceClient.findAll();
	}
}