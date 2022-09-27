package com;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo();
		Taxi t1 = new Taxi();
		Autobus bus = new Autobus();
	
		v1.setMatricula("VGR-564");
		System.out.println("Matricula: " + v1.getMatricula());
		v1.setModelo("Versa");
		System.out.println("Modelo: " + v1.getModelo());
		t1.setNumLicencia(7815672);
		System.out.println("Número de licencia: " + t1.getNumLicencia());
		bus.setNumPlazas(5);
		System.out.println("Plazas: " + bus.getNumPlazas());
		
	}

}
