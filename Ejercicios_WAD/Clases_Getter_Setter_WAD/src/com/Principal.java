//alt shift S
package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//instanciando la clase
		Auto a1 = new Auto();
		a1.setPlaca("holiwis"); //Setters exclusivamente solo van na recivir valores
		System.out.println(a1.getPlaca()); //El getter solo recupera datos cmo tal el valor ingresado
		//a.nombre 
		//El encapsulamiento evitta el contacto
		
		//paso de parametros por medio del metodo contructor
		Auto a2 = new Auto("xyjasf3","nissan","dosmildiecisiete","rojo", 123.12, 1232);
		
		System.out.println(a2.getPlaca());
		System.out.println(a2.getMarca());
		System.out.println(a2.getModelo());
		System.out.println(a2.getColor());
		System.out.println(a2.getPrecio());
		System.out.println(a2.getNumSerie());
		
	    Celular c1 = new Celular("Apple","Rojo","Telcel","Iphone 14", 10);
		
		System.out.println(c1.getMarca());
		System.out.println(c1.getColor());
		System.out.println(c1.getCompania());
		System.out.println(c1.getModelo());
		System.out.println(c1.getPrecio());
		
		Calzado cal = new Calzado("nike", "air force 1", "Blanco", 1200);
		
		System.out.println(cal.getMarca());
		System.out.println(cal.getModelo());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrecio());
		
		
		
	}

}
