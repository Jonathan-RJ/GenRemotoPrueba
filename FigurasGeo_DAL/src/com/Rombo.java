package com;

public class Rombo extends Figura{
	private double diagonalMenor;
	private double diagonalMayor;
	private double lado;
	
	public Rombo() {
		
	}

	public Rombo(double area, double perimetro, double diagonalMenor,double diagonalMayor,double lado) {
		super(area, perimetro);
		this.diagonalMayor=diagonalMayor;
		this.diagonalMenor=diagonalMenor;
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}
	
	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public void setLado(double lado) {
		this.lado=lado;
	}
	public double getLado() {
		return lado;
	}

	@Override
	public void area() {
		setArea((getDiagonalMenor()*getDiagonalMayor())/2);
		
	}

	@Override
	public void perimetro() {
		// TODO Auto-generated method stub
		setPerimetro(getLado()+getLado()+getLado()+getLado());
	}

}
