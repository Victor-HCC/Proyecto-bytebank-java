package ar.com.bytebank.test;

public class TestGerente {

	public static void main(String[] args) {
		//package name + class name //si no importamos la clase tenemos que llamar a la clase por su nombre completo
		ar.com.bytebank.modelo.Gerente gerente = new ar.com.bytebank.modelo.Gerente();
		//gerente.setSalario(5000);
		
		//Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setClave("Alura");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("Alura"));
	}
}
