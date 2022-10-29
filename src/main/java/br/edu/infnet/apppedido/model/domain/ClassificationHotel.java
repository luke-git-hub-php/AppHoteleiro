package br.edu.infnet.apppedido.model.domain;

public class ClassificationHotel extends Produto {
	private String nameHotel;
	private int startHotel;
	private String comment;
	
	public ClassificationHotel(String nameHotel, int startHotel, String comment) {
		nameHotel = nameHotel;
		startHotel = startHotel;
		comment = comment;
	}
	
	@Override
	public String toString() {
		return "Comentários sobre os hotéis\nNome do Hotel: " + nameHotel + "Quantidade de estrelas: " + startHotel +
			   "Comentário: " + comment;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public int startHotel() {
		return startHotel;
	}

	public void setStartHotel(int startHotel) {
		this.startHotel = startHotel;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}