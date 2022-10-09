package ar.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	/*El serialVersionUID es usado como una firma del objeto para ser transportado en la red*/
	private static final long serialVersionUID = -2046484764103694015L;
	private String nombre;
	private int documento;
	
	
	public Cliente(String nombre, int documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDocumento() {
		return documento;
	}

}
