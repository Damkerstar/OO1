package ar.edu.unlp.info.oo1.ejer8;

public class EmpleadoJerarquico extends Empleado implements IEmpleado{
	public double sueldoBasi() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}

	public double bonoPorCategoria() {
		return 8000;
	}
}
