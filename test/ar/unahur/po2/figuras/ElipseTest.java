package ar.unahur.po2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElipseTest {

	@Test
	public void crearUnaElipseEn1_1ConEjeMayor2YEjeMenor1TieneArea6_283() {
		Punto centro = new Punto(1.0,1.0);
		Elipse elipse = new Elipse (centro,2.0,1.0);
		assertEquals(6.283, elipse.getArea(),0.001);
	}

	@Test
	public void mover3_1UnaElipseEn1_1LaLLevaA4_2() {
		Punto centro = new Punto(1.0,1.0);
		Elipse elipse = new Elipse (centro,2.0,1.0);
		elipse.mover(3.0,1.0);
		assertEquals(4.0, elipse.getPosicion().getEjeX(),0.001);
		assertEquals(2.0, elipse.getPosicion().getEjeY(),0.001);
	}
}
