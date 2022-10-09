package ar.com.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestEscritura {
	
	public static void main(String[] args) throws IOException {
		
		//genero el archivo
		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
		//proceso el archivo
		Writer outputStreamWriter= new OutputStreamWriter(fileOutputStream);
		//escribir el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("Primera linea de mi archivo generado");
		bufferedWriter.newLine();//para tener un salto de linea
		bufferedWriter.write("Segunda linea de mi archivo generado");
		
		bufferedWriter.close();//genera el archivo con las lineas y manda el archivo al file system
		
		
	}

}
