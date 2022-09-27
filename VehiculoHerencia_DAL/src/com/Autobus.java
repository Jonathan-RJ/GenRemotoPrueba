package com;

public class Autobus extends vehiculo{
	private int numeroPlazas;

	public Autobus() {
		
	}

	public Autobus(String matricula, String modelo, String potenciaCV, int numeroPlazas) {
		super(matricula, modelo, potenciaCV);
		this.numeroPlazas=numeroPlazas;
		// TODO Auto-generated constructor stub
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	
	

}
