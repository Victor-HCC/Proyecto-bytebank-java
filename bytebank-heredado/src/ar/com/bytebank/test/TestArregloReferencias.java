package ar.com.bytebank.test;

import ar.com.bytebank.modelo.Cuenta;
import ar.com.bytebank.modelo.CuentaAhorros;
import ar.com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[1] = cc;
		
		CuentaAhorros ca = new CuentaAhorros(44, 55);
		cuentas[3] = ca;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new CuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		
		//CuentaCorriente cuenta = cuentas[1]; No lo puedo asignar porque la referencia es de tipo CuentaCorriente y el elemento al q se hace referencia es de tipo Cuenta(el array)
		//Cast
		CuentaCorriente cuenta = (CuentaCorriente) cuentas[1]; //Casterar, declarando el tipo adelante puedo obligar a q se haga la asigancion ya que se q cc (cuentas[1) es de tipo CuentaCorriente
		//castear es decirle a java q el objeto es del tipo q estas ingresando
		System.out.println("Con cast " + cuenta);
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		
		//para hacer un array mas general se puede definir con el tipo Object
		Object[] referencias = new Object[5];
		referencias[0] = new CuentaCorriente(17, 46);
		referencias[1] = new CuentaAhorros(47, 246);
		System.out.println(referencias[0]);
		System.out.println(referencias[1]);
		
		
	}
	
}
