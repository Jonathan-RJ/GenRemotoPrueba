package com;

public class Rombo extends Figuras {
	private double diagonar1;
	private double diagonal2;
	
	public Rombo() {
		
	}
	public Rombo(double diagonar1, double diagonal2) {
		super();
		this.diagonar1 = diagonar1;
		this.diagonal2 = diagonal2;
	}
	

	public double getDiagonar1() {
		return diagonar1;
	}
	public void setDiagonar1(double diagonar1) {
		this.diagonar1 = diagonar1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	public Rombo(double area, double perimetro, double diagonar1, double diagonal2) {
		super(area, perimetro);
		
	}
	@Override
	public void area() {
		setArea((diagonar1 + diagonal2)/2);
		
	}
	

}
