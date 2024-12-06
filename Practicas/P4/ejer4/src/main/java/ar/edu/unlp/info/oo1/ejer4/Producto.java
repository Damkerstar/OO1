package ar.edu.unlp.info.oo1.ejer4;

public class Producto {
	double peso;
	double precioPorKilo;
	String descripcion = "";
	
	public double getPrecio() {
		return precioPorKilo * peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setPrecioPorKilo(double precio) {
		precioPorKilo = precio;
	}
	
	public void setDescripcion(String descrip) {
		descripcion = descrip;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
}
