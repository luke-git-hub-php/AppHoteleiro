package br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Service;
import br.edu.infnet.apppedido.model.service.Service_Service;

@Order(4)
@Component
public class ServiceTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de serviços ##");
		
		@Autowired
		private Service_Service service_Service;

		Apartment apartment = new Apartment();
		apartment.setNumber(-1);
		apartment.setItens("Toalha de banho","Lençol de cama","TV");
		apartment.setType("Suíte");
		service_Service.Add(apartment);
		
		Food food = new Food();
		food.setName("Lasanha");
		food.setAmount(20.99);
		food.setTime("30/10/2022 12:30:00");
		service_Service.Add(food);
		
		Leisure leisure = new Leisure();
		leisure.setName("Passeio de jeep");
		leisure.setPlace("Canoa Quebrada - CE");
		leisure.setType("Transporte");
		service_Service.Add(leisure);
	}
}