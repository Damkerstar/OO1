package ar.edu.unlp.objetos.uno.ejer13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public int getTamaño() {
		return this.adjuntos.stream().mapToInt(a -> a.getTamaño()).sum();
	}
	
	
}
