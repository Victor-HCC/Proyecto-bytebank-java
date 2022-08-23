
public class PruebaConstructor {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(55);/*como modificamos el constructor ahora tenemos q pasarle 
		el valor para el parametro agencia.
		Constinuar con el metodo setAgencia() depende del modelo de negocio, si una vez creada
		la cuenta no puedo cambiar de agencia el metodo set no tiene sentido por lo q se tiene
		q eliminar*/
		
		System.out.println(cuenta.getAgencia());
		
		Cuenta cuenta2 = new Cuenta(332);
		Cuenta cuenta3 = new Cuenta(432);
		
		System.out.println(Cuenta.getTotal());
	}
}
