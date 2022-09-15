package ar.com.bytebank.test;

import ar.com.bytebank.modelo.Contador;
import ar.com.bytebank.modelo.Funcionario;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("523232424");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
