
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		
		try {
			metodo3();
		} catch (Exception e) { //Si hay varios tipos de Exception puedo atrapar todos definiendo el tipo como Exception ya que todos heredan del mismo
			// Pero no es lo recomendable, ya que se trata de ser especifico sobre lo que queremos atrapar. Podemos usar bloques multi-catch o separar los distintos tipos con un pipe |
			e.printStackTrace();
		}
		
		System.out.println("Fin main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo1");
		//metodo2();
		try {
			metodo2();
		} catch(MiException me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		/*for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			try { //Intenta esto
				if(i == 3 ) {
					int num = 30 / 0;
				}
				
				String test = null;
				System.out.println(test.toString());
				
			} catch(ArithmeticException | NullPointerException exception) { //Atrapa el error, podemos definir distintos tipos de excepciones baja la misma variable
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}
			
		}*/
		//ArithmeticException ae = new ArithmeticException(); //creamos una nueva instancia de la clase ArithmeticException
		
		System.out.println("Fin metodo2");
		//throw new ArithmeticException();//se usa throw para lanzar la excepcion, no es necesario darle un nombre al objeto, directamente podemos lanzar la instancia creada
		
		//throw new MiException("Mi excepcion fue lanzada");
	}
	
	private static void metodo3() throws MiException2 {  //Como esta excepcion hereda de Exception tenemos de declararlo en la firma del metodo (throws MiException2) para informar q el metodo va a lanzar una excepcion y de igual manera con los metodos que haya debajo en la pila de compilacion
		System.out.println("Inicio metodo3");
		throw new MiException2("Mi excepcion fue lanzada");
		
	}
}
