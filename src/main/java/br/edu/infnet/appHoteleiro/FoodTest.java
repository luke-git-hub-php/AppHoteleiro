package br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.controller.PedidoController;
import br.edu.infnet.apppedido.model.domain.Food;

@Order(5)
@Component
public class FoodTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de alimentações ##");
	
		Food food1 = new Food();
		food1.setName("Lasanha");
		food1.setAmount(20.99);
		food1.setTime("30/10/2022 12:30:00");
		FoodController.Add(food1);
		
		Food food2 = new Food();
		food2.setName("Risoto de frango");
		food2.setAmount(30.99);
		food2.setTime("31/10/2022 12:30:00");
		FoodController.Add(food2);
	}
}