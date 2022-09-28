package com;

public class Principal {

	public static void main(String[] args) {
		Avion A = new Avion();
		Avion B = new Avion();
		Avionetas C = new Avionetas();
		Jets D = new Jets();
		Aviones E = new Aviones();
		
		
		A.setNombre("boing");
		System.out.println(A.getNombre());
		
		B.setModelo("91APP10");
		System.out.println(B.getModelo());
		
		C.setNumtripulantes(2);
		System.out.println(C.getNumtripulantes());
		
		D.setPeso(500);
		System.out.println(D.getPeso());
		
		E.setNumpasajeros(285);
		System.out.println(E.getNumpasajeros());
		
		E.setPrecio(1400);
	    System.out.println(E.getPrecio());
	}

}
