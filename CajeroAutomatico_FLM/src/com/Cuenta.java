package com;

public class Cuenta {
	private String nombre;
	private String apellido;
	private double cantidad;
	private String numCuenta;
	private String tipoCuenta;
	
	
	public Cuenta() {
		
	}
	public Cuenta(String nombre, String apellido, double cantidad, String numCuenta, String tipoCuenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cantidad = cantidad;
		this.numCuenta = numCuenta;
		this.tipoCuenta = tipoCuenta;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	
	}
	
	
	
		
	
//	@Override
//	public String toString() {
//		return  "nombre [nombre=" + nombre + ", apellido=" + apellido + ", Cantidad=" + cantidad + ", numCuenta=" + numCuenta + ", Tipo de cuenta=" + tipoCuenta + "]";
//	}
	
	

}
