package ar.edu.unlp.info.oo1.ejer3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto{
	LocalDate fecha;
	String cliente;
	List<Item> items;
	
	public Presupuesto(String cliente) {
		items = new ArrayList<Item>();
		fecha = LocalDate.now();
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Item item : items) {
			total += item.costo();
		}
		return total;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
}