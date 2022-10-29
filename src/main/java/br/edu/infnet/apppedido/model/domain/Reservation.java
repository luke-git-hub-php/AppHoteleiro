package br.edu.infnet.apppedido.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private confirmation = true;
	private List<Accommodation> accommodations;
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
		return checkIn + ";" + checkOut + ";" + confirmation + ";" + guest + ";" + accommodation.size();
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

	public List<Accommodation> getAccommodations() {
		return accommodations;
	}

	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	
	public void AddAccommodation(Accommodation accommodation) {
		if (accommodation.DisponivelParaLocacao() && Guest.PodeFazerReserva()) {
			accommodation.add(accommodation);
			Guest.AddAccommodation(accommodation)
		}
		else {
			throw new Error(accommodation.DisponivelParaLocacao() ? "O  hóspede já atingiu o limite de hostedagens para reserva!" : "Hotel não tem quartos disponíveis para reserva para esse hóspede!");
		}
	}
	
	public void RemoveAccommodation(Accommodation accommodation) {
		int idAccommodation = Accommodation.indexOf(Accommodation);
		Accommodation.remove(idAccommodation);
		Guest.RemoverAccommodation(accommodation);
	}
	
	
}