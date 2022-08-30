
public abstract class Funcionario { //al ser una representacion abstracta no puede ser instanciado

	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public Funcionario() {  //constructor, metodo publico donde el tipo de retorno es el mismo q la clase
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacion();/*metodo abstracto, no tiene implementacion, las
	clases hijas deberan reescribir este metodo segun sus caracteristicas propias, todo 
	método abstracto debe ser implementado por las clases hijas. Define solo la firma 
	(visibilidad, retorno, nombre del método y parámetros).*/

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
