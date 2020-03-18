package diccionarios;

public class Disco {

	private String nombre, grupo;
	private int anio;
	public Disco (String nombre, String grupo, int anio) {
		this.nombre=nombre;
		this.grupo=grupo;
		this.anio=anio;
	}
	@Override
	public String toString() {
		return this.nombre+"; "+this.grupo+"; "+this.anio;
	}
}
