package com.example.figure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EllisseTest {

	@Test
	void testArea() {
		double epsilon = 0.001;
		
		Ellisse ellisse = new Ellisse(10, 20);
		
		// Area attesa dell'ellisse: 628.3185
		
		double area = ellisse.area();
		
		double limiteInferiore = 628.318 - epsilon;
		double limiteSuperiore = 628.318 + epsilon;
		
		assertTrue(area >= limiteInferiore && area < limiteSuperiore);
				
		String str = String.format("Area dell'ellisse: %s", area);
		System.out.println(str);
	}

	@Test
	void testPerimetro() {
		double epsilon = 0.001;
		
		Ellisse ellisse = new Ellisse(10, 20);
		
		// Perimetro atteso dell'ellisse: 99.3458
		
		double perimetro = ellisse.perimetro();
		
		double limiteInferiore = 99.345 - epsilon;
		double limiteSuperiore = 99.345 + epsilon;
		
		assertTrue(perimetro >= limiteInferiore && perimetro < limiteSuperiore);
				
		String str = String.format("Perimetro dell'ellisse: %s", perimetro);
		System.out.println(str);
	}

}
