package com;

public class Trapecio extends Figura{
	private double bMenor;
	private double bMayor;
	private double altura;
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double ladoD;
	
	public Trapecio() {
		
	}
	
	public Trapecio(double area, double perimetro,double nMenor, double mMayor, double altura,double ladoA,double ladoB,double ladoC,double ladoD) {
		super(area, perimetro);
		this.bMenor = bMenor;
		this.bMayor = bMayor;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB =  ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		
	}
	

	public double getbMenor() {
		return bMenor;
	}

	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}

	public double getbMayor() {
		return bMayor;
	}

	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLadoA() {
		return ladoA;
	}
	
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	public double getLadoD() {
		return ladoD;
	}
	
	public void setLadoD(double ladoD) {
		this.ladoD = ladoD;
	}

	@Override
	public void area() {
		setArea(((getbMenor()+getbMayor())/2)*getAltura());
		
	}

	@Override
	public void perimetro() {
		setPerimetro(getLadoA()+getLadoB()+getLadoC()+getLadoD());
		// TODO Auto-generated method stub
		
	}

}
