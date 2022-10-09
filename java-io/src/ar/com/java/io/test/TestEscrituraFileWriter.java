package ar.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscrituraFileWriter {
	
	public static void main(String[] args) throws IOException {
		
//		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
//		Writer outputStreamWriter= new OutputStreamWriter(fileOutputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//		
//		
//		bufferedWriter.write("Primera linea de mi archivo generado");
//		bufferedWriter.newLine();
//		bufferedWriter.write("Segunda linea de mi archivo generado");
//		
//		bufferedWriter.close();
		
		//FileWriter ya abstrae los metodos de lectura y escritura de datos que vimos arriba
		
		FileWriter fileWriter = new FileWriter("texto-file.writer.txt");
		fileWriter.write("Primera linea via file writer");
		fileWriter.write("\r\n");//para un salto de linea (Windows)
		fileWriter.write("Segunda linea via file writer");
		fileWriter.write(System.lineSeparator()); //salto de linea, el comando detecta y devuelve el comando para hacer el salto de linea del SO en el q se ejecuta
		fileWriter.write("Tercer linea via file writer");
		fileWriter.close();
		
		
	}

}
