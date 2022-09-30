package com;

public class Prismas implements Cilindro, Cono, Rectangular, Cubo {

	@Override
	public void area(double l1, double l2, double l3) {
		double resultado = l1*l2*l3;
		System.out.println("El volumen del cubo es: " + resultado);
		
	}

	@Override
	public void perimetro(double l1, double l2, double l3) {
		double resultado = l1+ l2 + l3;
		System.out.println("El perimetro del cubo es " + resultado);
	}

	@Override
	public void arearec(double lado1, double lado2, double altura) {
		double resultado = lado1 * lado2 * altura;
		System.out.println("El volumen del Prisma rectangular es " + resultado);
	}

	@Override
	public void perimetrorec(double lado1, double lado2, double altura) {
		double resultado = lado1+ lado2 + altura;
		System.out.println("El perimetro del cubo es " + resultado);
		
	}

	@Override
	public void areacono(double radio, double altura) {
		double r = radio*radio;
		double b = (r*altura)*t;
		double resultado = PI * b;
		
		System.out.println("El Volumen del cono es "+ resultado);
	}

	@Override
	public void areacilindro(double radio, double altura) {
		double resultado = (PPi*((radio*radio)*(altura)));
		System.out.println("El volumen del cilindro es; " + resultado);
	}


}
