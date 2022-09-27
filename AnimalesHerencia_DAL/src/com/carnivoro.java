package com;

public class carnivoro extends Animal{
	private String habitad;

	public carnivoro() {
		
	}

	public carnivoro(String nombre, String color, double peso, double altura, String habitad) {
		super(nombre, color, peso, altura);
		this.habitad=habitad;
		// TODO Auto-generated constructor stub
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	
	
	
	
}
