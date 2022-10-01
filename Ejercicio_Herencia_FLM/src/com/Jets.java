package com;

public class Jets extends Avion {
private int peso;

public Jets() {
	
}

public Jets(String nombre, String modelo, int peso) {
	super(nombre, modelo);
	this.peso = peso;
}

public int getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}

}
