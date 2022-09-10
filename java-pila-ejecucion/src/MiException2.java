
public class MiException2 extends Exception {

	public MiException2() {
		super();
	}
	
	public MiException2(String message) {
		super(message);
	}
	
	/*Las excepciones que heredadn de Exception son checked (verificadas) por el compilador
	 * por lo que verifica si al ser lanzadas estan manejadas por los metodos ya sea con
	 * la declaracion con throws o encerrando con try and catch el metodo en el que estan.
	 * En cambio las excepciones que heredan de RuntimeException son uncheked (no verificadas)
	 * por lo que el compilador no va a verificar si la excepcion esta controlada con algun
	 * metodo
	 * */
}
