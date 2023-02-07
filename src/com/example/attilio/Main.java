package com.example.attilio;

import java.math.BigDecimal;
import java.util.function.BiFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.figure.Cerchio;
import com.example.figure.FigureGeometriche;
import com.example.figure.Misurabile;
import com.example.figure.Quadrato;
import com.example.figure.Rettangolo;

public class Main {
	protected static final Logger Log = LogManager.getLogger();

	public static void main(String[] args) {
		Log.trace("Inizio calcolo preventivo...");
		// crea il Preventivo
		BigDecimal costoPrato = new BigDecimal(6);
		BigDecimal costoSiepe = new BigDecimal(18);
		Log.debug("Costo prato={}  Costo siepe={}", costoPrato, costoSiepe);

		Preventivo preventivo = new Preventivo(costoPrato, costoSiepe);

		// utilizzo di preventivo

		// a) crea le figure geometriche utilizzando i rilevamenti sul campo
		FigureGeometriche r = new Rettangolo(20, 3);
		FigureGeometriche c1 = new Cerchio(1.5);

		// b) comunica a Preventivo le figure geometriche
		preventivo.add(r);
		Log.debug("Aggiunto {}", r); /*****/

		preventivo.add(c1);
		Log.debug("Aggiunto {}", c1); /*****/

		preventivo.add(c1);
		Log.debug("Aggiunto {}", c1); /*****/

		FigureGeometriche q = new Quadrato(2.2);
		preventivo.add( q );
		Log.debug("Aggiunto {}", q); /*****/


		Elemento e = new Elemento(66.0, 30.0);
		preventivo.add(e);

		preventivo.add(
				new FigureGeometriche() {

					@Override
					public double perimetro() {
						return 66.0;
					}

					@Override
					public double area() {
						return 30.0;
					}
				}
				);

		// c) stampa i calcoli
		String strs = String.format("Costo siepe=%s  CostoPrato=%s Totale giardino=%s",
				preventivo.totaleSiepe(),
				preventivo.totalePrato(),
				preventivo.costoTotale());
		System.out.println(strs);

		Log.info("Risultato: {}",strs);

		Misurabile f = preventivo.remove(2);
		Log.debug("Rimosso {}", f);/*****/
		f = preventivo.remove(2);
		Log.debug("Rimosso {}", f);/*****/

		preventivo.print();

		Log.trace("Fine calcolo preventivo...");

	}

}
