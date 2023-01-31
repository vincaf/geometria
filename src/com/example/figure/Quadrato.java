package com.example.figure;

public class Quadrato extends Rettangolo{

	// private double lato; // double numero in virgola mobile di 64 bit

	// per avere una classe che funziona meglio
	// occorre modificare il processo di costruzione dell'istanza (new)
	// fornendo dei parametri al COSTRUTTORE

	// costruttore di default senza parametri e corpo vuoto viene sempre introdotto
	// automaticamente dal compilatore se nella classe non sono definiti costruttori

	//public Quadrato() {} // commentato perchè non più in uso

	public Quadrato(double lato) {
		super(lato, lato);
		// this.lato = lato;
	}

}
