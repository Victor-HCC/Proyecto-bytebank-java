package ar.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ar.com.bytebank.modelo.Cliente;
import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorros;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {
	
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		//Ordenar las cuentas
		//Comparador <? extend Cuenta> //el comparador recibe cualquier cosa q extienda de Cuenta (en este caso)
		//Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta(); //Implementacion de la interfaz
		//lista.sort(comparator); //sort recibe una implementacion de la interfaz comparator
		//Es una interfaz funcional xq solo hay un metodo para implementar
		lista.sort(new Comparator<Cuenta>() { //puedo pasar el metodo como argumento, por lo q ya no es necesario crear la instancia de la clase OrdenadorPorNumeroCuenta
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
			
		});
		
		System.out.println("Despues de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		
		Cuenta ccc1 = new CuentaCorriente(20, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		ccc1.setTitular(clienteCC1);
		ccc1.depositar(333.0);

		Cuenta cac2 = new CuentaAhorros(12, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		cac2.setTitular(clienteCC2);
		cac2.depositar(444.0);

		Cuenta ccc3 = new CuentaCorriente(32, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		ccc3.setTitular(clienteCC3);
		ccc3.depositar(111.0);

		Cuenta cac4 = new CuentaAhorros(25, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		cac4.setTitular(clienteCC4);
		cac4.depositar(222.0);
		
		List<Cuenta> listac = new ArrayList<>();
		listac.add(ccc1);
		listac.add(cac2);
		listac.add(ccc3);
		listac.add(cac4);
		
		System.out.println("Antes de ordenar por nombre titular");
		for(Cuenta cuenta : listac) {
			System.out.println(cuenta);
		}
		
		//Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular(); 
		listac.sort(new OrdenadorPorNombreTitular()); //no es necesario instanciar, se puede pasar directamente como argumento 
		
		System.out.println("Despues de ordenar por nombre titular");
		for(Cuenta cuenta : listac) {
			System.out.println(cuenta);
		}
		
		
		
		//antes de Java 8
		//Collections.sort(listac, new OrdenadorPorNombreTitular());
		Collections.sort(listac, new Comparator<Cuenta>( ) { //clase anonima
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
			
		});
		
		System.out.println("Rrdenar por nombre titular, pre Java 8");
		for(Cuenta cuenta : listac) {
			System.out.println(cuenta);
		}
		
		
		Collections.sort(listac);// cuando solo tiene un parametro debe haber un orden natural de ordenamiento
		
		System.out.println("Ordenar por nombre titular, por orden natural");
		for(Cuenta cuenta : listac) {
			System.out.println(cuenta);
		}
		
		
		
		
	}
		
}


class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//Forma basica
		/*if(o1.getNumero() == o2.getNumero()) {
			return 0;
		} else if(o1.getNumero() > o2.getNumero() ) {
			return 1;
		} else {
			return -1;
		}*/
		
		//Forma intermedia
		//return o1.getNumero() - o2.getNumero(); //es los mismo q el if ya q solo me interesa saber si el resultado es un numero positivo, negativo o cero
		
		//Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
			
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
		
	}
	
}













