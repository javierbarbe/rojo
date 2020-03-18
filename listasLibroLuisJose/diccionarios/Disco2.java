package diccionarios;

public class Disco2 {

	private String nombre, grupo;
	private int anio;
	public Disco2 (String nombre, String grupo, int anio) {
		this.nombre=nombre;
		this.grupo=grupo;
		this.anio=anio;
	}
	@Override
	public String toString() {
		return this.nombre+"; "+this.grupo+"; "+this.anio;
	}
}
