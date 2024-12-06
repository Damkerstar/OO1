package ar.edu.unlp.objetos.uno.ejer15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioTest {
	
	Usuario a;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Usuario("a", "domicilio");
		
	}
	
    @Test
    public void testNombreCompleto() {
    	CuadroTarifario tarifa = new CuadroTarifario(1000);
        assertNull(a.crearFactura(tarifa));
        a.addConsumo(new Consumo(4, 2));
    }
}
