cpackage br.edu.infnet.appHoteleiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Leisure;
import br.edu.infnet.apppedido.model.service.LeisureService;

@Order(5)
@Component
public class LeisureTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de lazeres ##");
		
		@Autowired
		private LeisureService leisureService;
		
		Leisure leisure1 = new Leisure();
		leisure1.setName("Passeio de jeep");
		leisure1.setPlace("Canoa Quebrada - CE");
		leisure1.setType("Transporte");
		leisureService.Add(leisure1);
		
		Leisure leisure2 = new Leisure();
		leisure2.setName("Banho de piscina");
		leisure2.setPlace("Área de lazer do hotel");
		leisure2.setType("Banho");
		leisureService.Add(leisure2);
	}
}