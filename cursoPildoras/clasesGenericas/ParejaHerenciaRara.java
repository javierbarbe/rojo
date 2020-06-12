package clasesGenericas;

public class ParejaHerenciaRara <T>{

	public ParejaHerenciaRara () {
		this.nombre=(T) nombre.toString();
	}
	
	public T getNombre() {
		return nombre;
	}
	
	public void setNombre(T nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	// para que funcione la herencia necesitas usar una clase comodin
	//consiste en poner (Pareja <? extends Empleado> eo) como argumento del metodo 
	public static  void imprimirTrabajador(ParejaHerenciaRara <? extends Empleado> eo) {
		Empleado nombre2 =eo.getNombre();
		System.out.println(nombre2);
	}
	private T nombre;
}
