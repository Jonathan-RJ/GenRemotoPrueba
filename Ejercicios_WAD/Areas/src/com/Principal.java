package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Prismas p1 = new Prismas();
	
	System.out.println("Presione un numero para obtener el perimetro y area "
			+ "\n1 Cubo"
			+ "\n2 Prisma Rectangular"
			+ "\n3 Cono"
			+ "\n4 Cilindro");
	
	int numero = entrada.nextInt();
	switch (numero) {
	case 1:
		System.out.println("escriba el tamano del primer lado");
		double n1 = entrada.nextDouble();
		System.out.println("escriba el tamano del segundo lado");
		double n2 = entrada.nextDouble();
		System.out.println("escriba el tamano de la altura");
		double n3 = entrada.nextDouble();
		p1.area(n1, n2, n3);
		p1.perimetro(n1, n2, n3);
		
		break;
	case 2:
		System.out.println("escriba el tamano del primer lado");
		double r1 = entrada.nextDouble();
		System.out.println("escriba el tamano del segundo lado");
		double r2 = entrada.nextDouble();
		System.out.println("escriba el tamano de la altura");
		double r3 = entrada.nextDouble();
		p1.area(r1, r2, r3);
		p1.perimetrorec(r1, r2, r3);
		
		break;
	case 3:
		System.out.println("escriba el tamano del radio");
		double co = entrada.nextDouble();
		System.out.println("escriba el tamano del altura");
		double co2 = entrada.nextDouble();
		p1.areacono(co,co2);

		break;
	case 4:
		System.out.println("escriba el tamano del radio");
		double ra1 = entrada.nextDouble();
		System.out.println("escriba el tamano del altura");
		double al1 = entrada.nextDouble();
		p1.areacilindro(ra1, al1);

		break;

	default:
		break;
	}
	
	
	}
}
