package tema9ActProouestasIvan;

public class Persona {
	//ATRIBUTOS
	 String nombre, apellidos;
	 int aņoNacimiento;
	 
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
	protected int getAņoNacimiento() {
		return aņoNacimiento;
	}
	protected void setAņoNacimiento(int aņoNacimiento) {
		this.aņoNacimiento = aņoNacimiento;
	}
	 
	public String toString() {
		return this.nombre +" " + this.apellidos+ " "+ this.aņoNacimiento;
	}
	 public Persona(String nombre, String apellidos, int aņoNacimiento) {
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.aņoNacimiento=aņoNacimiento;
	 }
}
