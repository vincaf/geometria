package com.example.figure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RettangoloTest {

	@Test
	void testArea() {
		Rettangolo rettangolo = new Rettangolo(5.0, 10.0);
		
		// Area attesa del rettangolo: 5*10=50
		
		double area = rettangolo.area();
		
		assertEquals(50.0, area);
		
		String str = String.format("Area del rettangolo: %s", area);
		System.out.println(str);
	}

	@Test
	void testPerimetro() {
		double epsilon = 0.001;
		
		Rettangolo rettangolo = new Rettangolo(5.0, 10.0);
		
		// Perimetro atteso del rettangolo: (5+10)*2=30
		
		double perimetro = rettangolo.perimetro();
		
		double limiteInferiore = 30 - epsilon;
		double limiteSuperiore = 30 + epsilon;
		
		// per effetuare una valutazione più precisa dei numeri in cifra mobile
		assertTrue(perimetro >= limiteInferiore && perimetro < limiteSuperiore);
				
		String str = String.format("Perimetro del rettangolo: %s", perimetro);
		System.out.println(str);
	}

}
