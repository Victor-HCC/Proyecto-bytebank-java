
public class Gerente extends Funcionario { //Gerente hereda de Funcionario

	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	}
}
