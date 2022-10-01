package com;

public class Principal {

	public static void main(String[] args) {
		//EJERCICIO DEK CAJERO AUTOMATICO 
		//CUENTA NOMBRE, APELLIDO, CANTIDAD, NUMERO DE CUENTA, TIPO DE CUENAT (DEBITO, CREDITO)
		//PASAR COMO TAL EL NUMERO DE CUENTA PERO AL MOSTRARLE SE VERAN SOLO LOS 4 NUMEROS FINALES 
		//CUENTA CAJERO: RETIRAR, DEPOSITAR CONSULTAR EL SALDO, RECARGA 
		//NO PUEDO RETIRAR MAS DE 20,000 PESOS Y TAMPOCO PUEDO RETIRAR MENOS DE 100PESOS
		//NO PUEDO DEPOSITAR MAS DE 10,000 PESOS 
		//LIMITE DE RECARGA 500 PESOS, QUE PIDA LA COMPAÑIA, LA CANTIDAD Y SI VA A SER PAQUETE O NORMAL 
		Cuenta cuenta = new Cuenta();
		Cajero cajero = new Cajero();
		
		//generando cuenta censurada
		cuenta.setNombre("Anastacia");
		cuenta.setApellido("Alvarez Contreras");
		cuenta.setTipoCuenta("Debito");
		cuenta.setNumCuenta("5235245845879856");
		cajero.generaCensura(cuenta);
		System.out.println(cuenta.getNumCuenta());
	    
		cuenta.setCantidad(100);
		System.out.println("cantidad inicial " + cuenta.getCantidad());
		
		//generar retiro de la cuenta
//		cuenta.setCantidad(1000);
//		cajero.setRetiro(100);
//		cajero.retirar(cuenta);
//		System.out.println("cantidad inicial " + cuenta.getCantidad());
		
		//generar deposito de la cuenta
//		cajero.setDeposito(100);
//		cajero.depositar(cuenta);
//		System.out.println("cantidad despues del retiro" + cuenta.getCantidad());
		
		//consulta de saldo de cuenta
//		cajero.consultarSaldo(cuenta);
//		System.out.println("Tu salfo actual es de" + cuenta.getCantidad());
		
		//generar recarga celular
//		cajero.setRecarga(1000);
//		cajero.recarga(cuenta);
//		cajero.setCompañia("telcel");
//		System.out.println("cantidad despues de recargar" + cuenta.getCantidad() );
		
		//transferencia cuenta
		
		cajero.setTransferencia(200);
		cajero.transferencia(cuenta);
		System.out.println("su saldo actual es de " + cajero.getTransferencia());
		
		//generando cuenta2
		Cuenta cuenta2 = new Cuenta();
		Cajero cajero2 = new Cajero();
		
		cuenta2.setNombre("Fernando");
		cuenta2.setApellido("Lagunes Martinez");
		cuenta2.setTipoCuenta("Debito");
		cuenta2.setNumCuenta("1576550381005769");
		cajero2.generaCensura(cuenta2);
		System.out.println(cuenta2.getNumCuenta());
	    
		cuenta.setCantidad(13000);
		System.out.println("cantidad inicial " + cuenta2.getCantidad());
		
		//generar retiro de la cuenta
		cuenta2.setCantidad(130);
		cajero2.setRetiro(0);
		cajero2.retirar(cuenta2);
		System.out.println("cantidad inicial " + cuenta2.getCantidad());
		
		//generar deposito de la cuenta
		cajero2.setDeposito(100);
		cajero2.depositar(cuenta2);
		System.out.println("cantidad despues del retiro" + cuenta2.getCantidad());
		
		//consulta de saldo de cuenta
		cajero2.consultarSaldo(cuenta2);
		System.out.println("Tu salfo actual es de" + cuenta2.getCantidad());
		
		//generar recarga celular
		cajero2.setRecarga(700);
		cajero2.recarga(cuenta2);
		cajero2.setCompañia("telcel");
		System.out.println("cantidad despues de recargar" + cuenta2.getCantidad() );
		
		//transferencia a cuenta 2
		cajero2.transferencia(cuenta2);
		cajero2.setTransferencia(200);
		System.out.println("su saldo actual es de " + cajero2.getTransferencia());
		//
		//completar ejercicio de conde manejes dos cuentas como tal el saldo de ambas cuando una deposita a la otra 

	}

}
