package com.example.figure;

public class Ellisse extends FigureGeometriche {

	private double semiasseMinore;
	private double semiasseMaggiore;

	public Ellisse(double semiasseMinore, double semiasseMaggiore) {
		super();
		this.semiasseMinore = semiasseMinore;
		this.semiasseMaggiore = semiasseMaggiore;
	}
	
	@Override
	public double area() {
		return Math.PI * semiasseMinore * semiasseMaggiore;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * Math.sqrt( (Math.pow(semiasseMinore, 2) + Math.pow(semiasseMaggiore, 2) ) / 2);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiasseMinore=");
		builder.append(semiasseMinore);
		builder.append(", semiasseMaggiore=");
		builder.append(semiasseMaggiore);
		builder.append(", area()=");
		builder.append(area());
		builder.append(", perimetro()=");
		builder.append(perimetro());
		builder.append("]");
		return builder.toString();
	}

}
