package ar.edu.unlp.objetos.uno.ejer15;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo(double eA, double eR) {
		energiaActiva = eA;
		energiaReactiva = eR;
	}
	
	public boolean hayBonificacion() {
		double denominador = Math.sqrt(Math.pow(energiaReactiva, 2) + Math.pow(energiaReactiva, 2));
		return energiaActiva/denominador > 0.8;
	}
	
	public double costo(double tarifa) {
		return energiaActiva * tarifa;
	}
}
