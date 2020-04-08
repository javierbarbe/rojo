package colecciones;

public class Cliente {
	
	//ATRIBUTOS
	private String nombre, num_cuenta;
	private double saldo;
	//GETTERS Y SETTERS 
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getNum_cuenta() {
		return num_cuenta;
	}

	protected void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return this.nombre;
	}
	
	//CONSTRUCTOR
	public Cliente(String nombre, String num_cuenta, double saldo) {
		this.nombre=nombre;
		this.num_cuenta=num_cuenta;
		this.saldo=saldo;
	}
}
