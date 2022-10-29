package br.edu.infnet.apppedido.model.domain;

public class Hotel extends Accommodation {
	private String name;
	private String address;
	private String type;
	
	public Hotel(String name, String address, String type) {
		name = name;
		address = address;
		type = type;
	}
	
	@Override
	public String toString() {
		return "Dados do hotel\nNome: " + name + "\Endereço:" + address + "\Tipo de hotel:" + type;
	}
	
	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}