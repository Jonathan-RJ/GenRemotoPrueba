package com;

public class Calculadora implements OperacionAvanzadas, OperacionBasicas{

	@Override
	public void sumar(double n1, double n2) {
		double resultado = n1 + n2;
		System.out.println("La suma es: " +  resultado);
		
	}

	@Override
	public void restar(double n1, double n2) {
		double resultado = n1 - n2;
		System.out.println("La resta es: " +  resultado);
		
	}

	@Override
	public void mult(double n1, double n2) {
		double resultado = n1 * n2;
		System.out.println("El producto es: " +  resultado);
		
	}

	@Override
	public void div(double n1, double n2) {
		double resultado = n1 / n2;
		System.out.println("El cociente es: " +  resultado);
		
	}

	@Override
	public void raizC(double n1) {
		double resultado = Math.sqrt(n1);
		System.out.println("La raiz cuadrada es: " + resultado);
		
	}

	@Override
	public void potencia(double n1, double n2) {
		double resultado = Math.pow(n1, n2);
		System.out.println("El numero " + n1 + " elevado a " + n2 + "  es : " + resultado);
		
	}

	@Override
	public void numRandom1(double n1) {
		double resultado = Math.random();
		System.out.println("Numero random decimal: " + resultado);
		
	}

	@Override
	public void numRandom2(double n1) {
		int resultado = (int)(Math. random()*1000+1);
		System.out.println("El numero random entero: " + resultado);
		
	}

	@Override
	public void seno(double n1) {
		double resultado = Math.sin(n1);
		System.out.println("El seno de: " + n1 + " es: " + resultado);
		
	}

	@Override
	public void coseno(double n1) {
		double resultado = Math.cos(n1);
		System.out.println("El coseno de: " + n1 + " es: " + resultado);
		
	}

	@Override
	public void tangente(double n1) {
		double resultado = Math.tan(n1);
		System.out.println("La tangente de: " + n1 + " es: " + resultado);
		
	}

	
	

}
