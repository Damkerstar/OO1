package ar.edu.unlp.info.oo1.ejer6;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero padre, madre;
	
	public Mamifero() {}
	
	public Mamifero(String identificador) {
		this.identificador =identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie =especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fecha;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Mamifero getPadre() {
		return (padre != null? padre:null);
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre != null? madre:null;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterna() {
		return madre.getPadre() != null? madre.getPadre():null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return madre.getMadre() != null? madre.getMadre():null;
	}
	
	public Mamifero getAbueloPaterna() {
		return padre.getPadre() != null? padre.getPadre():null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return padre.getMadre() != null? padre.getMadre():null;
	}
	
	public boolean tieneComoAncestroA(Mamifero mamifero) {
		return (padre != null && madre != null && (padre.equals(mamifero) || madre.equals(mamifero)));
	}
}
