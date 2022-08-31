
public class Gerente extends Funcionario implements Autenticable { 

	private AutenticacionUtil util = new AutenticacionUtil();
	
	//Sobre-escritura de metodos, la visivilidad, tipo de retorno, nombre y parametros deben ser iguales
	public double getBonificacion() {
		return 2000;
		//return super.getSalario() + this.getSalario() * 0.05;
				//(super.getSalario() * 0.1) //Como se le agrega el 10% del salario puedo usar el metodo ya definido en Funcionario
				//super.getBonificacion(); //con super accedemos a los metodos de la clase padre
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
}
