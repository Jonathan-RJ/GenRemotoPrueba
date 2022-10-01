package com;

public class Taxi extends Vehiculo {
private int numLicencia;

public Taxi() {
	super();
}

public Taxi(String matricula, String modelo, int potencia, int numLicencia) {
	super(matricula, modelo, potencia);
	this.numLicencia = numLicencia;
}

public int getNumLicencia() {
	return numLicencia;
}

public void setNumLicencia(int numLicencia) {
	this.numLicencia = numLicencia;
}


}
