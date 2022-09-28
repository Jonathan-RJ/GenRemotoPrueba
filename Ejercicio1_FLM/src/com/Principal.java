package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cuenta c1 = new Cuenta();
		
		
		c1.setTitular("Titular: Fernando");
		System.out.println(c1.getTitular());
		System.out.println("Intoduzca la cantidad a depositar");
		int cantidad = entrada.nextInt();
		System.out.println("Intoduzca la cantidad a retirar");
		int retiro = entrada.nextInt();
		
		
		 int resultado1 = cantidad - retiro;


		
		 System.out.println("La camtidad depositada es de: " + cantidad);
			System.out.println("el retido es de: " + retiro);
			
				
				System.out.println("Su saldo actual es de: " + resultado1);
				
			
			
				
	}

}

