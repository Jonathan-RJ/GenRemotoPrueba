package com;

public class Autobus extends Vehiculo{
	
	private int numeroPlazas;

	public Autobus() {
		super();
	}

	public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas = numeroPlazas;
		// TODO Auto-generated constructor stub
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	
	
	
	

}
