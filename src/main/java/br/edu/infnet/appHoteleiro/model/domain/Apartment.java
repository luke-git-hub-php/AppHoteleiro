package br.edu.infnet.apppedido.model.domain;

public class Apartment extends Accommodation {
	private int number;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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