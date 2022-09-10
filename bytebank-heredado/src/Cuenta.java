//entidad Cuenta:
public abstract class Cuenta {
	
	protected double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(); 
	
	
	private static int total = 0;
	
	//Modificamos el constructor
	public Cuenta(int agencia, int numero) { //Metodo q retora el objeto cuenta, no tiene ningun tipo de retorno, Java lo genera automaticamente, es el constructor
		
		this.numero = numero;
		
		if(agencia <= 0) {
			System.out.println("No se permite el 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		
		System.out.println("Se van creando " + total + " cuentas");
	}
	
	//Definicion de metodos
	
	public abstract void depositar(double valor) ;
	
	public boolean retirar(double valor) { //Lo defino como un metodo boolean para que retorne si la operacion fue exitosa o no
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.retirar(valor);
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
	
	public static int getTotal() {
		return total;
	}
	
	
	
	
	
}