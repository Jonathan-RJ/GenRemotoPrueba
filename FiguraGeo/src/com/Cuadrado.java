package com;

public class Cuadrado extends Figuras {

	private double lado;

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(double area, double perimetro, double lado) {
		super(area, perimetro);
		this.lado = lado;
	}
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void area() {
		setArea(lado*lado);
		
		
	}
	 


}
