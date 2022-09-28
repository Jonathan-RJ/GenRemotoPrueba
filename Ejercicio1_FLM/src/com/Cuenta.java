package com;

public class Cuenta {
	//Atributos
	String titular;
	int  cantidad;
	int resultado;
	private int resultado1;
	
	public Cuenta() {
		
	}
	
	//Metodo constructor con base a parametroa

	public Cuenta(String titular, int cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
		this.resultado = resultado;
	}
	//getters y setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setresultado1(int resultado1) {
		this.resultado1 = resultado1;	
	}
	public int getresultado1(int resultado1) {
		return 0;
}
}