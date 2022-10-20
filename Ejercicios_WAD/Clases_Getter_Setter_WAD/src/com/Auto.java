package com;

public class Auto {
	//attributos
	//encapsulamiento
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	private int numSerie;
	//Encapslamiento, Herencia, polimorfismo y Abstraccion
	
	//metodo contructor vacio
		public Auto() {	
			
		}
	
	//metodo constructor con base de parametros
	public Auto(String placa, String marca, String modelo, String color, double precio, int numSerie) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.numSerie = numSerie;
		
	}
	
	//getters y setters
	
	//setter se ve como algo que se deposita
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	//getter en el caso de los que manda a llamar el valor
	public String getPlaca() {
		return placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getNumSerie() {
		return numSerie;
	}

}
