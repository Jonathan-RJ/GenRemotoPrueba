package com;

public class Cuadrado extends Figura{
	private double lado;

	public Cuadrado() {
	
	}
	
	public Cuadrado(double area, double perimetro,double lado) {
		super(area, perimetro);
		this.lado=lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void area() {
		setArea(getLado()*getLado());
	}
	public void perimetro() {
		setPerimetro(getLado()+getLado()+getLado()+getLado());
	}

}
