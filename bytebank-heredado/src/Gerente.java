
public class Gerente extends Funcionario { //Gerente hereda de Funcionario

	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	}
	
	//Sobre-escritura de metodos, la visivilidad, tipo de retorno, nombre y parametros deben ser iguales
	public double getBonificacion() {
		return super.getSalario() + 
				//(super.getSalario() * 0.1) //Como se le agrega el 10% del salario puedo usar el metodo ya definido en Funcionario
				super.getBonificacion(); //con super accedemos a los metodos de la clase padre
	}
}
