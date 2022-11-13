package br.edu.infnet.appHoteleiro.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appHoteleiro.model.domain.Address;

@FeignClient(url = "https://viacep.com.br/ws", name = "addressClient")
public interface IAddressClient {

	@GetMapping(value = "/{cep}/json")
	public Address GetCep(@PathVariable String cep);
}