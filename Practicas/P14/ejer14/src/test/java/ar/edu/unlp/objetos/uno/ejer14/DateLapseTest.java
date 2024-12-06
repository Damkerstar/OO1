package ar.edu.unlp.objetos.uno.ejer14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	IDateLapse date;
	LocalDate desde = LocalDate.of(2024, 2, 5);
	LocalDate hasta = LocalDate.of(2024, 5, 30);

	IDateLapse date2;
	LocalDate desde2 = LocalDate.of(2024, 5, 15);
	LocalDate hasta2 = LocalDate.of(2024, 5, 25);

	@BeforeEach
	void setUp() throws Exception {
		date = new DateLapse(desde, hasta);
		date2 = new DateLapse2(desde2, 10);

	}

	@Test
	public void testCantidadDias() {
		assertEquals(29, date.sizeInDays());
		assertEquals(10, date2.sizeInDays());
	}

	@Test
	public void testContieneFecha() {
		assertTrue(date.includesDate(desde2));
		assertTrue(date.includesDate(hasta2));
		assertTrue(date.includesDate(desde));
		assertTrue(date.includesDate(hasta));
	}
}
