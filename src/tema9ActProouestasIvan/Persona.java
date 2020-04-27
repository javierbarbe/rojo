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
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + añoNacimiento;
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
		if (añoNacimiento != other.añoNacimiento)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
