package com;

public class Principal {

	public static void main(String[] args) {

		Libro l1 = new Libro();
		Libro l2 = new Libro();
		
		l1.setisbn(123456);
		l1.setAutor("J.K. Rowling");
		l1.setTitulo("Harry Potter");
		l1.setPag(256);
		
		l2.setTitulo("El señor de los anillos");
		l2.setAutor("J. R. R. Tolkien");
		l2.setisbn(85749586);
		l2.setPag(566);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());		
		
		
		if (l1.getPag() < l2.getPag()) {
			System.out.println(l2.getTitulo() + " tiene más páginas");
		}else {
			System.out.println(l1.getTitulo() + " tiene más páginas");
		}
		

	}

}
