package ar.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TestEscrituraPrintStream {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
//		Writer outputStreamWriter= new OutputStreamWriter(fileOutputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//		
//		bufferedWriter.write("Primera linea de mi archivo generado");
//		bufferedWriter.newLine();//para tener un salto de linea
//		bufferedWriter.write("Segunda linea de mi archivo generado");
//		
//		bufferedWriter.close();
		
		
		PrintStream printStream = new PrintStream("text-print-stream.txt");
		printStream.println("Primera linea generada via print stream");
		printStream.close();
		
	}
	
}
