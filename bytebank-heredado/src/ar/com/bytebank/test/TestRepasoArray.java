package ar.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int numero = 40;
		//WRAPPER
		//Integer numeroObjeto = new Integer(40); //deprecado
		Integer numeroObjeto = Integer.valueOf(40); //el valor de 40 va a ser mapeado a un objeto Integer y luego referenciado a la variable
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(numero); //autoboxing, sabe q es un int y lo para a un objeto int, haria algo asi lista.add(Integer.valueOf(numero));
		
		lista.add(numeroObjeto);
		
		//unboxing
		int valorPrimitivo = numeroObjeto; //automaticamente llama al metodo intValue() para obtener el valor del int del objeto numeroObjeto.intValue()
		
		//El objeto Integer tiene varios metodos para obtener el valor q guarda en distintos tipos de datos
		numeroObjeto.byteValue();
		numeroObjeto.doubleValue();
		numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); //bits
		System.out.println(Integer.BYTES);
		
		
		
	}

}
