package model;

public class Destino {
	
	private int id;
	private String estado;
	private String cidade;
	private String ida;
	private String volta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getIda() {
		return ida;
	}
	public void setIda(String ida) {
		this.ida = ida;
	}
	public String getVolta() {
		return volta;
	}
	public void setVolta(String volta) {
		this.volta = volta;
	}
	
	@Override
	public String toString() {
		return "Destino [id=" + id + ", estado=" + estado + ", cidade=" + cidade + ", ida=" + ida + ", volta=" + volta
				+ ", getId()=" + getId() + ", getEstado()=" + getEstado() + ", getCidade()=" + getCidade()
				+ ", getIda()=" + getIda() + ", getVolta()=" + getVolta() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
