package com.example.utilizzatori;

import com.example.figure.Rettangolo;

public class UtilizzaRettangolo {

	public static void main(String[] args) {
		Rettangolo rettangolo = new Rettangolo(10, 20);

		System.out.print("Area rettangolo="+rettangolo.area());
		System.out.println(" Perimetro rettangolo="+rettangolo.perimetro());

	}

}
