package com.example.figure;

public class Rettangolo extends Poligono {

	private double base = 0.0;
	private double altezza;

	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public double area() {
		return base * altezza;
	}

	public double perimetro() {
		return 2 * (base + altezza);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}

}
