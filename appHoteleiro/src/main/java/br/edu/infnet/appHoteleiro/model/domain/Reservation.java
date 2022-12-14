package br.edu.infnet.appHoleteiro.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "t_reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime checkIn;
	private LocalDateTime checkOut;
	private confirmation = true;
	@Transient
	private Guest guest;
	@Transient
	private List<Service> services;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}