package com;

public class Aviones extends Avion{
private int numpasajeros;
private int precio;
public Aviones() {
	
}
public Aviones(String nombre, String modelo, int numpasajeros, int precio) {
	super(nombre, modelo);
	this.numpasajeros = numpasajeros;
	this.precio = precio;
}
public int getNumpasajeros() {
	return numpasajeros;
}
public void setNumpasajeros(int numpasajeros) {
	this.numpasajeros = numpasajeros;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}


}
