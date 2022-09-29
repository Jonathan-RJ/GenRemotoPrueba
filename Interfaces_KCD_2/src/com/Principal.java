package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		
		//Ejercicio calculadora. Hacer menu con switch, pedir datos por consola y devolver el resultado
		//En la division el 2do numero no puede ser 0, si se introduce un 0, notificar error
		
		
		Calculadora c1 = new Calculadora();
		
		System.out.println("Elige el numero de la operacion que deseas hacer: ");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		System.out.println("5.- Raiz cuadrada");
		System.out.println("6.- Potencia");
		System.out.println("7.- Crear número decimal aleatorio");
		System.out.println("8.- Crear número entero aleatorio");
		System.out.println("9.- Sacar seno");
		System.out.println("10.- Sacar coseno");
		System.out.println("11.- Sacar tangente");
		int operacion = entrada.nextInt();
		System.out.println("\n ---------- \n");
		switch (operacion) {

		case 1:
			System.out.println("Introduce el 1er numero: ");
			double n1 = entrada.nextDouble();
			System.out.println("Introduce el 2do numero: ");
			double n2 = entrada.nextDouble();
			c1.sumar(n1, n2);
			
			break;
		case 2:
			
			System.out.println("Introduce el 1er numero: ");
			double n3 = entrada.nextDouble();
			System.out.println("Introduce el 2do numero: ");
			double n4 = entrada.nextDouble();
			c1.restar(n3, n4);
			
			break;
			
		case 3:
			System.out.println("Introduce el 1er numero: ");
			double n5 = entrada.nextDouble();
			System.out.println("Introduce el 2do numero: ");
			double n6 = entrada.nextDouble();
			c1.mult(n5, n6);
			break;
			
		case 4:
			System.out.println("Introduce el 1er numero: ");
			double n7 = entrada.nextDouble();
			System.out.println("Introduce el 2do numero(debe ser diferente de '0'): ");
			double n8 = entrada.nextDouble();
			if (n8 == 0) {
				System.out.println("Error");
			}else {
			c1.div(n7, n8);
			
			}
			break;

		case 5:
			System.out.println("Introduce el numero para sacar su raiz cuadrada: ");
			double n9 = entrada.nextDouble();
			c1.raizC(n9);
			
			break;
			
		case 6:
			System.out.println("Introduce el numero: ");
			double n10 = entrada.nextDouble();
			System.out.println("Introduce la potencia: ");
			double n11 = entrada.nextDouble();
			c1.potencia(n10, n11);
			
			break;
		case 7:
			c1.numRandom1(4);
			
			break;
			
		case 8:
			c1.numRandom2(389);
			break;
			
		case 9:
			System.out.println("Introduce el numero para sacar seno: ");
			double n12 = entrada.nextDouble();
			c1.seno(n12);
			break;
			
		case 10:
			System.out.println("Introduce el numero para sacar coseno: ");
			double n13 = entrada.nextDouble();
			c1.coseno(n13);
			
			break;
			
		case 11: 
			System.out.println("Introduce el numero para sacar tangente: ");
			double n14 = entrada.nextDouble();
			c1.tangente(n14);
			
		default:
			break;
		}
		
				
		
	
	}
	
	

}
