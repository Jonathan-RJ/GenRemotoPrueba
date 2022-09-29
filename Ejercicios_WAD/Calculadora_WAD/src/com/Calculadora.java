package com;

import java.util.Random;

public class Calculadora implements OperacionesAvanzadas, OperacionesBasicas{

	@Override
	public void sumar(double n1, double n2) {
		System.out.println("La suma es: "+(n1 + n2));
	}

	@Override
	public void raizCuadrada(double n1) {
		double resultado = Math.sqrt(n1);
		System.out.println("L raiz Cuadrada es "+resultado);
	}

	@Override
	public void restar(double ns1, double ns2) {
		System.out.println("La resta es: "+(ns1-ns2));
	}

	@Override
	public void multiplicar(double nm1, double nm2) {
		System.out.println("La multiplicacion es: "+(nm1*nm2));
	}

	@Override
	public void dividir(double nd1, double nd2) {
		System.out.println("La division es: "+(nd1/nd2));
	}

	@Override
	public void elevar(double n1, double n2) {
		double resultado = Math.pow(n1, n2);
		System.out.println("el Numero "+n1+" Elevado a "+n2+" es: "+resultado);
	}

	@Override
	public void coseno(double n1) {
		double resultado = Math.cos(n1);
		System.out.println("El coseno de "+n1+ " es igual a "+resultado);
	}

	@Override
	public void aleatorio() {
		double resultado = Math.random() * 1000;
		System.out.println("El numero aleatorio con decimal es "+resultado);
		
	}

	@Override
	public void aleatorioentero() {
		Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random
	    claseRandom.nextInt(); // Genera un número entre 0 y 1000, sin decimales raros ni nada
	    System.out.println("numero random si decimal es " +claseRandom.nextInt(1000));
	}

	@Override
	public void seno(double n1) {
		double resultado = Math.sin(n1);
		System.out.println("EL coseno del numero es; "+resultado);
		
		// TODO Auto-generated method stub
		
	}

}
