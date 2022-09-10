
public class Conexion implements AutoCloseable {

	public Conexion() {//constructor
		System.out.println("Abriendo conexion");
		//throw new IllegalStateException();
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException(); //Exception para errores de conexion, por ej con bases de datos
	}
	
	public void cerrar() {
		System.out.println("Cerrando conexion");
	}

	@Override
	public void close() throws Exception {
		cerrar();
	}
}
