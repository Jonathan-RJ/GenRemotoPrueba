package com;

public abstract class Figuras {
	//EJERCICIO EN DONDE SAQUEMOS EL AREA Y PERIMETRO DE LAS FIGURAS FEOMETRICAS
	//CUADRADO, TRIANGULO, RECTANGULO, ROMBO Y TRAPECIO
	//ATRIBUTOS O PROPIEDADES COMPARTEN LAS CLASES HIJAS
	private double area;
	private double perimetro;
	public Figuras() {
		
	}
	public Figuras(double area, double perimetro) {
		super();
		this.area = area;
		this.perimetro = perimetro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public abstract void area();
	
}

