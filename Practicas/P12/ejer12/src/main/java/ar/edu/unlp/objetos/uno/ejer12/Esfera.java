package ar.edu.unlp.objetos.uno.ejer12;

public class Esfera extends Pieza{
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	@Override
	public double getVolumen() {
		return 4/3 * Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
}
