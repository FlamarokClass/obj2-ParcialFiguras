package ar.unahur.po2.figuras;

public abstract class Figura implements Comparable<Figura>, Movible {

	private Punto posicion;
	private Double lMayor;
	private Double lMenor;

	public Figura(Punto pPunto, Double lMayor, Double lMenor) {
		this.posicion = pPunto;
		this.lMayor = lMayor;
		this.lMenor = lMenor;
	}

	public abstract Double getArea();

	protected Punto getPosicion() {
		return posicion;
	}

	protected void setPosicion(Punto pPunto) {
		this.posicion = pPunto;
	}

	protected Double getlMayor() {
		return lMayor;
	}

	protected void setlMayor(Double lMayor) {
		this.lMayor = lMayor;
	}

	protected Double getlMenor() {
		return lMenor;
	}

	protected void setlMenor(Double lMenor) {
		this.lMenor = lMenor;
	}

	public void mover(Double deltaX, Double deltaY) {
		Punto nuevoPunto = this.getPosicion();
		nuevoPunto.setEjeX(nuevoPunto.getEjeX() + deltaX);
		nuevoPunto.setEjeY(nuevoPunto.getEjeY() + deltaY);
		this.setPosicion(nuevoPunto);
	}

	public int compareTo(Figura otra) {
		int retorno = 0;
		if (this.getArea() > otra.getArea()) {
			retorno = 1;
		}
		if (this.getArea() < otra.getArea()) {
			retorno = -1;
		}
		return retorno;
	}

	@Override
	public String toString() {
		return "Figura [área=" + getArea() + "]";
	}

}
