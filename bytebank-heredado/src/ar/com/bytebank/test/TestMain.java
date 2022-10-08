package ar.com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);//los argumentos son los q se pueden enviar via linea de comandos o al ejecutar el main
		}
		
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67;
		
		//Quiero agruparlas en una sola referencia
		//Array, son objetos
		
		int[] edades = new int[5]; //Array, estructura con un conjunto de datos, se tiene q definir su demension
		edades[2] = 30; //definimos el valor del indice 2 del array, el resto por default se iniciaron en cero ya q es tipo int
		edades[0] = 29;
        edades[1] = 39;
        edades[3] = 59;
        edades[4] = 69;
		
		System.out.println(edades[0]);
		
		int tamanoArray = edades.length;//length me da el tamaño del array
		System.out.println(tamanoArray);
		
		for(int i = 0; i < tamanoArray; i++) {//para recorrer los valores de un array
			System.out.println(edades[i]);
		}
	}
	
}
