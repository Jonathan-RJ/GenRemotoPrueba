package com;

public class Principal {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		Triangulo t1 = new Triangulo();
		Rectangulo r1 = new Rectangulo();
		Rombo rr = new Rombo();
		Trapecio tr= new Trapecio();
		
		c1.setLado(4);
		c1.area();
		System.out.println("El area del Cuadrado es: " + c1.getArea());
		
		t1.setAltura(50);
		t1.setBase(20);
		t1.area();
		System.out.println("El area del Triangulo: " + t1.getArea());
		
		r1.setBase(10);
		r1.setAltura(10);
		r1.area();
		System.out.println("El area del Rectangulo es: " + r1.getArea());
		
		rr.setDiagonar1(10);
		rr.setDiagonal2(5);
		rr.area();
		System.out.println("El area del Rombo es: " + rr.getArea());
		
		tr.setBaseMa(12);;
		tr.setBaseMe(10);
		tr.setAltura(5);
		tr.area();
		System.out.println("El area del Trapecio es: " + tr.getArea());

	}

}
