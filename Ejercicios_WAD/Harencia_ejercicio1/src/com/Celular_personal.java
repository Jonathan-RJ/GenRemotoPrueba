package com;

public class Celular_personal extends Celular {
	private String nSerie;

	public Celular_personal() {
		super();
	}

	public Celular_personal(String marca, String modelo, String color, String nSerie) {
		super(marca, modelo, color);
		this.nSerie = nSerie;
	}

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}
	
	
	

}
