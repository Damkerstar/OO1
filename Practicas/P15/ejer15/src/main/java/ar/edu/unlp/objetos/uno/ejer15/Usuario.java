package ar.edu.unlp.objetos.uno.ejer15;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {
	private String consumo;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String consumo, String domicilio) {
		this.consumo = consumo;
		this.domicilio = domicilio;
		consumos = new ArrayList<Consumo>();
	}
	
	public void addConsumo(Consumo consumo) {
		consumos.add(consumo);
	}
	
	public Factura crearFactura(CuadroTarifario tarifa) {
		if(consumos.size() > 0) {
			Consumo ult = consumos.get(consumos.size() -1);
			double bonificacion = ult.hayBonificacion()? 0.1: 0;
			
			return new Factura(this, LocalDate.now(), bonificacion, ult.costo(tarifa.getPrecio())-bonificacion);
		}
		return null;
	}

}
