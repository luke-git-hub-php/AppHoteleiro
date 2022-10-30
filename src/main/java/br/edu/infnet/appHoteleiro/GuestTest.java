package br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.controller.PedidoController;
import br.edu.infnet.apppedido.model.domain.Guest;

@Order(2)
@Component
public class GuesTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de hóspedes ##");
		
		Guest guest1 = new Guest();		
		guest1.setName("Lucas"); 
		guest1.setCpf("955-453-355-22");
		guest1.setCellphone("(85)97366-3529");
		guest.setEmail("lucasvieira@gmail.com");
		guest1.setNumberReversation(1);
		guest1.setServices(firstDayService);
		GuestController.Add(guest1);
		
		Guest guest2 = new Guest();		
		guest2.setName("Carlos"); 
		guest2.setCpf("664-453-355-22");
		guest2.setCellphone("(85)97555-3529");
		guest2.setEmail("carlossilva@gmail.com");
		guest2.setNumberReversation(4);
		guest2.setServices(othersDaysService);
		GuestController.Add(guest2);
	}
}