package tema9ActProouestasIvan;

public class Persona {
	//ATRIBUTOS
	 String nombre, apellidos;
	 int a�oNacimiento;
	 
	//getters y setters
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected int getA�oNacimiento() {
		return a�oNacimiento;
	}
	protected void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	 
	public String toString() {
		return this.nombre +" " + this.apellidos+ " "+ this.a�oNacimiento;
	}
	 public Persona(String nombre, String apellidos, int a�oNacimiento) {
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.a�oNacimiento=a�oNacimiento;
	 }
}
