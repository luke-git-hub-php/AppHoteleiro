package br.edu.infnet.appHoleteiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "t_apartment")
public class Apartment extends Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float number;
	private List<string> itens;
	private String type;
	
	public Apartment(int number, List<string> itens, String type) {
		number = number;
		itens = itens;
		type = type;
	}
	
	@Override
	public String toString() {
		return "Dados do Apartamento\nNúmero do quarto: " + number + "Itens solicitados no quarto: " + itens.size() + 
				"Tipo de quarto: " + type;
	}

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public List<string> getItens() {
		return itens;
	}

	public void setItens(List<string> itens) {
		this.itens = itens;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}