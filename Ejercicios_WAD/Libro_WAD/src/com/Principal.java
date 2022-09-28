package com;

public class Principal {

	public static void main(String[] args) {
		Libro HarryPotter = new Libro();
		Libro AnaFrank = new Libro();
		
		HarryPotter.setIsbn(123);
		HarryPotter.setTitulo("Harry potter");
		HarryPotter.setAutor("Rolling");
		HarryPotter.setnPaginas(245);
		
		AnaFrank.setIsbn(235);
		AnaFrank.setTitulo("Ana frank");
		AnaFrank.setAutor("Ana frank");
		AnaFrank.setnPaginas(224);
		System.out.println(AnaFrank.toString());
		System.out.println(HarryPotter.toString());
		
		
		if(HarryPotter.getnPaginas() > AnaFrank.getnPaginas()) {
			System.out.println("El libro de "+ HarryPotter.getTitulo() + " tiene mas paginas que el de "+ AnaFrank.getnPaginas() );
			
		}else {
			System.out.println("El libro de " + AnaFrank.getnPaginas() + " Tiene mas paginas que el de "+ AnaFrank.getnPaginas());
		}
		

	}

}
