package ar.edu.unlp.info.oo1.ejer5;

public class Cuadrado implements IFigura2D{
	double lado;
	
	public Cuadrado() {}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return lado* 4;
	}
	
	public double getArea() {
		return lado * lado;
	}
}
