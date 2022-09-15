package ar.com.bytebank.modelo;

public interface Autenticable { //interface no puede tener metodos implementados
	//una interface no puede extender de una clase, si de otra interface
	
	public void setClave(String clave);
	
	public /*abstract*/ boolean iniciarSesion(String clave);

	//por defecto todo en la interface es abstracto por lo q no es necesario declararlo
}
