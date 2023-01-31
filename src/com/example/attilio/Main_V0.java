package com.example.attilio;

import java.math.BigDecimal;

import com.example.figure.Cerchio;
import com.example.figure.FigureGeometriche;
import com.example.figure.Rettangolo;

public class Main_V0 {

	public static void main(String[] args) {
		
		BigDecimal costoPrato = new BigDecimal(6);
		BigDecimal costoSiepe = new BigDecimal(18);
		Preventivo_V0 preventivo = new Preventivo_V0(costoPrato, costoSiepe);
		
		FigureGeometriche r = new Rettangolo(20, 3);
		FigureGeometriche c = new Cerchio(1.5);
		
		preventivo.add(r);
		preventivo.add(c);
		preventivo.add(c);
		
		String strs = String.format("Preventivo Siepe: %s€ \nPreventivo Prato: %s€ \nCosto Totale: %s€ ", 
				preventivo.totaleSiepe(), 
				preventivo.totalePrato(), 
				preventivo.costoTotale());
		
		System.out.println("Calcolo Preventivo prato e siepe per spazio di misura 20m x 3m e due aiuole di raggio 1.5m \n");
		System.out.println(strs);
	}

}
