package com;

public class Principal {

	public static void main(String[] args) {
	   Taxi v1 = new Taxi();
	   Autobus v2 = new Autobus();
	   
	   v1.setNumeroLicencia("qwerty");
	   System.out.println(v1.getNumeroLicencia());
	   
	   v2.setNumeroPlazas(12);
	   System.out.println(v2.getNumeroPlazas());

	}

}
