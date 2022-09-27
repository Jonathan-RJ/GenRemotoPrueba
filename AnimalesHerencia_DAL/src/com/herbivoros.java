package com;

public class herbivoros extends Animal{
	private String terrestreAereo;

	public herbivoros() {
		
	}

	public herbivoros(String nombre, String color, double peso, double altura,String terrestreAereo) {
		super(nombre, color, peso, altura);
		this.terrestreAereo=terrestreAereo;
		// TODO Auto-generated constructor stub
	}

	public String getTerrestreAereo() {
		return terrestreAereo;
	}

	public void setTerrestreAereo(String terrestreAereo) {
		this.terrestreAereo = terrestreAereo;
	}
	
		
}
