package com;

public class Principal {
	public static void main(String[] args) {
		carnivoro c = new carnivoro();
		herbivoros h = new herbivoros();
		c.setNombre("perro");
		c.setColor("negro");
		c.setPeso(10.5);
		c.setAltura(10.5);
		c.setHabitad("casa");
		
		System.out.println(c.getNombre());
		System.out.println(c.getColor());
		System.out.println(c.getPeso());
		System.out.println(c.getAltura());
		System.out.println(c.getHabitad());
		
		h.setNombre("perro");
		h.setColor("negro");
		h.setPeso(10.5);
		h.setAltura(10.5);
		h.setTerrestreAereo("terrestre");
		
		System.out.println(h.getNombre());
		System.out.println(h.getColor());
		System.out.println(h.getPeso());
		System.out.println(h.getAltura());
		System.out.println(h.getTerrestreAereo());
	}

}
