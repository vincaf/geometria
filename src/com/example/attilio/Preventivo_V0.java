package com.example.attilio;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.example.figure.FigureGeometriche;

public class Preventivo_V0 {

	private BigDecimal costoPrato = BigDecimal.ZERO;
	private BigDecimal costoSiepe = BigDecimal.ZERO;
	
	private BigDecimal totalePrato = BigDecimal.ZERO;
	private BigDecimal totaleSiepe = BigDecimal.ZERO;
	
	public Preventivo_V0(BigDecimal costoPrato, BigDecimal costoSiepe) {
		super();
		this.costoPrato = costoPrato;
		this.costoSiepe = costoSiepe;
	}
	
	public BigDecimal totalePrato() {
		return totalePrato.setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal totaleSiepe() {
		return totaleSiepe.setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal costoTotale() {
		return totalePrato().add(totaleSiepe).setScale(2, RoundingMode.HALF_UP);
	}
	
	public void add(FigureGeometriche f) {
		BigDecimal area = new BigDecimal(f.area());
		BigDecimal perimetro = new BigDecimal(f.perimetro());
		
		totalePrato = totalePrato.add(costoPrato.multiply(area));
		totaleSiepe = totaleSiepe.add(costoPrato.multiply(perimetro));
	}
}
