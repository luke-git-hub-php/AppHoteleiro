package br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.controller.PedidoController;
import br.edu.infnet.apppedido.model.domain.Reservation;
import br.edu.infnet.apppedido.model.domain.Guest;
import br.edu.infnet.apppedido.model.domain.Service;
import br.edu.infnet.apppedido.model.domain.Apartment;
import br.edu.infnet.apppedido.model.domain.Leisure;
import br.edu.infnet.apppedido.model.domain.Food;

@Order(1)
@Component
public class ReservationTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Reservas ##");
		
		Apartment apartment = new Apartment();
		apartment.setNumber(-1);
		apartment.setItens("Toalha de banho","Lençol de cama","TV");
		apartment.setType("Suíte");
		
		Food food = new Food();
		food.setName("Lasanha");
		food.setAmount(20.99);
		food.setTime("30/10/2022 12:30:00");
		
		Leisure leisure = new Leisure();
		leisure.setName("Passeio de jeep");
		leisure.setPlace("Canoa Quebrada - CE");
		leisure.setType("Transporte");
		
		List<Service> firstDayService = new ArrayList<Service>();
		firstDayService.add(apartment);
		firstDayServicefirstDayService.add(food);
		firstDayService.add(leisure);
		
		List<Service> othersDaysService = new ArrayList<Service>();
		othersDaysService.add(apartment);
		othersDaysService.add(food);
		
		Guest guest1 = new Guest();		
		guest1.setName("Lucas"); 
		guest1.setCpf("955-453-355-22");
		guest1.setCellphone("(85)97366-3529");
		guest.setEmail("lucasvieira@gmail.com");
		guest1.setNumberReversation(1);
		guest1.setServices(firstDayService);
		
		Guest guest2 = new Guest();		
		guest2.setName("Carlos"); 
		guest2.setCpf("664-453-355-22");
		guest2.setCellphone("(85)97555-3529");
		guest2.setEmail("carlossilva@gmail.com");
		guest2.setNumberReversation(4);
		guest2.setServices(othersDaysService);
		
		Reservation reservation1 = new Reservation();
		reservation.setCheckIn("30/10/2022 08:30:00");
		reservation.setCheckOut("02/11/2022 17:30:00");
		reservation.setConfirmation(true);
		reservation.setGuest(guest1);
		reservation.getServices(firstDayService);
		ReservationController.Add(reservation1);

		Reservation reservation2 = new Reservation();
		reservation.setCheckIn("28/10/2022 08:30:00");
		reservation.setCheckOut("08/11/2022 17:30:00");
		reservation.setConfirmation(false);
		reservation.setGuest(guest2);
		reservation.getServices(othersDaysService);
		ReservationController.Add(reservation2);
	}
}