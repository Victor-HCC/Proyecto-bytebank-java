
public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		/*
		Conexion con = new Conexion();
		try {
			con.leerDatos();
			
		} catch(IllegalStateException ex) {
			System.out.println("Recibiendo Exception");
			ex.printStackTrace();//traza del error
		} finally { //se ejecuta haya exito o no
			System.out.println("Ejecutando finally");
			con.cerrar();//es importante cerrar la conexion si es q hay un error
		}*/
		
		
		/*
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
			
		} catch(IllegalStateException ex) {
			System.out.println("Recibiendo Exception");
			ex.printStackTrace();//traza del error
		} finally { //se ejecuta haya exito o no
			System.out.println("Ejecutando finally");
			if( con != null) {
				con.cerrar();
			}
		}*/
		
		
		
		try (Conexion con = new Conexion()) { //try con resources, la clase debe implementar AutoCloseable para que implemente el metodo close de todas formas
			con.leerDatos();
		} catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		
		
	}

	
	
}
