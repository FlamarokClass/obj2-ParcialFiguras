package ar.unahur.po2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void queSePuedaCrearUnPunto() {
		Punto punto = new Punto(1.0,2.0);
		assertEquals(1.0,punto.getEjeX(),0.001);
		assertEquals(2.0,punto.getEjeY(),0.001);		
	}

}
