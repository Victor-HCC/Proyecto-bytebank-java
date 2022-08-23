
public class TestReferencia {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println(primeraCuenta.saldo);
		System.out.println(segundaCuenta.saldo);
		
		primeraCuenta.saldo += 400;
		
		System.out.println(primeraCuenta.saldo);
		System.out.println(segundaCuenta.saldo);
		
		/*Ambas variables hacen referencia al mismo espacio de memoria ya que solo se hizo 
		 * una instancia de Cuenta, por tanto aunque
		 * modifique solo una de las variables ambas notaran los cambios*/
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}
	}
}
