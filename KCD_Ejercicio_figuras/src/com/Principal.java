package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejercicio sacar area y perimetro de las figuras geometricas dadas
		
		Cuadrado c1 = new Cuadrado();
		Rectangulo r1 = new Rectangulo();
		Rombo r2 = new Rombo();
		Trapecio t2 = new Trapecio();
		Triangulo t1 = new Triangulo();
		
		c1.setLado(4);
		c1.area();//Se declara el metodo en el principal para que lo mande llamar, se ejecute y no marque error
		c1.getPerimetro();
		System.out.println("\n - - - - Cuadrado - - - - \n");
		System.out.println("El lado es: " + c1.getLado());
		System.out.println("El perimetro es: " + c1.getPerimetro());
		System.out.println("El area es: " + c1.getArea());
		
		r1.setBase(13);
		r1.setAltura(6);
		r1.area();
		r1.perimetro();
		System.out.println("\n - - - - Rectangulo - - - - \n");
		System.out.println("La base del rectangulo es: " + r1.getBase() +  " La altura del rectangulo es: " + r1.getAltura());
		System.out.println("El perimetro del rectangulo es: " + r1.getPerimetro());
		System.out.println("El area del rectangulo es: " + r1.getArea());
		
		r2.setLado(7);
		r2.setDiagonalMa(10);
		r2.setDiagonalMe(7);
		r2.area();
		r2.perimetro();
		
		System.out.println("\n - - - - Rombo - - - - \n");
		System.out.println("El lado es: " + r2.getLado() + "\n" + "La diagonal mayor es: " + r2.getDiagonalMa() + "\n" + "La diagonal menor es: " + r2.getDiagonalMe());
		System.out.println("El perimetro es: " + r2.getPerimetro());
		System.out.println("El area es: " + r2.getPerimetro());
		
		t2.setAltura(4);
		t2.setBase(6);
		t2.setBaseM(9);
		t2.setLado(5);
		t2.area();
		t2.perimetro();
		
		System.out.println("\n - - - - Trapecio - - - - \n");
		System.out.println("El lado es: " + t2.getLado() + "\n" + "La altura es: " + t2.getAltura() + "\n" + "La base mayor es: " + t2.getBaseM() + "\n" + "La base menor es: " + t2.getBase() );
		System.out.println("El perimetro es: " + t2.getPerimetro());
		System.out.println("EL area es: " + t2.getArea());
		
		t1.setAltura(9);
		t1.setBase(14);
		t1.setLado1(18);
		t1.setLado2(15);
		t1.area();
		t1.perimetro();
		
		System.out.println("\n - - - - Triangulo - - - - \n");
		System.out.println("La base es: " + t1.getBase() + "\n" + "La altura es: " + t1.getAltura() + "\n" + "El lado a es: " + t1.getLado1() + "\n" +"El lado b es: " + t1.getLado2());
		System.out.println("El perimetro es: " + t1.getPerimetro());
		System.out.println("El area es: " + t1.getArea());
		
	}

}
