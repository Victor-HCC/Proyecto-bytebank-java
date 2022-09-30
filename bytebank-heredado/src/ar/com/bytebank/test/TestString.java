package ar.com.bytebank.test;

import ar.com.bytebank.modelo.CuentaAhorros;

/*String es una clase que esta dentro del package java.lang pero no es necesario
 * importarlo o llamar a la clase con su nombre completo (FQN) ya que java hace disponible
 * el package java.lang en todos momento y todos los archivos.
 * 
 * Los objetos de la clase String son inmutables. Esto significa que, una vez creado, 
 * no se puede cambiar, por lo que cualquier cambio crea un nuevo objeto String.*/


public class TestString {

	public static void main(String[] args) {
		String nombre = "Alura";
		//String nombre2 = new String("Alura"); //No se usa esta forma, aunq String es una clase
		
		/*El String es inmutable, no se puede modificar directamente con un metodo,
		 * lo que se puede hacer es, hacer una modificacion sobre el String y reasignar
		 * a la variable esa modificacion*/
		System.out.println("Antes de replace: " + nombre);
		
		nombre.concat(" cursos online");
		System.out.println("despues de concat: " + nombre);
		
		nombre = nombre.replace("A", "a");
		System.out.println("despues de replace: " + nombre);
		
		nombre = nombre.toUpperCase();
		System.out.println(nombre);
		
		nombre = nombre.toLowerCase();
		System.out.println(nombre);
		
		char letra = nombre.charAt(4);
		System.out.println(letra);
		
		int indice = nombre.indexOf("u");
		System.out.println(indice);
		
		String sub = nombre.substring(2);
		System.out.println(sub);
		
		for(int i = 0; i < nombre.length(); i++) {
		    System.out.println(nombre.charAt(i));
		} 
		
		printLine("Hola, desde mi print");
		printLine(2345);
		printLine('a');
		printLine(new CuentaAhorros(200, 300));
		
	}
	
	/*
	public static void printLine(String valor) {
		System.out.println(valor); 		
	}
	public static void printLine(int valor) {
		System.out.println(valor); 		
	}
	public static void printLine(char valor) { //sobrecargo el metodo
		System.out.println(valor); 		
	}*/
	
	public static void printLine(Object valor) { //defino como tipo Object q es el padre de todos los objetos
		System.out.println(valor); 		
	}
}
