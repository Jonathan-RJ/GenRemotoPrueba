package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio CALCULADORA; HACER UN MENU CON SWITCH,
		// PEDIR LOS DATOS POR CONSOLA (SCANNER) Y DEVOLVER EL RESULTADO
		Scanner entrada = new Scanner(System.in); 
		Calculadora c1 = new Calculadora();
		
		
		System.out.println("elige 1 si desea sumar, "
				+ "\n2 si desea restar, \n"
				+ "3 si desea multiplicar y "
				+ "\n4 si desea dividir"
				+ "\n5 si desea generar un num aleatorio"
				+ "\n6 si desea generar uu num aleatorio sin decimales"
				+ "\n7 si desea sacar la raiz"
				+ "\n8 si deseas sacar el cos"
				+ "\n9 si deseas sacar el sin"
				+ "\n10 un numero elevado a otro numero");
		int num = entrada.nextInt();
		switch (num) {
		case 1:
			System.out.println("Pon un numero ");
			double n1 = entrada.nextDouble();
			System.out.println("Pon otro numero: ");
			double n2 = entrada.nextDouble();
			c1.sumar(n1, n2);
			break;
		case 2:
			System.out.println("Pon un numero ");
			double nr1 = entrada.nextDouble();
			System.out.println("Pon otro numero: ");
			double nr2 = entrada.nextDouble();
			c1.restar(nr1, nr2);
			break;
		case 3:
			System.out.println("Pon un numero ");
			double nm1 = entrada.nextDouble();
			System.out.println("Pon otro numero: ");
			double nm2 = entrada.nextDouble();
			c1.multiplicar(nm1, nm2);
			break;
		case 4:
			System.out.println("Pon un numero ");
			double nd1 = entrada.nextDouble();
			System.out.println("Pon otro numero: ");
			double nd2 = entrada.nextDouble();
			if(nd2 <= 0) {
				System.out.println("error");
			}else {
			c1.dividir(nd1, nd2);
			}
			break;
		case 5:
			
			c1.aleatorio();
			break;
		case 6:
			
			c1.aleatorioentero();
			break;
		case 7:
			System.out.println("Numero que deseas sacar su raiz ");
			double a1 = entrada.nextDouble();
			c1.raizCuadrada(a1);
			break;
		case 8:
			System.out.println("escribe l numero que desea sacar el coseno: ");
			double cos = entrada.nextDouble();
			c1.coseno(cos);
				break;
		case 9:
			System.out.println("escribe l numero que desea sacar el seno: ");
			double sin = entrada.nextDouble();
			c1.seno(sin);
				break;
		case 10:
			System.out.println("escribe l numero que desea ser elevado: ");
			double nume1 = entrada.nextDouble();
			System.out.println("escribe l numero que desea elevar: ");
			double nume2 = entrada.nextDouble();
			c1.elevar(nume1, nume2);;
				break;

		default:
			System.out.println("UN NUMERO DEL 1 AL 10 ");
			break;
		}
		
	}

}
