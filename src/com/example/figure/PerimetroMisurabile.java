package com.example.figure;

@FunctionalInterface
public interface PerimetroMisurabile {

	double perimetro();

	default double semiPerimetro() {
		// return perimetro() / 2;
		return PerimetroMisurabile.semiPerimetro( perimetro() ); // uso della schifezza
	}

	// schifezza per dimostrazione
	static double semiPerimetro(double perimetro) {
		return perimetro / 2;
	}
}
