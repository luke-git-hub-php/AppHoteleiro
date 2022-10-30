package br.edu.infnet.appHoleteiro.model.domain;

public abstract class Service {
	private int id;	
	private String name;
	private float value;
	private int code;
	private String type;

	@Override
	public String toString() {
		return id + ";" + name + ";" + value + ";" + code + ";" + type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
