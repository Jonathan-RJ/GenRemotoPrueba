package com;

public class Principal {
	public static void main(String[] args) {
		Taxi t = new Taxi();
		Autobus a = new Autobus();
		t.setMatricula("MET56");
		t.setModelo("nuevo");
		t.setPotenciaCV("50cl");
		t.setNumeroLicencia("3838474748md");
		System.out.println(t.getMatricula());
		System.out.println(t.getModelo());
		System.out.println(t.getPotenciaCV());
		System.out.println(t.getNumeroLicencia());
		
		a.setMatricula("FSY56");
		a.setModelo("nuevo1");
		a.setPotenciaCV("50cl");
		a.setNumeroPlazas(3);
		System.out.println(a.getMatricula());
		System.out.println(a.getModelo());
		System.out.println(a.getPotenciaCV());
		System.out.println(a.getNumeroPlazas());
	}

}
