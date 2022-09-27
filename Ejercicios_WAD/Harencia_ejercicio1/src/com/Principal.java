package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Celular_personal  c1 = new Celular_personal();
		Celular_empresarial  c2 = new Celular_empresarial();
		Calular_Publico c3 = new Calular_Publico();
		
		
		c1.setMarca("Iphone");
		System.out.println(c1.getMarca());
		c2.setNumSerie("qwerty");
		System.out.println(c2.getNumSerie());
		c3.setMatricula("ytrewq");
		System.out.println(c3.getMatricula());

	}

}
