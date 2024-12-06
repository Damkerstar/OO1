package ar.edu.unlp.info.oo1.ejer5;

public class Cuerpo3D {
	double altura;
	IFigura2D caraBasal;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setCaraBasal(IFigura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
	}
}
