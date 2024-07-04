package ar.unahur.po2.figuras;

import java.util.Collections;
import java.util.LinkedList;

public class Plano {
	private LinkedList<Figura> figuras = new LinkedList<Figura>();
	
	public LinkedList<Figura> getOrdenadasPorArea() {
		LinkedList<Figura> otra = new LinkedList<Figura>();
		otra.addAll(figuras);
		Collections.sort(otra);
		return otra;		
	}

	public void agregarFigura(Figura figura) {
		this.figuras.add(figura);
	}

	public LinkedList<Figura> getOrdenadasPorLadoMayor() {
		LinkedList<Figura> otra = new LinkedList<Figura>();
		otra.addAll(figuras);
		Collections.sort(otra, new PorLadoMayorCompartor());
		return otra;	
	}

	
}
