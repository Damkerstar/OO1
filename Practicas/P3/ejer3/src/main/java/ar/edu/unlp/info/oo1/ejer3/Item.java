package ar.edu.unlp.info.oo1.ejer3;

public class Item {
	String detalle;
	int cant = 0;
	double costoUnitario;
	
	public Item(String detalle, double cost, int cant) {
		this.detalle = detalle;
		this.cant += cant;
		costoUnitario = cost;
	}
	
	public double costo() {
		return cant*costoUnitario;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
}
