package com.example.attilio;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.figure.Cerchio;
import com.example.figure.FigureGeometriche;
import com.example.figure.Quadrato;
import com.example.figure.Rettangolo;

public class Main_V1 {
	protected static final Logger Log = LogManager.getLogger();

	public static void main(String[] args) {
		Log.trace("Inizio calcolo preventivo...");
		// crea il Preventivo
		BigDecimal costoPrato = new BigDecimal(6);
		BigDecimal costoSiepe = new BigDecimal(18);
		Preventivo_V1 preventivo = new Preventivo_V1(costoPrato, costoSiepe);
		
		// utilizzo di preventivo

		// a) crea le figure geometriche utilizzando i rilevamenti sul campo
		FigureGeometriche r = new Rettangolo(20, 3);
		FigureGeometriche c1 = new Cerchio(1.5);
		FigureGeometriche q = new Quadrato(2.2);
		//FigureGeometriche c2 = new Cerchio(1.5);

		// b) comunica a Preventivo le figure geometriche
		preventivo.add(r);
		preventivo.add(c1);
		preventivo.add(c1);
		preventivo.add(q);

		// c) stampa i calcoli
		String strs = String.format("Costo siepe= %s€  \nCosto prato= %s€ \nTotale giardino= %s€",
				preventivo.totaleSiepe(),
				preventivo.totalePrato(),
				preventivo.costoTotale());

		System.out.println(strs);
		Log.info("Stampa calcoli {}", strs);

		preventivo.remove(r);

		// d) stampa i calcoli
		strs = String.format("\nCosto siepe= %s€  \nCosto prato= %s€ \nTotale giardino= %s€",
				preventivo.totaleSiepe(),
				preventivo.totalePrato(),
				preventivo.costoTotale());

		System.out.println(strs);
		Log.info("Stampa calcoli {}", strs);
		
		preventivo.print(c1);
		
		Log.trace("Fine calcolo preventivo");

	}

}