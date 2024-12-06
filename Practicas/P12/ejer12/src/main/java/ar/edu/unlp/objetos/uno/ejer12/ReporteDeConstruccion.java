package ar.edu.unlp.objetos.uno.ejer12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void addPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double getVolumenDeMaterial(String material) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(p -> p.getVolumen()).sum();
	}
	
	public double getSuperficieDeColor(String color) {
		return this.piezas.stream().filter(p -> p.getMaterial().equals(color)).mapToDouble(p -> p.getSuperficie()).sum();
	}
}