package tema9ActProouestasIvan;

import java.util.ArrayList;

public class ListadoPersonas {
	Persona elegida=null;
	ArrayList <Persona> listaPersonas= new ArrayList<>();
	public ListadoPersonas() {
		
	}
	public Persona buscarPorNombre(String nombre) {
		
		for (Persona i : listaPersonas) {
			if(i.nombre.equalsIgnoreCase(nombre)) {
				System.out.println("el nombre esta en la lista");
				elegida=i;
				return elegida;
			}
		}return  elegida;
	}
	public Persona buscarPorApellido (String apellido) {
		Persona elegida=null;
		for (Persona p : listaPersonas) {
			if(p.apellidos.equalsIgnoreCase(apellido)) {
				System.out.println("el apellido existe");
				elegida= p;
			}
		}return elegida;
	}
	
	public static void main (String [] ar) {
		ListadoPersonas p = new ListadoPersonas();
		p.listaPersonas.add(new Persona("javier", "barbero" , 1992));
		
		System.out.println(p.buscarPorNombre("javier"));
		System.out.println(p.buscarPorApellido("barbero"));
	}
}
