package com.example.figure;

public class Cerchio extends FigureGeometriche {

	private double raggio;

	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double area() {
		return raggio * raggio * Math.PI;
	}


	public double perimetro() {
		return 2 * raggio * Math.PI;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append("]");
		return builder.toString();
	}

}
