package lista;

import java.util.ArrayList;
import java.util.Collections;
import tema7.POO.Gato;

public class Gatos {

	public static void main (String [] args) {
		
		ArrayList <Gato> g= new ArrayList<Gato>();
		g.add(new Gato("Garfield", "naranja", "macho"));
		g.add(new Gato("Bruto","negro","hembra"));
		g.add(new Gato ("Silvestre", "blanquinegro", "macho"));
		g.add(new Gato ("Aquiles", "pardo", "macho"));
		for(Gato aux: g) { //tipo nombre : lista que lo contiene
			System.out.println(aux);
		}
		Collections.sort(g); // esto ordena la lista "g" por el metodo de ordenar de Gato compareTo
		System.out.println("\nDatos de los gatos ordenados alfabeticamente:\n");
		for(Gato gatoaux: g) {
			System.out.println(gatoaux);
		}
		
		
		
		
	}
	
}
