package ar.edu.unlp.objetos.uno.ejer12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	
	public abstract double getVolumen();
	
	public String getColor() {
		return this.color;
	}

	public String getMaterial() {
		return this.material;
	}
	
	public abstract double getSuperficie();
}
