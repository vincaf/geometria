package com.example.figure;

import java.util.Random;

/**
 * Classe utilizzata per illustrare il funzionamento del polimorfismo con Java.
 * Vengono create una serie di istanze di FigureGeometriche che vengono
 * in seguito utilizzate per sommarnme aree e perimetri
 *
 */
public class FigureRandom {

	/**
	 * istanza di Random utilizzata come generatore
	 */
	private Random rnd = new Random();

	public static void main(String[] args) {
		FigureRandom figureRandom = new FigureRandom();
		double totaleArea = 0.0;
		double totalePerimetro = 0.0;

		for(int i = 0; i < 50; i++) { // ciclo o loop
			// supponiamo di voler elborare solo gli i pari e saltare gli i dispari
			if(i%2 == 0) { // quando il resto della divisione per due è zero
				continue; // salta al prossimo ciclo
			}
			if(i>20) {
				break;
			}
			FigureGeometriche figura = figureRandom.generaFiguraRandom();
			System.out.println(figura.getClass().getSimpleName()+"  area="+figura.area()+"  perimetro="+figura.perimetro());
			totaleArea = totaleArea + figura.area();
			totalePerimetro = totalePerimetro + figura.perimetro();
		}

		System.out.println("area="+totaleArea+"  perimetro="+totalePerimetro);


		// while alternativa assolutamente identica al for
		int i = 0;
		while(i < 50) { // ciclo o loop
			// supponiamo di voler elborare solo gli i pari e saltare gli i dispari
			if(i%2 == 0) { // quando il resto della divisione per due è zero
				i++;
				continue; // salta al prossimo ciclo
			}
			if(i>20) {
				break;
			}
			FigureGeometriche figura = figureRandom.generaFiguraRandom();
			System.out.println(figura.getClass().getSimpleName()+"  area="+figura.area()+"  perimetro="+figura.perimetro());
			totaleArea = totaleArea + figura.area();
			totalePerimetro = totalePerimetro + figura.perimetro();
			 i++; // ricordarsi sempre l'incremento in uscita
		}
		System.out.println("area="+totaleArea+"  perimetro="+totalePerimetro);

	}


	/**
	 * Metodo per la generazione di una figura casuale
	 * @return
	 */
	private FigureGeometriche generaFiguraRandom() {
		int figura = rnd.nextInt(3);

		FigureGeometriche figuraGenerata = null;

		if(figura==0) {
			int base = rnd.nextInt(100);
			int altezza = rnd.nextInt(100);
			figuraGenerata = new Rettangolo(base, altezza);
		}

		if(figura==1) {
			int lato = rnd.nextInt(100);
			figuraGenerata = new Quadrato(lato);
		}

		if(figura==2) {
			int raggio = rnd.nextInt(100);
			figuraGenerata = new Cerchio(raggio);
		}

		return figuraGenerata;
	}

}
