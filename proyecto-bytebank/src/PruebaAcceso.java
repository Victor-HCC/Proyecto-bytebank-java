
public class PruebaAcceso {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		//cuenta.saldo = 200; //ya no se puede interactuar directamente con saldo
		cuenta.depositar(400); //para cargar saldo en la cuenta tengo q usar el método depositar
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());
		
		cuenta.setAgencia(-22);
		System.out.println(cuenta.getAgencia());
		
	}
}
