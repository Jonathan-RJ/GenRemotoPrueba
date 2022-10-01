package com;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		
		c1.setTitular("Fernando Lagunes");
		c1.setCantidad(500);

		System.out.println(c1.toString());
		
		c1.infresa(100);
		System.out.println(c1.toString());
		
		c1.infresa(1000);
		System.out.println(c1.toString());
		
		c1.retirar(600);
		System.out.println(c1.toString());
	}

}
