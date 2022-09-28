package com;

public class Password {

	private int longitud = 8;
	private String contra;
	
	public Password() {
	}

	public Password(int longitud, String contra) {
		this.longitud = longitud;
		this.contra = contra;
	}

	public Password(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}
	
	public void generarPassword() {
		if(longitud >= 8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
			String pass = "";
			int index;
			
			for (int i = 0; i < longitud; i++) {
				index = (int) Math.round(Math.random()* letrasNumeros.length() - 1);//este codigo devuelve un indice random 
				pass = pass + letrasNumeros.charAt(index);
				System.out.println(pass);
			}
			setContra(pass);
			
			
		}else {
			System.out.println("No se ingresaron los caracteres necesarios.");
		}
	}
	public void generarPassword(int longitud) {
		if(longitud >= 8) {
			String letrasNumeros = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";
			String pass = "";
			int index;
			
			for (int i = 0; i < longitud; i++) {
				index = (int) Math.round(Math.random()* letrasNumeros.length() - 1);//este codigo devuelve un indice random 
				pass = pass + letrasNumeros.charAt(index);
				//System.out.println(pass);
			}
			setContra(pass);
			
			
		}else {
			System.out.println("No se ingresaron los caracteres necesarios.");
		}
	}
	
	
	public boolean esFuerte() {
		try {
			
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (int i = 0; i < getContra().length(); i++) {
			char capt = getContra().charAt(i);
			String letra = String.valueOf(capt);
			
			if (letra == letra.toUpperCase()) {
				mayusculas++;
			} 
			if(letra == letra.toLowerCase()) {
				minusculas++;
			}
			if(letra.matches("[0-9]+")) {
			numeros++;
			}
		}
		if(mayusculas > 2 && minusculas > 1 && numeros > 5) {
			return true;
			
		}else {
			return false;
			}
		}catch (Exception e) {
			System.out.println("Error en la longitud de contraseña");
			return false;
		}
		
	}
	
	
	


}
