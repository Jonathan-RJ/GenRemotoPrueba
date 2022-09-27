package com;

public class VehiculosAer extends Vehiculos{

	@Override
	public void nombre() {
		// TODO Auto-generated method stub
		System.out.println("soy un avion");
		
	}

	@Override
	public void combustible() {
		// TODO Auto-generated method stub
		System.out.println("soy un diesel");
		
	}

	@Override
	public void marca() {
		// TODO Auto-generated method stub
		System.out.println("aeromexico");
	}

	@Override
	public void pasaje() {
		// TODO Auto-generated method stub
		System.out.println("100 pasajeros");
	}
	
	public void altura() {
		System.out.println("100 pies de altura");
	}
	public void compania() {
		System.out.println("volaris");
	}

}
