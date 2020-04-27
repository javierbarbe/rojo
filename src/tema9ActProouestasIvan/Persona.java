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
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + a�oNacimiento;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (a�oNacimiento != other.a�oNacimiento)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
