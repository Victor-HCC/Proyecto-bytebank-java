
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		miCuenta.depositar(300);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(1000);
		
		System.out.println(miCuenta.saldo);
		
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		cuentaDeJimena.transferir(400, miCuenta);
		
		//prueba del retorno
		boolean puedeTransferir = cuentaDeJimena.transferir(1000, miCuenta);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No se puede realizar la transferencia");
		}
		
		System.out.println(miCuenta.saldo);
		System.out.println(cuentaDeJimena.saldo);
		
		
		
		
	}
}
