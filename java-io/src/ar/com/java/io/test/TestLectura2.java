package ar.com.java.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestLectura2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("archivo.csv"));
		//Scanner scanner = new Scanner(new File("archivo.csv"), "UTF-16");//puedo indicar con q encoding quiero q lea el archivo
		String linea;

		while(scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
//			System.out.println(linea);
			//Usando split
//			String[] lineas = linea.split(",");
//			System.out.println(Arrays.toString(lineas));
//			System.out.println(lineas[1]);
			
			//Usando Scanner
			Scanner lineaScanner = new Scanner(linea);
			lineaScanner.useDelimiter(",");
			String valor;
			while(lineaScanner.hasNextLine() && (valor = lineaScanner.nextLine()) != null) {
				System.out.println(valor);
			}
		}
			
		//usando format para formatear el String a algo q se pueda entender
//		while(scanner.hasNextLine() && (linea = scanner.nextLine()) != null) {
//			String[] lineas = linea.split(",");
//			System.out.println(lineas);	
//			System.out.println(String.format("%s", lineas));
//		}
		
		
		//metodo de formateo String
		System.out.println(String.format("Yo tengo %d años", 29)); // reemplaza el %d (formato usado en este caso) por el segundo parametro q ingreso
	}

}
