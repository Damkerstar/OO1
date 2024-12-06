package ar.edu.unlp.objetos.uno.ejer12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ReporteConstruccionTest {
	
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prismaRectangular;

	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Hierro", "Rojo", 10, 20);
		esfera = new Esfera("Hierro", "Azul", 8);
		prismaRectangular = new PrismaRectangular("Metal", "Azul", 10, 5, 30);
		reporte.addPieza(cilindro);
		reporte.addPieza(esfera);
		reporte.addPieza(prismaRectangular);
	}

	@Test
	void testVolumen() {
		assertEquals(6283, Math.round(cilindro.getVolumen()));
		assertEquals(2145, Math.round(esfera.getVolumen()));
		assertEquals(1500, prismaRectangular.getVolumen());
	}

	@Test
	void testSuperficie() {
		assertEquals(1885, Math.round(cilindro.getSuperficie()));
		assertEquals(804, Math.round(esfera.getSuperficie()));
		assertEquals(1000, prismaRectangular.getSuperficie());
	}

	@Test
	void testVolumenDeMaterial() {
		assertEquals(8428, Math.round(reporte.getVolumenDeMaterial("Hierro")));
		assertEquals(0, reporte.getVolumenDeMaterial("XD"));
		assertEquals(0, reporte.getVolumenDeMaterial(null));
	}

	void testSuperficieDeColor() {
		assertEquals(1804, Math.round(reporte.getSuperficieDeColor("Azul")));
		assertEquals(0, reporte.getSuperficieDeColor("Verde"));
		assertEquals(0, reporte.getSuperficieDeColor(null));
	}
}
