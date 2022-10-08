package ar.com.bytebank.test;

import java.util.ArrayList; //Tipo de objeto que crea un array de objetos por nosotros, guarda las referencias
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a q acepte un solo tipo de objeto (generics)
		List<Cuenta> lista = new ArrayList<>();//el tipo se tiene q especificar en el primer <>, en el segundo es opcional
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente); //no lo puedo agregar xq se definio como un array de tipo Cuenta
		
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for(int i = 0; i < lista.size(); i++) {//el size me da la cantidad de elementos no de espacios
			System.out.println(lista.get(i));
		}
		
		//Por cada elemento (cuenta) del array : lista
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc);
		System.out.println(contiene);
		
		if(lista.contains(cc)) {
			System.out.println("Si");
		}
		
		if(lista.contains(cc3)) { //cc y cc3 contienen ls misma informacion pero las referencias no son iguales
			System.out.println("Si (sobre-escribiendo equals)");
		} else {
			System.out.println("No");
		}
		/*contains usa el metodo equals y como los sobre escribimos ahora si compara los valores de la referencias*/
		
		
		
	}

}
