package ar.com.bytebank.test;

import ar.com.bytebank.modelo.Funcionario;
import ar.com.bytebank.modelo.Gerente;

public class TestReferencias {

	public static void main(String[] args) {
		
		//Polimorfismo
		/*El elemento mas generico puede ser adaptado el mas especifico,
		 * se puede instanciar la clase gerente poniendo como tipo
		 * la clase funcionario*/
		
		Funcionario funcionario = new Gerente(); /* a pesar de estar instanciado como gerente 
		sus referencias son las de Funcionario por lo que no tiene los metodos de Gerente*/
		
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Victor");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		//funcionario.iniciarSesion(); // no sus referencias son las de Funcionario, no las de Gerente
	}
}
