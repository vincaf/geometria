package com.example.utilizzatori;

import com.example.figure.Ellisse;

public class UtilizzaEllisse {

	public static void main(String[] args) {
		Ellisse ellisse = new Ellisse(10, 20);

		double area = ellisse.area();
		double perimetro = ellisse.perimetro();

		String str1 = String.format("Area=%s \nPerimetro=%s", area, perimetro);
		System.out.println(str1);
	}

}
