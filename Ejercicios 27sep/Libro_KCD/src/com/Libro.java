package com;

public class Libro {
	
	//Todas las variables serán ATRIBUTOS
	
	private int isbn;
	private String autor;
	private String titulo;
	private int pag;
	
	public int getisbn() {
		return isbn;
	}
	public void setisbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPag() {
		return pag;
	}
	public void setPag(int pag) {
		this.pag = pag;
	}
	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + " con titulo " + titulo + " creado por el autor " + autor + " tiene " + pag + " páginas";
	}
	
	
	
	
}
