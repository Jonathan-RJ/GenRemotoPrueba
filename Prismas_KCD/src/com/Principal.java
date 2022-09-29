package com;

public class Principal {

	public static void main(String[] args) {
	
		Prismas p1 = new Prismas();
		System.out.println("\n ----- Cubo ----- \n");
		 p1.areaC(5);
		 p1.perimetroC(5);
		 p1.volumenC(5);

		 System.out.println("\n ----Prisma Rectangular----- \n");
		 p1.perimetroR(6, 4, 5);
		 p1.areaR(6, 4, 5);
		 p1.volumenR(6, 4, 5);
		 
		 System.out.println("\n ----Cilindro----- \n");
		 p1.perimetroCi(8, 5);
		 p1.areaCi(8, 5);
		 p1.volumenCi(8, 5);
		 
		 System.out.println("\n ----Cono----- \n");
		 p1.areaCo(4, 9, 13);
		 p1.volumenCo(4, 9);
	}

}
