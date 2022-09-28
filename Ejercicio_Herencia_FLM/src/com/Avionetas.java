package com;

public class Avionetas extends Avion {
private int numtripulantes;

public Avionetas() {
	super();
}

public Avionetas(String nombre, String modelo, int numtripulantes) {
	super(nombre, modelo);
	this.numtripulantes = numtripulantes;
}

public int getNumtripulantes() {
	return numtripulantes;
}

public void setNumtripulantes(int numtripulantes) {
	this.numtripulantes = numtripulantes;
}



}
