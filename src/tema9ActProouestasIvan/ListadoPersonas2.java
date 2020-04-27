package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListadoPersonas2 {
	static Persona elegida=null;
	 ArrayList <Persona> listaPersonas= new ArrayList<>();
	public ListadoPersonas2() {
		
	}
	public  void buscarPorNombre(String nombre) {
		
		for (Persona i : listaPersonas) {
			if(i.nombre.equalsIgnoreCase(nombre)) {
				System.out.println("el nombre esta en la lista");
				elegida=i;
				//return elegida;
			}
		}
		if(elegida==null) {
			System.out.println("no hay nadie con ese nombre");
		}
		//return  elegida;
	}
	public  void buscarPorApellido (String apellido) {
		
		for (Persona p : listaPersonas) {
			if(p.apellidos.equalsIgnoreCase(apellido)) {
				System.out.println("el apellido existe");
				elegida= p;
			}
		}//return elegida;
	}
	
	public  void buscarPorApellidoPatron( String apellido) {
		Pattern pat = Pattern.compile(apellido);
		
		for(Persona p : listaPersonas) {
			Matcher mat= pat.matcher(p.apellidos);
			if(mat.find()) {
				//System.out.println("al menos un apellido coincide");
				elegida = p;
				System.out.println(elegida);
			}
			
		}if(elegida==null) {
			System.out.println("no hay nadie con ese apelldio en particular");
		}
		
	}
	
	public  void buscarPorAño ( int año) {
		for (Persona p : listaPersonas) {
			if(p.añoNacimiento==año) {
				elegida=p;
				System.out.println(elegida);
			}
		}if(elegida==null) {
			System.out.println("no hay nadie nacido en ese año");
		}
		//return elegida;
	}
	
	public static void main (String [] ar) {
		ListadoPersonas p = new ListadoPersonas();
		ListadoPersonas.listaPersonas.add(new Persona("javier", "barbero siesto" , 1992));
		ListadoPersonas.listaPersonas.add(new Persona("daniel","barbero siesto", 1998));
		ListadoPersonas.listaPersonas.add(new Persona("monica","geller siesto", 1998));
		
		//System.out.println(p.buscarPorNombre("javier"));
		ListadoPersonas.buscarPorApellidoPatron("barbero");
		ListadoPersonas.buscarPorAño(1998);
	}
}
