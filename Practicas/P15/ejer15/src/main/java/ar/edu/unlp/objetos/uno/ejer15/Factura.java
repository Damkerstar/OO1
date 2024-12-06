package ar.edu.unlp.objetos.uno.ejer15;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fechaEmision;
	private double bonificacion;
	private double montoFinal;
	
	public Factura(Usuario usuario, LocalDate fecha, double bonificacion, double montoFInal) {
		this.usuario = usuario;
		this.fechaEmision = fecha;
		this.bonificacion = bonificacion;
		this.montoFinal = montoFInal;
	}
}
