package ar.edu.unlp.objetos.uno.ejer14;

import java.time.LocalDate;

public interface IDateLapse {
	public LocalDate getFrom();
	
	public LocalDate getTo();
	
	public boolean includesDate(LocalDate other);
	
	public int sizeInDays();
}
