package ar.com.bytebank.test;

public class TestWrappers {
	
	public static void main(String[] args) {
		
		Double numeroDoble = 33.0; //autoboxing
		Boolean verdadero = true; //autoboxing
		
		Double numeroDouble2 = Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		String numeroString2 = new String("43");
		String numeroString = "43"; //autoboxing
		
		Double stringToDouble = Double.valueOf(numeroString);
		System.out.println(stringToDouble);
		
		Integer stringToInteger = Integer.valueOf(numeroString);
		System.out.println(stringToInteger);
		
		//Number es la clase de la q heredan Integer, Double, etc
		Number numero = Integer.valueOf(5);
		System.out.println(numero);
		double numeroDoublePrim = numero.doubleValue(); //unboxing
		System.out.println(numeroDoublePrim);
		
		Boolean falso = Boolean.FALSE;
		
		
	}

}
