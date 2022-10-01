package com;

public class Trapecio extends Figuras {
	private double baseMa;
	private double baseMe;
	private double altura;
	
	public Trapecio() {
		
	}
	public Trapecio(double baseMa, double baseMe, double altura) {
		super();
		this.baseMa = baseMa;
		this.baseMe = baseMe;
	}
	public double getBaseMa() {
		return baseMa;
	}
	public void setBaseMa(double baseMa) {
		this.baseMa = baseMa;
	}
	public double getBaseMe() {
		return baseMe;
	}
	public void setBaseMe(double baseMe) {
		this.baseMe = baseMe;
	}
	
	public double getAltura() { 
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public void area() {
		setArea(altura * ((baseMa + baseMe/2)));
		
	}
	
	

}
