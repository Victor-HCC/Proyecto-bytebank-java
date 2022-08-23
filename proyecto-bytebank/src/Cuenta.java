//entidad Cuenta:
class Cuenta {
	//atributos
	double saldo;
	int agencia;
	int numero;
	/*para tener los atributos del cliente de la cuenta creo otra clase para
	crear un objeto con los datos del titular, ya que esos datos no tendrian q ser atributos 
	directos de la clase Cuenta*/ 
	Cliente titular = new Cliente(); /*como en este caso estoy creando el objeto Cliente 
	desde la clase Cuenta la referencia a ese objeto solo sera accesible desde esta clase*/
	
	
	//Definicion de metodos
	
	public void depositar(double valor) { //void es un metodo que no retorna nada
		//Esta cuenta        esta cuenta    se suma este valor
		//This object        esta cuenta
		this.saldo         = this.saldo    + valor;
	}
	
	public boolean retirar(double valor) { //Lo defino como un metodo boolean para que retorne si la operacion fue exitosa o no
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		
		return false;
	}
}
