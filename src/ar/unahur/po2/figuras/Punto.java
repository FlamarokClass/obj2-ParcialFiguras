package ar.unahur.po2.figuras;

public class Punto {

	private Double ejeX;
	private Double ejeY;

	public Punto(Double pEjeX, Double pEjeY) {
		this.ejeX = pEjeX;
		this.ejeY = pEjeY;
	}

	public Double getEjeX() {
		return ejeX;
	}

	public void setEjeX(Double ejeX) {
		this.ejeX = ejeX;
	}

	public Double getEjeY() {
		return ejeY;
	}

	public void setEjeY(Double ejeY) {
		this.ejeY = ejeY;
	}	

}
