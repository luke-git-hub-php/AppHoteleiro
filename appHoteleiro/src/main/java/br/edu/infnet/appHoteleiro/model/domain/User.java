package br.edu.infnet.appHoleteiro.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "tuser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Guest> guests;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Reservation> reservation;
	@OneToMany
	@JoinColumn(name = "idUser")
	private List<Service> services;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idendereco")
	private Address address;
	
	@Override
	public String toString() {
		return id + ";" + name + ";" + email + ";" + password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> Guests) {
		this.guests = guests;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	
	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}