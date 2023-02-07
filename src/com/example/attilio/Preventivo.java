package com.example.attilio;

import java.math.BigDecimal;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.figure.Misurabile;

public class Preventivo {
	protected static final Logger Log = LogManager.getLogger();

	private BigDecimal costoPrato = BigDecimal.ZERO;
	private BigDecimal costoSiepe = BigDecimal.ZERO;

	private BigDecimal totalePrato = BigDecimal.ZERO;
	private BigDecimal totaleSiepe = BigDecimal.ZERO;

	private List<Misurabile> aiuole = new ArrayList<>(); // buon default

	public Preventivo(BigDecimal costoPrato, BigDecimal costoSiepe) {
		super();
		this.costoPrato = costoPrato;
		this.costoSiepe = costoSiepe;
	}

	/**
	 * Calcola il totale del prato
	 * @return
	 */
	public BigDecimal totalePrato() {
		BigDecimal area = BigDecimal.ZERO;
		for (int i = 0; i < aiuole.size(); i++) {
			if (aiuole.get(i) != null) {
				area = area.add(new BigDecimal(aiuole.get(i).area()));
			}
		}
		totalePrato = costoPrato.multiply(area);

		return totalePrato.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Calcola il totale della siepe
	 * @return
	 */
	public BigDecimal totaleSiepe() {
		BigDecimal perimetro = BigDecimal.ZERO;
		for (int i = 0; i < aiuole.size(); i++) {
			if (aiuole.get(i) != null) {
				perimetro = perimetro.add(new BigDecimal(aiuole.get(i).perimetro()));
			}
		}

		totaleSiepe = costoSiepe.multiply(perimetro);

		return totaleSiepe.setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Calcola il costo totale del preventivo
	 * @return
	 */
	public BigDecimal costoTotale() {
		return totalePrato().add(totaleSiepe).setScale(2, RoundingMode.HALF_UP);
	}

	/**
	 * Aggiunge un misurabile al Preventivo
	 * @param aiuola
	 */
	public void add(Misurabile aiuola) {
		if (aiuola != null) {
			this.aiuole.add(aiuola);
		}
	}

	/**
	 * Elimina un Misurabile dal Preventivo
	 * @param index
	 * @return
	 */
	public Misurabile remove(int index) {
		Misurabile fg = aiuole.remove(index);
		Log.debug("elemento rimosso {}", fg);
		return fg;
	}

	/**
	 * Stampa gli Elementi contenuti nel Preventivo
	 */
	public void print() {
		String str = "XXX: ";
		aiuole.stream().forEach( x -> System.out.println( str +x ) );

		/* implementazione per assegnazione ad una variabile
		Consumer c = x -> System.out.println(x);
		aiuole.forEach(c);
		*/

		/* implementazione tramite anonymous inner class
		aiuole.forEach(new Consumer() {

			@Override
			public void accept(Object t) {
				System.out.println(t);
			}

		});
		*/
		 aiuole.forEach(System.out::println); // il tipo di parametro "method reference"
	}

}