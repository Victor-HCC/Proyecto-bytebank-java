//entidad Cuenta:
class Cuenta {
	//atributos
	private double saldo; /* public/private son modificadores de acceso, con private no se 
	podra modificar el valor del atributo saldo directamente, solo mediante metodos*/
	private int agencia;
	private int numero;
	/*para tener los atributos del cliente de la cuenta creo otra clase para
	crear un objeto con los datos del titular, ya que esos datos no tendrian q ser atributos 
	directos de la clase Cuenta*/ 
	private Cliente titular = new Cliente(); /*como en este caso estoy creando el objeto Cliente 
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	} 
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	
	
	
	
}
