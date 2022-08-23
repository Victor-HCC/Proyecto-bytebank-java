import javax.swing.undo.CannotUndoException;

public class TestReferencia3 {

	public static void main(String[] args) {
		
		Cuenta cuentaDeDiego = new Cuenta();
		
		/*cuentaDeDiego.titular.nombre = "Diego";*/ /*no puedo definir el nombre del titular 
		 sin antes hacer referencia al objeto Cliente de la cuenta ya que el atributo titular
		 actualmente tiene valor null*/
		Cliente cliente = new Cliente();
		//cuentaDeDiego.titular = cliente;
		//cuentaDeDiego.titular.nombre = "Diego";
		
		/*
		System.out.println(cuentaDeDiego.titular.nombre);
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular.telefono);
		*/
		
		//Otra forma de inicializar un cliente
		Cuenta cuentaDeVictor = new Cuenta();
		//cuentaDeVictor.titular = new Cliente();
		//cuentaDeVictor.titular.nombre = "Victor";
		//System.out.println(cuentaDeVictor.titular.nombre);
		
		//Con la clase Cuenta ya con un valor por default para Cliente
		Cuenta cuentaDePablo = new Cuenta();
		/*System.out.println(cuentaDePablo.titular.nombre); */ /*ahora ya no tengo error de exception 
		ya que el atributo titular tiene un valro por default y ahora puedo acceder al los 
		atributos del objeto titular que en este caso como no se les asigno un valor tienen 
		valores null o 0 segun corresponda*/
				
		
		//Se agregaron getters y setters por lo q este codigo ya no compila
	}
}
