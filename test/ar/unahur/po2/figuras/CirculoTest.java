package ar.unahur.po2.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnaElipseEn1_1ConRadio2TieneArea12_566() {
		Punto centro = new Punto(1.0,1.0);
		Circulo circulo = new Circulo (centro,2.0);
		assertEquals(12.566, circulo.getArea(),0.001);
	}

	@Test
	public void mover3_1UnCirculoEn1_1ConRadio2LaLLevaA4_2() {
		Punto centro = new Punto(1.0,1.0);
		Circulo circulo = new Circulo (centro,2.0);
		circulo.mover(3.0,1.0);
		assertEquals(4.0, circulo.getPosicion().getEjeX(),0.001);
		assertEquals(2.0, circulo.getPosicion().getEjeY(),0.001);
	}

}
