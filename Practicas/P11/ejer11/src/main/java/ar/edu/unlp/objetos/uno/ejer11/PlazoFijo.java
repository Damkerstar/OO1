package ar.edu.unlp.objetos.uno.ejer11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{

	private LocalDate fechaConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaConstitucion = fechaConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public double valorActual() {
		long dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
		return this.montoDepositado * (this.montoDepositado * this.porcentajeDeInteresDiario/100 * dias);
	}
}
