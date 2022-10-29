package br.edu.infnet.apppedido.model.domain;

public class Guest {
	private String name;
	private String cpf;
	private String cellphone;
	private String email;
	private int numberReversation;
	private List<Accommodation> accommodations;
	
	public Guest(String name, String cpf, String cellphone, String email, numberReversation + accommodations) {
		name = name;
		cpf = cpf;
		cellphone = cellphone;
		email = email;
		numberReversation = numberReversation;
		accommodations = new ArrayList<Accommodation>();
	}
	
	@Override
	public String toString() {
		return "Dados do hóspede\nNome: " + name + "\CPF:" + cpf + "\Telefone:" + cellphone + "\Email:" + email +
			   "Número de reservas:" + numberReversation + "Hospedagens:" + accommodations;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String Cellphone) {
		this.Cellphone = Cellphone;
	
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumberReversation() {
		return numberReversation;
	}

	public void setNumberReversation(int numberReversation) {
		this.numberReversation = numberReversation;
	}
	
	public List<Accommodation> getAccommodations() {
		return accommodations;
	}

	public void setAccommodations(List<Accommodation> accommodations) {
		this.accommodations = accommodations;
	}
	
	public Boolean isReservation() {
		return accommodations.size() < numberReversation;
	}
	
	public void AddAccommodation(Accommodation accommodation) {
		if (accommodations.size() < numberReversation) {
			accommodations.add(accommodation);
		}
	}
	
	public void RemoverAccommodation(Accommodation accommodation) {
		int idAccommodation = accommodations.indexOf(accommodation);
		accommodations.remove(idAccommodation);
	}
	
	
}