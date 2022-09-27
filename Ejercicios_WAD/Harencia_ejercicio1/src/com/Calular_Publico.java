package com;

public class Calular_Publico  extends Celular{
	private String matricula;

	public Calular_Publico() {
		super();
	}

	public Calular_Publico(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color);
		this.matricula = matricula;
		// TODO Auto-generated constructor stub
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	

}
