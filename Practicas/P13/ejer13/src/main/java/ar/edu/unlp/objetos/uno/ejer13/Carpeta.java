package ar.edu.unlp.objetos.uno.ejer13;

import java.util.List;

public class Carpeta {
	private List<Email> emails;
	private String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta carpeta) {
		this.emails.remove(email);
		carpeta.addEmail(email);
	}
	
	public void addEmail(Email email) {
		this.emails.add(email);
	}

	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.getTitulo().equals(texto) || e.getCuerpo().equals(texto)).findFirst().orElse(null);
	}
	
	public int tamaño() {
		return this.emails.stream().mapToInt(e -> e.getTamaño()).sum();
	}
	
}
