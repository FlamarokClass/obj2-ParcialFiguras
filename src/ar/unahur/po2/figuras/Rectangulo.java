package ar.unahur.po2.figuras;

public class Rectangulo extends Figura {

	private Punto EsquinaSuperiorDerecha;

	public Rectangulo(Punto pPunto, Double lMayor, Double lMenor) {
		super(pPunto, lMayor, lMenor);
		this.calcularEsquinaSuperiorDerecha();
	}

	private void calcularEsquinaSuperiorDerecha() {
		Double ejeX = this.getPosicion().getEjeX() + this.getlMayor();
		Double ejeY = this.getPosicion().getEjeY() + this.getlMenor();
		Punto punto = new Punto(ejeX, ejeY);
		this.EsquinaSuperiorDerecha = punto;
	}

	@Override
	public Double getArea() {
		return this.getlMayor() * this.getlMenor();
	}
	
	@Override
	protected void setPosicion(Punto pPunto) {
		super.setPosicion(pPunto);
		this.calcularEsquinaSuperiorDerecha();
	}

	public Punto getEsquinaSuperiorDerecha() {
		return EsquinaSuperiorDerecha;
	}

	public void setEsquinaSuperiorDerecha(Punto esquinaSuperiorDerecha) {
		EsquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}
	

}
