package com;

public class Taxi extends Vehiculo {
	private String numeroLicencia;

	public Taxi() {
		super();
	}

	public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia = numeroLicencia;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}
	
	
	
	
	

}
