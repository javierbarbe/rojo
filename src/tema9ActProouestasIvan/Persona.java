package tema9ActProouestasIvan;

public class Persona {
	//ATRIBUTOS
	 String nombre, apellidos;
	 int añoNacimiento;
	 
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
	protected int getAñoNacimiento() {
		return añoNacimiento;
	}
	protected void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	 
	public String toString() {
		return this.nombre +" " + this.apellidos+ " "+ this.añoNacimiento;
	}
	 public Persona(String nombre, String apellidos, int añoNacimiento) {
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.añoNacimiento=añoNacimiento;
	 }
}
