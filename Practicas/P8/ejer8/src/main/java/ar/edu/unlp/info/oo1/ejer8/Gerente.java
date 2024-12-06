package ar.edu.unlp.info.oo1.ejer8;

public class Gerente extends EmpleadoJerarquico {
	public double aportes() {
		return this.montoBasico() * 0.5d;
	}
	
	public double montoBasico() {
		return 57000;
	}
}
