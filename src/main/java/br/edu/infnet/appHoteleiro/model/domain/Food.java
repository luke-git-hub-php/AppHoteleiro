package br.edu.infnet.appHoleteiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "t_food")
public class Food extends Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double amount;
	private LocalDateTime time;
	
	public Food(String name, int startHotel, LocalDateTime time) {
		name = name;
		startHotel = startHotel;
		time = time;
	}
	
	@Override
	public String toString() {
		return "Dados sobre a alimentação\nNome da alimentação: " + name + "Quantidade da alimentação: " + amount +
			   "Período da alimentação: " + time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTime() {
		return time;
	}

	public void setComment(LocalDateTime time) {
		this.time = time;
	}
}