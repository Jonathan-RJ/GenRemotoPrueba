package com;

public class Autobus extends Vehiculo {
	
	private int numPlazas;

	public Autobus() {
		}

	public Autobus(String matricula, String modelo, int potencia, int numPlazas) {
		super(matricula, modelo, potencia);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	
	
	
	
	

}
