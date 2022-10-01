package com;

public class Cajero {
	private double retiro;
	private double deposito;
	private double recarga;
	private String compañia;
	private double tipoRecarga;
	private int transferencia;
	
	public Cajero() {
		
	}

	public Cajero(double retiro, double deposito, double recarga, String compañia, double tipoRecarga) {
		super();
		this.retiro = retiro;
		this.deposito = deposito;
		this.recarga = recarga;
		this.compañia = compañia;
		this.tipoRecarga = tipoRecarga;
		this.transferencia = transferencia;
	}

	public double getRetiro() {
		return retiro;
	}

	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getRecarga() {
		return recarga;
	}

	public void setRecarga(double recarga) {
		this.recarga = recarga;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public double getTipoRecarga() {
		return tipoRecarga;
	}

	public void setTipoRecarga(double tipoRecarga) {
		this.tipoRecarga = tipoRecarga;
	}
	
	public int getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(int transferencia) {
		this.transferencia = transferencia;
	}

	public void generaCensura2(Cuenta cuenta) {
		
		if (cuenta.getNumCuenta().length() == 16) {
			cuenta.setNumCuenta("************" + cuenta.getNumCuenta().substring (12));
			
		}else {
			System.out.println("verifique la cantidad de elementos como tal del numero de cuenta");
		}
	}
	public void retirar(Cuenta cuenta) {
	if (getRetiro() < 20000 && cuenta.getCantidad() >= 100) {
		if (cuenta.getCantidad() >= getRetiro()) {
			
			double operacionRetiro = cuenta.getCantidad() - getRetiro();
			cuenta.setCantidad(operacionRetiro);
		}else {
			System.out.println("no tienes sufuiciente saldo");
		}
		
	}else {
		System.out.println("lo sentimos no se puede retirar mas de 20000 pesos ni menos de 100 pesos");
	}
	}
	public void depositar(Cuenta cuenta) {
		if (getDeposito() > 10000 ) {
				System.out.println("no se puede depositar mas de 10,000 pesos");
			
			}else {
			double operacionDeposito = cuenta.getCantidad() + getDeposito();
			System.out.println(operacionDeposito);
			}	
	    }
	public void consultarSaldo(Cuenta cuenta) {
		System.out.println("Nombre del usuario " + cuenta.getNombre() + "Apelliso" + cuenta.getApellido() + 
				"numero de cuenta" + cuenta.getNumCuenta() + "Tipo de cuenta" + cuenta.getTipoCuenta() + "saldo" 
				+ cuenta.getCantidad());
	}
	
	public void recarga(Cuenta cuenta) {
		if (getRecarga() > 500) {
			System.out.println("no se pueden hacer recargas mayores a 500 pesos");
		}
			if (cuenta.getCantidad() >= getRecarga()) {
				double operacionRecarga = cuenta.getCantidad() - getRecarga();
				cuenta.setCantidad(operacionRecarga);
				System.out.println("Compañia" + compañia);
			} else {
				System.out.println("N se puede realizar la recarga *salto insuficiente*");
		
	}
	
	}
	public void transferencia1(Cuenta cuenta) {
		double operacionTransfer = cuenta.getCantidad() - getTransferencia();
		System.out.println("Acabas de recibir una transferencia del numero de cuenta 523524584587985" + "de $" + operacionTransfer + cuenta.getCantidad());
	}	
public void generaCensura(Cuenta cuenta2) {
		
		if (cuenta2.getNumCuenta().length() == 16) {
			cuenta2.setNumCuenta("************" + cuenta2.getNumCuenta().substring (12));
			
		}else {
			System.out.println("verifique la cantidad de elementos como tal del numero de cuenta");
		}
	}
	public void retirar2(Cuenta cuenta2) {
	if (getRetiro() < 20000 && cuenta2.getCantidad() >= 100) {
			
		
		if (cuenta2.getCantidad() >= getRetiro()) {
			
			double operacionRetiro = cuenta2.getCantidad() - getRetiro();
			cuenta2.setCantidad(operacionRetiro);
		}else {
			System.out.println("no tienes sufuiciente saldo");
		}
		
	}else {
		System.out.println("lo sentimos no se puede retirar mas de 20000 pesos ni menos de 100 pesos");
	}
	}
	public void depositar2(Cuenta cuenta2) {
		if (getDeposito() > 10000 ) {
				System.out.println("no se puede depositar mas de 10,000 pesos");
			
			}else {
			double operacionDeposito = cuenta2.getCantidad() + getDeposito();
			System.out.println(operacionDeposito);
			}	
	    }
	public void consultarSaldo2(Cuenta cuenta2) {
		System.out.println("Nombre del usuario " + cuenta2.getNombre() + "Apelliso" + cuenta2.getApellido() + 
				"numero de cuenta" + cuenta2.getNumCuenta() + "Tipo de cuenta" + cuenta2.getTipoCuenta() + "saldo" 
				+ cuenta2.getCantidad());
	}
	
	public void recarga2(Cuenta cuenta2) {
		if (getRecarga() > 500) {
			System.out.println("no se pueden hacer recargas mayores a 500 pesos");
		}
			if (cuenta2.getCantidad() >= getRecarga()) {
				double operacionRecarga = cuenta2.getCantidad() - getRecarga();
				cuenta2.setCantidad(operacionRecarga);
			} else {
				System.out.println("no9 se puede realizar la recarga *salto insuficiente*");
		}
	}
	public void transferencia(Cuenta cuenta2) {
		double operacionTransferencia = cuenta2.getCantidad() - getTransferencia();
		System.out.println("Acabas de recibir una transferencia del numero de cuenta 523524584587985" + "de $" + operacionTransferencia + cuenta2.getCantidad());
	
	}
}
	


