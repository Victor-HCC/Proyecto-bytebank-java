
public class Contador extends Funcionario {

	@Override
	public double getBonificacion() { /*Sobre-escribimos el metodo, al llamarse un metodo desde
	otra clase llama al mas especifico, por lo que como estamos volviendo a definir al metodo
	aca el calculo se hara sobre este y no sobre el general de la clase Funcionario*/ 
		// TODO Auto-generated method stub
		return 200;
	}
}
