package ar.edu.unlp.info.oo1.ejer4;
import java.util.List;
import java.time.LocalDate;

public class Ticket {
	LocalDate fecha;
	int cantP;
	double pesoT;
	double precioT;
	List<Producto> productos;
	
	public Ticket(List<Producto> productos, int cant, double peso, double precio) {
		fecha = LocalDate.now();
		cantP = cant;
		pesoT = peso;
		precioT = precio;
		this.productos = productos;
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
