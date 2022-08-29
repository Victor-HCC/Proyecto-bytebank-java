
public class TestControlBonificacion {

	
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		diego.setSalario(2000);
		
		Gerente victor = new Gerente();
		victor.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		
		controlBonificacion.registrarSalario(victor);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		controlBonificacion.registrarSalario(alexis);
		/*Aunque se haya definido el metodo registrar salario con parametro funcionario,
		 * igual es aplicable para los objetos GErente y Contador ya q heredan de Funcionario
		 * y su tipo mas general es Funcionario*/
	}
}
