package com;

public class Celular_empresarial extends Celular {
	private String numSerie;

	public Celular_empresarial() {
		super();
	}
	
	

	public Celular_empresarial(String marca, String modelo, String color, String numSerie) {
		super(marca, modelo, color);
		this.numSerie = numSerie;
		// TODO Auto-generated constructor stub
	}



	public String getNumSerie() {
		return numSerie;
	}



	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}


	
	
	
	
	

}
