package com.example.utilizzatori;

import com.example.figure.Quadrato;

public class UtilizzaMoltiQuadrati {

	public static void main(String[] args) {

		Quadrato q1 = new Quadrato(10);
		Quadrato q2 = new Quadrato(10);

		boolean iQuadratiSonoUguali = q1 == q2; // false perchè le due istanze sono distinte
		System.out.println("I quadrati sono uguali? " + iQuadratiSonoUguali);


		for(int i=0; i<50; i=i+1) { // crea 50 istanze di quadrato, quindi 50 quadrati diversi
			Quadrato quadrato = new Quadrato(i+1);
		}


	}

}
