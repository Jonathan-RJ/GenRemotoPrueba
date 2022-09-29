package com;

public class Rombo extends Figuras {
	
	private double lado;
	private double diagonalMa;
	private double diagonalMe;
	
	

	public Rombo() {
	}

	
	public Rombo(double area, double perimetro, double lado, double diagonalMa, double diagonalMe) {
		super(area, perimetro);
		this.lado = lado;
		this.diagonalMa = diagonalMa;
		this.diagonalMe = diagonalMe;
	}
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getDiagonalMa() {
		return diagonalMa;
	}


	public void setDiagonalMa(double diagonalMa) {
		this.diagonalMa = diagonalMa;
	}


	public double getDiagonalMe() {
		return diagonalMe;
	}


	public void setDiagonalMe(double diagonalMe) {
		this.diagonalMe = diagonalMe;
	}


	@Override
	public void area() {
		setArea((getDiagonalMa() * getDiagonalMe())/2);
		
	}

	@Override
	public void perimetro() {
		setPerimetro(getLado()*4);
		
	}

	
}
