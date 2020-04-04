package clasesGenericas;

public class PruebaPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pareja <String > una = new Pareja();
		una.setNombre("Javier" );
		System.out.println(una.getNombre());
		
		Persona sed = new Persona("Shei");
		Pareja <Persona> otra = new Pareja<>();
		System.out.println(otra.getNombre());
		otra.setNombre(sed);
		System.out.println(otra.getNombre());

	}

}

class Persona {
	
	public Persona (String nombre) {
		this.nombre=nombre;
	}
	private String nombre;
	public String toString() {
		return nombre;
	}
}