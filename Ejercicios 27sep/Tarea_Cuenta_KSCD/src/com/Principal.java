package com;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta();
		
		c1.setTitular("Kevin Castillo");
		c1.setCantidad(223.00);
		
		System.out.println(c1.toString());
		
		c1.ing(100);
		System.out.println(c1.toString());
		
		c1.ing(400);
		System.out.println(c1.toString());
		
		c1.ret(600);
		System.out.println(c1.toString());

	}
	

}
