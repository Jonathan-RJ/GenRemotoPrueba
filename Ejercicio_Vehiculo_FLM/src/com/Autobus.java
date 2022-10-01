package com;

public class Autobus extends Vehiculo {
	private int numeroplazas;

	public Autobus() {

	}

	public Autobus(String matricula, String modelo, int potencia, int numeroplazas) {
		super(matricula, modelo, potencia);
		this.numeroplazas = numeroplazas;
	}

	public int getNumeroplazas() {
		return numeroplazas;
	}

	public void setNumeroplazas(int numeroplazas) {
		this.numeroplazas = numeroplazas;
	}

}
