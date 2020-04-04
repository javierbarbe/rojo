package clasesGenericas;

public class Pareja <T>{

	public Pareja () {
		this.nombre=null;
	}
	
	public T getNombre() {
		return nombre;
	}
	
	public void setNombre(T nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	
	private T nombre;
}
