
public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("235235235"); 
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(titular.getNombre());  /*Los 3 hacen referencia al objeto cliente
		q se creo en la linea 7*/
		
	}
}
