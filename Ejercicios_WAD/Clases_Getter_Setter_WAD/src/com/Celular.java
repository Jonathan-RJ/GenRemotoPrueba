package com;

public class Celular {
	
	//atributos
	private String marca;
	private String color;
	private String compania;
	private String modelo;
	private int precio;
	
	
	public Celular() {
		
	}
	
	public Celular(String marca, String color, String compania, String modelo, int precio) {
		this.marca = marca;
		this.color = color;
		this.compania = compania;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}	
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}	
	
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getCompania() {
		return compania;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	
	
	
	
}
