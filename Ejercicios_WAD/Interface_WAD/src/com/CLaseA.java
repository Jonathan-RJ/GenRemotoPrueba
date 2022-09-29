package com;
// NO EXISTE LIMITE PARA CUANTAS INTERFACES SE PUEDEN (IMPLEMENTAR),
// y ES UNA MANERA DE SIMULAR
// IMPORTANTE; EN LA HERENCIA LA PALABRA RESERVADA ES "EXTENDS"
// Y EN LAS INTERFACES ESS "IMPLEMENTS"
public class CLaseA implements InterfaceA, InterfaceB, InterfaceC{

	@Override
	public void caminar() {

		System.out.println("EStoy caminando");
	}

	@Override
	public void comer() {
        System.out.println("Estoy cominedo");		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void observar() {
		// TODO Auto-generated method stub
		
	}

}
