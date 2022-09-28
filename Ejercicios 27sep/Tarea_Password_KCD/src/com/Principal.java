package com;

public class Principal {

	public static void main(String[] args) {
		
		Password p1 = new Password();
		
		p1.generarPassword(12);
		System.out.println(p1.getContra());
		System.out.println(p1.esFuerte());
		
	}
}
