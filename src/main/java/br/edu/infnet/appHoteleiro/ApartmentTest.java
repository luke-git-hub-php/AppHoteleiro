package br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Apartment;
import br.edu.infnet.apppedido.model.service.ApartmentService;

@Order(7)
@Component
public class ApartmentTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de apartamentos ##");
		
		@Autowired
		private ApartmentService apartmentService;
		
		Apartment apartment1 = new Apartment();
		apartment1.setNumber(-2);
		apartment1.setItens("Fligobar","Ar condicionado","TV");
		apartment1.setType("Normal");
		apartmentService.Add(apartment1);
	
		Apartment apartment2 = new Apartment();
		apartment2.setNumber(-1);
		apartment2.setItens("Toalha de banho","Lençol de cama","TV");
		apartment2.setType("Suíte");
		apartmentService.Add(apartment2);
		
		Apartment apartment3 = new Apartment();
		apartment3.setNumber(1);
		apartment3.setItens("Cama de casal","Decoração personalizada","Video game");
		apartment3.setType("Normal");
		apartmentService.Add(apartment3);
	}
}