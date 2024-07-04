package ar.unahur.po2.figuras;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class PlanoTest {

	@Test
	public void queSeMuestrenOrdenadasPorArea() {
		Punto centro = new Punto(1.0, 1.0);
		Circulo c1 = new Circulo(centro, 2.0);
		Circulo c2 = new Circulo(centro, 3.0);
		Circulo c3 = new Circulo(centro, 1.0);

		LinkedList<Figura> esperado = new LinkedList<Figura>();
		esperado.add(c3);
		esperado.add(c1);
		esperado.add(c2);

		Plano plano = new Plano();
		plano.agregarFigura(c1);
		plano.agregarFigura(c2);
		plano.agregarFigura(c3);

		assertEquals(esperado, plano.getOrdenadasPorArea());

	}
	
	@Test
	public void queSeMuestrenOrdenadasLadoMayor() {
		Punto centro = new Punto(1.0, 1.0);
		Elipse e1 = new Elipse(centro, 2.0, 2.0);
		Elipse e2 = new Elipse(centro, 3.0,3.0);
		Elipse e3 = new Elipse(centro, 1.0,1.0);

		LinkedList<Figura> esperado = new LinkedList<Figura>();
		esperado.add(e3);
		esperado.add(e1);
		esperado.add(e2);

		Plano plano = new Plano();
		plano.agregarFigura(e1);
		plano.agregarFigura(e2);
		plano.agregarFigura(e3);

		assertEquals(esperado, plano.getOrdenadasPorLadoMayor());

	}

}
