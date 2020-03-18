package lista;

import java.util.ArrayList;

public class PrimeraLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> amantes = new ArrayList<String>();
		System.out.println("numero de elementos de mi lista de amantes "+ amantes.size());
		System.out.println("nombre de mi lista "+ amantes.getClass());
		amantes.add("Valentina");
		amantes.add("Miriam");
		amantes.add("Irene");
		amantes.add("Sarai");
		amantes.add("Ainhoa");
		System.out.println("numero de elementos "+ amantes.size());
		Object [] amadores =amantes.toArray();
		for ( Object a : amadores) {
			System.out.println(a);
		}
		amantes.remove("Sarai");
		System.out.println(" foreach con listas");
		for (String nombre: amantes) {
			System.out.println(nombre);
		}
		amantes.removeIf(palabra -> palabra.contains("e"));
		System.out.println("contenido de la lista");
		System.out.println(amantes);
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");
		System.out.println("Contenido de la lista: ");
		System.out.println(a);
		a.removeIf(palabra -> palabra.contains("a"));
		System.out.println("Contenido de la lista después de borrar las palabras que contienen la letra"
				+ " \"a\": ");
		System.out.println(a);
		
		

		
//		for (String nombre : amantes) {
//			System.out.println(nombre);
//		}
		System.out.println("el elemento de la posicion 1 es "+ amantes.get(1));
	
	}
}
