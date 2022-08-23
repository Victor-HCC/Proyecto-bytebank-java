
public class CrearCuenta {

	public static void main(String[] args) {
		//    Variable       =   Valor         //la variable hace referencia al valor, referencia al lugar en la memoria que se le asigna al objeto creado    
		Cuenta primeraCuenta = new Cuenta(); //new le indica a Java que separe un espacio de memoria para la nueva instancia de Cuenta (otro objeto de tipo Cuenta)
		primeraCuenta.saldo = 1000;
		//primeraCuenta.pais = "Bolivia"; //No compila ya que pais no está definido en Cuenta
		
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		/*Una vez que se realiza una nueva instancia de una clase con new el objeto creado 
		 * inicializa los atributos con sus valores por default, ej. los de tipo String
		 * se inicializan con valor null, los de tipo int con valor 0*/
		System.out.println(segundaCuenta.agencia);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son objetos diferentes");
		}
	}
}
