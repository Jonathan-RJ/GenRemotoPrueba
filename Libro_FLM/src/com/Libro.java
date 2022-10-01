package com;

public class Libro {

	private int isbn;
	private String titulo;
	private String autor;
	private int nPaginas;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	public String toString() {
		return "El libro con isbn " + isbn + " creado por el autor " + autor + "tiene " + nPaginas + " paginas";
	}
}
