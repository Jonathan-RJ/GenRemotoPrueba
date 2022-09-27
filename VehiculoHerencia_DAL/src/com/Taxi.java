package com;

public class Taxi extends vehiculo{
	private String numeroLicencia;

	public Taxi() {
		
	}

	public Taxi(String matricula, String modelo, String potenciaCV, String numeroLicencia) {
		super(matricula, modelo, potenciaCV);
		this.numeroLicencia=numeroLicencia;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(String numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}
	
	

}
