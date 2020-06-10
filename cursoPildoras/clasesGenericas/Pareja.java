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
	// para que funcione la herencia necesitas usar una clase comodin
	//consiste en poner (Pareja <? extends Empleado> eo) como argumento del metodo 
	public static  void imprimirTrabajador(Pareja <? extends Empleado> eo) {
		Empleado nombre2 =eo.getNombre();
		System.out.println(nombre2);
	}
	private T nombre;
}
