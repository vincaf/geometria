package com.example.utilizzatori;

import com.example.figure.Quadrato;

public class UtilizzaQuadrato {

	public static void main(String[] args) {
		Quadrato quadrato = new Quadrato(30);

		double area = quadrato.area();
		double perimetro = quadrato.perimetro();

		String str = String.format("Area del quadrato=%s, Perimetro del quadrato=%s", area, perimetro);
		System.out.println(str);

		str = "Area del quadrato=" + area + ", Perimetro del quadrato=" + perimetro;
		System.out.println(str);

		str = String.format("Area del quadrato=%s, Perimetro del quadrato=%s", quadrato.area(), quadrato.perimetro());
		System.out.println(str);
	}

}
