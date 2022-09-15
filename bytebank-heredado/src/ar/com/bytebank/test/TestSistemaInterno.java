package ar.com.bytebank.test;

import ar.com.bytebank.modelo.*;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		gerente1.setClave("Alura");
		admin.setClave("Alura");
		
		sistema.auntentica(gerente1);
		sistema.auntentica(admin);
	}
}
