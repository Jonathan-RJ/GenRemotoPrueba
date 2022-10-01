package com;

public class Principal {

	public static void main(String[] args) {
		Vehiculo A = new Vehiculo();
		Taxi B = new Taxi();
		Autobus C = new Autobus();
		
		
		A.setMatricula("Matricula: S16013751");
		System.out.println(A.getMatricula());
		A.setModelo("Modelo: acronico");
		System.out.println(A.getModelo());
		A.setPotencia(500);
		System.out.println(A.getPotencia());
		
		B.setNumLicencia(2254);
		System.out.println(B.getNumLicencia());
		
		C.setNumeroplazas(5012);
		System.out.println(C.getNumeroplazas());
		

	}

}
