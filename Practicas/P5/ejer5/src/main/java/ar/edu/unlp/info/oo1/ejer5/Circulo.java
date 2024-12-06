package ar.edu.unlp.info.oo1.ejer5;

public class Circulo implements IFigura2D {
	double diametro;
	double radio;
	
	public Circulo() {}
	
	public Circulo(double diametro, double radio) {
		this.diametro = diametro;
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public void setDiametro(double valor) {
		diametro = valor;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double getPerimetro() {
		return Math.PI * diametro;
	}
	
	public void setRadio(double valor) {
		this.radio = valor;
	}
	
	public double getRadio() {
		return radio;
	}
	

}
