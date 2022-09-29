package com;

public class Trapecio extends Figuras {
	
	private double lado;
	private double baseM;
	private double base;
	private double altura;
	
	public Trapecio() {
	}
	

	public Trapecio(double area, double perimetro, double lado, double baseM, double base, double altura) {
		super(area, perimetro);
		this.lado = lado;
		this.baseM = baseM;
		this.base = base;
		this.altura = altura;
	}

	

	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getBaseM() {
		return baseM;
	}


	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public void area() {
		setArea(((getBaseM() + getBase()) * getAltura())/2);
		
	}

	@Override
	public void perimetro() {
		setPerimetro(getBaseM() + getBase() + (getLado()*2));
		
	}

}
