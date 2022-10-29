package br.edu.infnet.apppedido.model.domain;

public abstract class Accommodation {
	private String name;
	private float value;
	private int code;
	private String type;

	@Override
	public String toString() {
		return name + ";" + value + ";" + code + ";" + type;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float valeu) {
		this.valeu = valeu;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
