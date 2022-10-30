package br.edu.infnet.appHoleteiro.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
	private int id;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private confirmation = true;
	private List<Service> services;
	private Guest guest;
	
	public Pedido() {
		checkIn = LocalDateTime.now();
		checkOut = LocalDateTime.now();
		reservationConfirmation = false;
	}
	
	public Pedido(Guest guest) {
		this();
		this.guest = guest;
	}

	@Override
	public String toString() {
		return id + ";" + checkIn + ";" + checkOut + ";" + confirmation + ";" + guest + ";" + services.size();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDateTime getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDateTime getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmatio(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Services> services) {
		this.services = services;
	}
	
	public void AddService(Service service) {
		if (service.DisponivelParaLocacao() && Guest.PodeFazerReserva()) {
			service.add(accommodation);
			Guest.AddService(service)
		}
		else {
			throw new Error(service.DisponivelParaLocacao() ? "O  hóspede já atingiu o limite de serviços para reserva!" : "Hotel não tem quartos disponíveis para reserva para esse hóspede!");
		}
	}
	
	public void RemoveService(Service service) {
		int idService = Service.indexOf(service);
		Service.remove(idService);
		Guest.RemoverService(Service);
	}
	
	
}