package com;

public class Prismas implements Cubo, PrismaRectangular, Cilindro, Cono {

		@Override
		public void areaCo(double r1, double h1, double g1) {
			double resultado = (Math.PI * r1 * (r1+g1));
			System.out.println("El area del cono es de: " + resultado);
			
		}

		@Override
		public void volumenCo(double r2, double h2) {
			double resultado = ((Math.PI/3)* (r2*r2)* h2);
			System.out.println("El volumen del cono es: " + resultado);
			
		}

		@Override
		public void perimetroCi(double r3, double h3) {
			double resultado = ((2*Math.PI*r3) + h3);
			System.out.println("El perimetro del cilindro es: " + resultado);
		}

		@Override
		public void areaCi(double r1, double h1) {
			double resultado = (((2*Math.PI)*r1)* (r1+h1));
			System.out.println("El area del cilindro es: " + resultado);
			
		}

		@Override
		public void volumenCi(double r2, double h2) {
			double resultado = ((Math.PI*(r2*r2))* h2);
			System.out.println("El volumen del cilindro es: " + resultado);
		}

		@Override
		public void perimetroR(double b1, double a1, double h1) {
			double resultado = ((b1*4)+ (h1*4) + (a1*4));
			System.out.println("El perimetro del prisma rectangular es: " + resultado);
			
		}

		@Override
		public void areaR(double a2, double b2, double h2) {
			double resultado = (2*((b2*a2)+ (a2*h2) + (b2*h2)));
			System.out.println("El area del prisma rectangular es: " + resultado);
			
		}

		@Override
		public void volumenR(double a3, double b3, double h3) {
			double resultado = (a3*b3*h3);
			System.out.println("El volumen del prisma rectangular es: " + resultado);
			
		}

		@Override
		public void perimetroC(double l1) {
			double resultado = l1 * 12;
			System.out.println("El perimetro del cubo es: " + resultado);
			
		}

		@Override
		public void areaC(double a1) {
			double resultado = (a1*a1)*6;
			System.out.println("El area del cubo es: " + resultado);
			
		}

		@Override
		public void volumenC(double v1) {
			double resultado = v1*v1*v1;
			System.out.println("El volumen del cubo es: " + resultado);
			
		}



		

	



	

}
