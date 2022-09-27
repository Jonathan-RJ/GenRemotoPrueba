package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Terrestres at = new Terrestres();
		Aereos aa = new Aereos();
		Marinos am = new Marinos();
		
		at.comer();
		at.dormir();
		at.ver();
		at.tierra();
		at.correr();
		
		aa.comer();
		aa.dormir();
		aa.ver();
		aa.volar();
		aa.cazar();
		
		am.comer();
		am.dormir();
		am.ver();
		am.agua();
		am.agua();

	}

}
