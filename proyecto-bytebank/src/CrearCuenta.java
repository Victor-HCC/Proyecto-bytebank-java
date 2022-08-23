
public class CrearCuenta {

	public static void main(String[] args) {
		//    Variable       =   Valor         //la variable hace referencia al valor, referencia al lugar en la memoria que se le asigna al objeto creado    
		Cuenta primeraCuenta = new Cuenta(); //new le indica a Java que separe un espacio de memoria para la nueva instancia de Cuenta (otro objeto de tipo Cuenta)
		primeraCuenta.depositar(1000);
		//primeraCuenta.pais = "Bolivia"; //No compila ya que pais no está definido en Cuenta
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);
		System.out.println(segundaCuenta.getSaldo());
		/*Una vez que se realiza una nueva instancia de una clase con new el objeto creado 
		 * inicializa los atributos con sus valores por default, ej. los de tipo String
		 * se inicializan con valor null, los de tipo int con valor 0*/
		//System.out.println(segundaCuenta.agencia); //cambiamos a privado el acceso al atributo agencia por lo q hay q usar su metodo get correspondiente
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son objetos diferentes");
		}
	}
}
