package com.example.attilio;

import com.example.figure.Misurabile;

public class Elemento implements Misurabile {
	private double perimetro;
	private double area;

	public Elemento(double perimetro, double area) {
		super();
		this.perimetro = perimetro;
		this.area = area;
	}

	public double perimetro() {
		return perimetro;
	}

	public double area() {
		return area;
	}

	@Override
	public String toString() {
		return String.format("Elemento [area=%s, perimetro=%s]", area, perimetro);
	}

}
