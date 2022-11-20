package br.edu.infnet.apiguest.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "t_guest")
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String cpf;
	private String cellphone;
	private String email;
	private int numberReversation;
	private List<Service> services;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	public Guest(String name, String cpf, String cellphone, String email, int numberReversation , List<Service> services) {
		name = name;
		cpf = cpf;
		cellphone = cellphone;
		email = email;
		numberReversation = numberReversation;
		services = new ArrayList<Service>();
	}
	
	@Override
	public String toString() {
		return "Dados do hóspede\nNome: " + name + "\CPF:" + cpf + "\Telefone:" + cellphone + "\Email:" + email +
			   "Número de reservas:" + numberReversation + "Serviços:" + services;
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
	
	public List<Services> getAccommodations() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	public Boolean isReservation() {
		return accommodations.size() < numberReversation;
	}
	
	public void AddService(Service service) {
		if (services.size() < numberReversation) {
			services.add(service);
		}
	}
	
	public void RemoverService(Service service) {
		int idService = services.indexOf(accommodation);
		services.remove(idService);
	}
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}