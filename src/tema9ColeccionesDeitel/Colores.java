package tema9ColeccionesDeitel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Colores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] colores = {"azul","verde","amarillo","rojo","blanco"};
		List <String> primeralista= new ArrayList<String>();
		for(String c: colores) {
			System.out.println(c);
		}
		
		for(String c: colores) {
			primeralista.add(c);
		}
		String [] eliminacolores= {"verde","rojo","azul"};
		List <String> segundalista=new ArrayList<String>();
		
		for (String c: eliminacolores) {
			segundalista.add(c);
		}
		System.out.println("Tras eliminar...");
		eliminarColores(primeralista,segundalista);
		System.out.println("Tras eliminar...");
		for(String c : primeralista) {
			System.out.println(c);
		}
	}
	
 static void eliminarColores(Collection <String> coleccion1, Collection<String> coleccion2) {
		
	Iterator<String> iterador= coleccion1.iterator();
	while (iterador.hasNext()) {
		if (coleccion2.contains(iterador.next())){
			iterador.remove();
		}
	}
		
	}

}
