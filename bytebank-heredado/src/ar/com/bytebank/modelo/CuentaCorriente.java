package ar.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) { //como la clase padre tiene dos parametros para ser instanciado el objeto, la clase hijo tambien los va a tener
		//super(); //esto me llama al constructor por defecto si es q no tiene uno definido
		super(agencia, numero); //llamo al constructor
	}
	
	@Override //no hay q borrar, la indicacion de sobre-escritura
	public void retirar(double valor) throws SaldoInsuficienteException { //polimorfismo, heredo un metodo y le puedo hacer modificaciones en las acciones q realiza
		double comision = 0.2;
		super.retirar(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
}
