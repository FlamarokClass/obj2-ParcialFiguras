package ar.unahur.po2.figuras;

import java.util.Comparator;

public class PorLadoMayorCompartor implements Comparator<Figura> {

	@Override
	public int compare(Figura una, Figura otra) {
		int retorno = 0;
		if (una.getlMayor() > otra.getlMayor()) {
			retorno = 1;
		}
		if (una.getlMayor() < otra.getlMayor()) {
			retorno = -1;
		}
		return retorno;
	}

}
