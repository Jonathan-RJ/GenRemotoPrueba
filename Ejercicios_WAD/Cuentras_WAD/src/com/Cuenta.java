package com;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta() {
		super();
	}


	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}


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


	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + getCantidad() + "]";
	}
	
	public void ingresa(double cant) {
		if(cant < 0) {
			
		}else {
			System.out.println("ingreso la cantidad "+ cant);
			this.cantidad = this.cantidad + cant;
		}
	}
	
	
	
	public void retirar(double retirar) {
		if(this.cantidad - retirar < 0) {
			this.cantidad=0;
			System.out.println("Tu cuenta esta en ceros");
		}else {
			System.out.println("se retiro " + retirar + " y tu cuenta queda " + (this.cantidad - retirar) );
			setCantidad(this.cantidad - retirar);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
