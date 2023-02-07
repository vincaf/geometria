package com.example.attilio;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.figure.FigureGeometriche;

public class Preventivo_V1 {
	protected static final Logger Log = LogManager.getLogger();
	
	private BigDecimal costoPrato = BigDecimal.ZERO;
	private BigDecimal costoSiepe = BigDecimal.ZERO;

	private BigDecimal totalePrato = BigDecimal.ZERO;
	private BigDecimal totaleSiepe = BigDecimal.ZERO;

	// per ora non sono usate
	private FigureGeometriche [] aiuole = new FigureGeometriche[10];
	private int indice = 0;

	public Preventivo_V1(BigDecimal costoPrato, BigDecimal costoSiepe) {
		super();
		this.costoPrato = costoPrato;
		this.costoSiepe = costoSiepe;
		Log.debug("Parametri Preventivo(prato, siepe): [{}, {}]", costoPrato, costoSiepe);
	}

	/* !!!-1 CAMBIARE IMPLEMENTAZIONE scorrendo l'array */
	public BigDecimal totalePrato() {
	    BigDecimal area = BigDecimal.ZERO;
	    for (FigureGeometriche aiuola : aiuole) {
	    	if(aiuola != null) {
	    		area = area.add(new BigDecimal(aiuola.area()));
	    	}
	    }
	    totalePrato = costoPrato.multiply(area).setScale(2, RoundingMode.HALF_UP);
	    return totalePrato;

	}

	/* !!!-1 CAMBIARE IMPLEMENTAZIONE scorrendo l'array */
	public BigDecimal totaleSiepe() {
		BigDecimal perimetro = BigDecimal.ZERO;
		for (FigureGeometriche aiuola : aiuole) {
			if(aiuola != null) {
				perimetro = perimetro.add(new BigDecimal(aiuola.perimetro()));
			}
	    }
	    totaleSiepe = costoSiepe.multiply(perimetro).setScale(2, RoundingMode.HALF_UP);
	    return totaleSiepe;
	}

	// esempio di .setScale(2, RoundingMode.HALF_UP) 0.003 => 0.000 e 0.005 => 0.010
	public BigDecimal costoTotale() {
		return totalePrato().add( totaleSiepe ).setScale(2, RoundingMode.HALF_UP);
	}

	// la add non ha strutture dati su cui appoggiare i dettagli
	public void add(FigureGeometriche aiuola) {
		Log.debug("Da aggiungere {} - posizione: {}", aiuola, indice);
		if(aiuola != null && indice < aiuole.length) {
			this.aiuole[indice] = aiuola;
			indice++;
			Log.trace("Aggiunta aiuola");
		}
	}

	/* !!!-3 DA IMPLEMENTARE */
	public void remove(FigureGeometriche aiuolaDaRimuovere) {
		for (int i = 0; i < aiuole.length; i++) {
	        if (aiuole[i].equals(aiuolaDaRimuovere)) {
	            for (int j = i; j < aiuole.length - 1; j++) {
	                aiuole[j] = aiuole[j + 1];
	            }
	            aiuole[aiuole.length - 1] = null;
	            break;
	        }
	    }
		System.out.println("\nElemento rimosso: " + aiuolaDaRimuovere);
		Log.debug("Rimosso {}", aiuolaDaRimuovere);
	}

	/* !!!-2 DA IMPLEMENTARE */
	public void print(FigureGeometriche aiuola) {
		StringBuilder builder = new StringBuilder();
		builder.append("\nFigura Geometrica: ").append(aiuola.toString()).append("\n");
		builder.append("Area: ").append(aiuola.area()).append("\n");
		builder.append("Perimetro: ").append(aiuola.perimetro()).append("\n");
		System.out.println(builder.toString());
	}
	
}