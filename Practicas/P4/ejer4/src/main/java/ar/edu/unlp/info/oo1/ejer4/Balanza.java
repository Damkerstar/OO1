package ar.edu.unlp.info.oo1.ejer4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	List<Producto> productos = new ArrayList<>();
	
	public void ponerEnCero() {
		productos.clear();
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.productos, this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioT = 0;
		for(Producto producto : productos) {
			precioT += producto.getPrecio();
		}
		return precioT;
	}
	
	public double getPesoTotal() {
		double pesoT = 0;
		for(Producto producto : productos) {
			pesoT += producto.getPeso();
		}
		return pesoT;
	}
}
