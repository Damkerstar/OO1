package ar.edu.unlp.info.oo1.ejer2;

public class Balanza {
	int cantP = 0;
	double precioT = 0;
	double pesoT = 0;
	
	public void ponerEnCero() {
		this.precioT = 0;
		this.cantP = 0;
		this.pesoT = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.pesoT += producto.peso;
		this.cantP ++;
		this.precioT += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantP, this.pesoT, this.precioT);
	}
	
	public int getCantidadDeProductos() {
		return cantP;
	}
	
	public double getPrecioTotal() {
		return precioT;
	}
	
	public double getPesoTotal() {
		return pesoT;
	}
}
