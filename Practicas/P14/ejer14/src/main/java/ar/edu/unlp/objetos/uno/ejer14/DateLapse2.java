package ar.edu.unlp.objetos.uno.ejer14;

import java.time.LocalDate;

public class DateLapse2 implements IDateLapse {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return from.plusDays(sizeInDays);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(from) || other.isBefore(this.getTo()));
	}
	
	public int sizeInDays() {
		return sizeInDays;
	}
}
