
public class ControlBonificacion {

	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
	/*el polimorfismo permite utilizar referencias más genéricas para comunicarse con un objeto*/
	
	
}
