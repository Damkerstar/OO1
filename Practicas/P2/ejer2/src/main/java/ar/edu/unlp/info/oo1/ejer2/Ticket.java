package ar.edu.unlp.info.oo1.ejer2;

import java.time.LocalDate;

public class Ticket {
	LocalDate fecha;
	int cantP;
	double pesoT;
	double precioT;
	
	public Ticket(int cant, double peso, double precio) {
		fecha = LocalDate.now();
		cantP = cant;
		pesoT = peso;
		precioT = precio;
	}
	
	public double impuesto() {
		return (0.21 * precioT);
	}
	
	public double getPesoTotal() {
		return pesoT;
	}
	
	public double getPrecioTotal() {
		return precioT;
	}
	
	public int getCantidadDeProductos() {
		return cantP;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
}
