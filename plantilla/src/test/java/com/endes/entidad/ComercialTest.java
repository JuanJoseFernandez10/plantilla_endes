package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComercialTest {

	Comercial c1;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Comercial("47265505E", "Alejandro", "Rodriguez", 1500.75, 23.56);
	}

	/*
	  	getVentas()
		setVentas(double ventas) (Debe lanzar una excepción si el valor es
		negativo).
 		calcularExtra()
		getSueldo() (Debe comprobarse con diferentes valores de ventas)
	 */
	
	
	
	@Test
	void testGetVentas() {
		double ventasEsperadas = 23.56;
		double ventas = c1.getVentas();
		assertEquals(ventasEsperadas, ventas);
	}

}
