package com;

public class VehiculosT  extends Vehiculos{

	@Override
	public void nombre() {
		// TODO Auto-generated method stub
		System.out.println("soy un carro");
	}

	@Override
	public void combustible() {
		// TODO Auto-generated method stub
		System.out.println("uso gasolina");
		
	}

	@Override
	public void marca() {
		// TODO Auto-generated method stub
		System.out.println("ford");
	}

	@Override
	public void pasaje() {
		// TODO Auto-generated method stub
		System.out.println("llebo 4 pasajeros");
		
	}
	
	public void llantas() {
		System.out.println("Uso 4 llantas");
	}
	public void origen() {
		System.out.println("echo en china");
	}
	

}
