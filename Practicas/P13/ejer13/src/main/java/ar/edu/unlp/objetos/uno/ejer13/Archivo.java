package ar.edu.unlp.objetos.uno.ejer13;

public class Archivo extends Email {
	private String nombre;
	
	public Archivo(String titulo, String cuerpo, String nombre) {
		super(titulo, cuerpo);
		this.nombre = nombre;
	}
	
	public int getTamaño() {
		return this.getCuerpo().length() + this.getTitulo().length() + this.adjuntos().size();
	}	
}
