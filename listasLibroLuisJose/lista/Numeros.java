package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tema7.Coche;
import tema7.Bicicleta;
import tema7.Camion;
import tema7.Vehiculo;
import tema7.POO.Gato;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numer= new ArrayList<Integer>();
		numer.add(5);
		numer.add(-12);
		numer.add(8);
		
		
		ArrayList <Gato> g= new ArrayList<Gato>();
		g.add(new Gato("Garfield", "naranja", "macho"));
		g.add(new Gato("Bruto","negro","hembra"));
		g.add(new Gato ("Silvestre", "blanquinegro", "macho"));
		g.add(new Gato ("Aquiles", "pardo", "macho"));
		
		
		
		ArrayList <Vehiculo> coch= new ArrayList<Vehiculo>();
		coch.add(new Coche(4,366));
		coch.add(new Camion(6,8500));
		
		
		System.out.println(numer+ " lista numeros 1 vez");
		numer.add(0, 36);
		numer.add(0);
		System.out.println(numer+ " el cero es posicion del 36  ");
		
		
		Collections.sort(numer);
		System.out.println(numer+ " ordenado la lista de numeros");
		if (numer.contains(-12)){
			System.out.println(" el -12 esta en la lista");
		}
		numer.removeIf(numero -> numero != 36);
		System.out.println(numer+ " eliminado todo lo que no cumpla la condicion numer.removeIf");
		System.out.println(g);
		Collections.sort(g); // solo ordena las listas de objeto cuyos objeto tengan el metodo definido 
		// compareTo(Object o) LA CLASE GATO SÍ LO TIENE, LA CLASE VEHICULO NO
		
		coch.add(new Coche (5, 77770) );
		//tras modificar la clase Vehiculo implementarle la interfaz Comparable y el metodo compareTo(Object o) no me lo permite
		Collections.sort(coch);
		System.out.println(coch);
		
		System.out.println(g);

	}

}
