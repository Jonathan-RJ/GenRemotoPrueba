package com;

public class Principal {
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Triangulo t1= new Triangulo();
		Rectangulo r1 = new Rectangulo();
		Trapecio tr1 = new Trapecio();
		Rombo rom = new Rombo();
		c1.setLado(4);
		c1.area();
		c1.perimetro();
		System.out.println("El area del cuadrado es:"+ c1.getArea()+" y el perimetro es: "+c1.getPerimetro());
		
		t1.setBase(4);
		t1.setAltura(6);
		t1.area();
		t1.perimetro();
		System.out.println("El area del triangulo es:"+ t1.getArea()+" y el perimetro es: "+t1.getPerimetro());

		r1.setBase(4);
		r1.setAltura(6);
		r1.area();
		r1.perimetro();
		System.out.println("El area del rectangulo es:"+ r1.getArea()+" y el perimetro es: "+r1.getPerimetro());
		
		rom.setDiagonalMenor(5);
		rom.setDiagonalMayor(8);
		rom.setLado(6);
		rom.area();
		rom.perimetro();
		System.out.println("El area del rombo es:"+ rom.getArea()+" y el perimetro es: "+rom.getPerimetro());
		
		tr1.setbMayor(12);
		tr1.setbMenor(6);
		tr1.setAltura(8);
		tr1.setLadoA(4);
		tr1.setLadoB(5);
		tr1.setLadoC(8);
		tr1.setLadoD(9);
		tr1.area();
		tr1.perimetro();
		System.out.println("El area del trapecio es:"+ tr1.getArea()+" y el perimetro es: "+tr1.getPerimetro());
	}
 
}
