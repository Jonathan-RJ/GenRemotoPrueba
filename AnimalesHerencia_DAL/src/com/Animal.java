package com;

public class Animal {
	private String nombre;
	private String color;
	private double peso;
	private double altura;
	
	public Animal() {
		
	}

	public Animal(String nombre, String color, double peso, double altura) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
