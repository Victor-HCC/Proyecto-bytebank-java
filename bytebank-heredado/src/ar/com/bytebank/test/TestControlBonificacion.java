package ar.com.bytebank.test;

//import ar.com.bytebank.modelo.Contador;
//import ar.com.bytebank.modelo.ControlBonificacion;
//import ar.com.bytebank.modelo.Funcionario;
//import ar.com.bytebank.modelo.Gerente;
import ar.com.bytebank.modelo.*;//para importar todos los archivos de ese package
/*Si se va a usar varias clases de un package es conveniente importar todo el package pero
 * si solo se va a usar una clase en especifico se importa solo esa clase*/

public class TestControlBonificacion {

	
	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente victor = new Gerente();
		victor.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		
		controlBonificacion.registrarSalario(victor);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		controlBonificacion.registrarSalario(alexis);
		/*Aunque se haya definido el metodo registrar salario con parametro funcionario,
		 * igual es aplicable para los objetos GErente y Contador ya q heredan de Funcionario
		 * y su tipo mas general es Funcionario*/
	}
}
