package ar.edu.unlp.objetos.uno.ejer12;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String material, String color, int ladoMayor, int ladoMenor, int altura) {
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	@Override
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}
	
	@Override
	public double getSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
}
