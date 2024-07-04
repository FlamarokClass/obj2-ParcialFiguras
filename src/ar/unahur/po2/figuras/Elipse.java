package ar.unahur.po2.figuras;

public class Elipse extends Figura{

	public Elipse(Punto pPunto, Double lMayor, Double lMenor) {
		super(pPunto, lMayor, lMenor);		
	}

	@Override
	public Double getArea() {
		return Math.PI * this.getlMayor() * this.getlMenor() ;
	}
	
}
