package ar.com.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//String dato = "Diego"; //tiene q ser serializado para guardar y traer el dato del disco
		
//	Cliente dato = new Cliente("Diego", 123456);
		
		//Output -> quien envia 
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		objectOutputStream.writeObject(dato);
//		objectOutputStream.close();
		
		//Input -> quien lee o recibe
		ObjectInputStream objectInputStream = 
				new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente resultado = (Cliente) objectInputStream.readObject();
		System.out.println(resultado.getDocumento());
		objectInputStream.close();
	}

}
