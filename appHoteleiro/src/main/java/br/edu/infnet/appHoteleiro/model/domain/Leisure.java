package br.edu.infnet.appHoleteiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "t_leisure")
public class Leisure extends Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String place;
	private String type;
	
	public Leisure(String name, String place, String type) {
		name = name;
		address = address;
		type = type;
	}
	
	@Override
	public String toString() {
		return "Dados do lazer\nNome: " + name + "\Local do lazer:" + place + "\Tipo de lazer:" + type;
	}
	
	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}