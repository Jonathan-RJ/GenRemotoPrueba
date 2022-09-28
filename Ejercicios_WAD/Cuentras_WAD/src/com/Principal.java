package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta c1 = new Cuenta();
		c1.setTitular("willian GG");
		c1.setCantidad(500);
		
		System.out.println(c1.toString());
		
		c1.ingresa(100);
		
		System.out.println(c1.toString());
		
		c1.ingresa(1000);

		System.out.println(c1.toString());
		
		
	}

}
