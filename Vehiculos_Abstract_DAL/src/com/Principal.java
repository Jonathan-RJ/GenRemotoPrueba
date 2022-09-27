package com;

public class Principal {
	public static void main(String[] args) {
		VehiculosT vt = new VehiculosT();
		VehiculosA va = new VehiculosA();
		VehiculosAer vaer = new VehiculosAer();
		vt.marca();
		vt.nombre();
		vt.combustible();
		vt.pasaje();
		vt.llantas();
		vt.origen();
		System.out.println("//////////////////////////////////////");
		va.marca();
		va.nombre();
		va.combustible();
		va.pasaje();
		va.numCamarote();
		va.tripulacion();
		System.out.println("///////////////////////////////////////");
		vaer.marca();
		vaer.nombre();
		vaer.combustible();
		vaer.pasaje();
		vaer.altura();
		vaer.compania();
	}

}
