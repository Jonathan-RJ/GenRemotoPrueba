package com;

public class Principal {

	public static void main(String[] args) {
		Libro harryPotter = new Libro();
		Libro AnaFrank = new Libro();
		
		harryPotter.setIsbn(12354);
		harryPotter.setTitulo("Harry Potter");
		harryPotter.setAutor("jk Rowling");
		harryPotter.setnPaginas(578);
		
		AnaFrank.setIsbn(655465);
		AnaFrank.setTitulo("Ana Frank");
		AnaFrank.setAutor("Ana Frank");
		AnaFrank.setnPaginas(3405);
		
		if (harryPotter.getnPaginas() > AnaFrank.getnPaginas()) {
			System.out.println("El libro de " + harryPotter.getTitulo() + "tiene mas paginas que el de " + AnaFrank.getTitulo());
			
		}else {
			System.out.println("El libro de " + AnaFrank.getTitulo() + "tierne mas paginas que el de " + harryPotter.getTitulo());
		}

	}

}
