package com;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	//Constructores
	public Cuenta() {
	}

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	//Getters & Setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	//Método toString
	public String toString() {
		return "Cuenta [titular= " + titular + ", cantidad= " + cantidad + "]";
	}
	
	public void ing(double canti) {
		if( canti < 0) {
			
		}else {
			System.out.println("Depositó $" + canti + " pesos.");
			this.cantidad = this.cantidad + canti;
		}
	}
	
	public void ret(double ret) {
		if (this.cantidad - ret < 0) {
			this.cantidad = 0;
			System.out.println("Usted no cuenta con esta cantidad");
		}else {
			System.out.println("Retiró $" + ret + " pesos." + "\n" + "Disponible $" + (this.cantidad - ret) + " pesos." );
			setCantidad(this.cantidad - ret);
		}
	}
	
	
	
	
	
}
