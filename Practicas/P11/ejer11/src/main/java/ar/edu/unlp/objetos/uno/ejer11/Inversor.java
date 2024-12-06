package ar.edu.unlp.objetos.uno.ejer11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private String nombre;
	List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}

	public void addInversion(Inversion i) {
		this.inversiones.add(i);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}

}
