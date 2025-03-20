package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("Test GetVentas, debe de tomar el valor de ventas de clase Comercial y ser igual al esperado")
	void testGetVentas() {
		double ventasEsperadas = 23.56;
		double ventas = c1.getVentas();
		assertEquals(ventasEsperadas, ventas);
	}
	
	@Test
	@DisplayName("Test SetVentas, debe de poner el valor dado como parametro")
	void testSetVentasPositivo() {
		double ventasEsperadas = 45.54;
		c1.setVentas(ventasEsperadas);
		assertEquals(ventasEsperadas, c1.getVentas());
	}
	
	@Test 
	@DisplayName("Test SetVentas, debe de lanzar una excepcion al ser ventas negativas")
	void testSetVentasNegativas() {
		assertThrows(IllegalArgumentException.class, () -> c1.setVentas(-23.65));
	}
	
	@Test
	@DisplayName("Test calcularExtra, debe calcular el extra del sueldo basado en las ventas realizadas.")
	void testCalcularExtra() {
		double extraEsperado = 0.10 * c1.getVentas();
		assertEquals(extraEsperado, c1.calcularExtra());
	}
	
	@Test
	@DisplayName("Test getSueldo, ")
	void testGetSueldo() {
		double sueldoEsperado = c1.getSueldoBase() + c1.calcularExtra();
		assertEquals(sueldoEsperado, c1.getSueldo());
		c1.setVentas(10.45);
		double sueldoEsperado_2 = c1.getSueldoBase() + c1.calcularExtra();
		assertEquals(sueldoEsperado_2, c1.getSueldo());
		c1.setVentas(0);
		double sueldoEsperado_3 = c1.getSueldoBase() + c1.calcularExtra();
		assertEquals(sueldoEsperado_3, c1.getSueldo());
	}
	

}
