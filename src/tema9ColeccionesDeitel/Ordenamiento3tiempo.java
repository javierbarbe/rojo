package tema9ColeccionesDeitel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento3tiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Tiempo> lista = new ArrayList<>();
		lista.add(new Tiempo(12,15,35));
		lista.add(new Tiempo (10,15,25));
		lista.add(new Tiempo(10,10,42));
		lista.add(new Tiempo(12,10,40));
		lista.add(new Tiempo(9,12,40));
		lista.add(new Tiempo(10,10,42));
		System.out.println(lista);
		Collections.sort(lista, new ComparadorTiempo().reversed()); // la polla con cebolla 
		// si le añades reversed te lo hace al reves segun el metodo compareTo definido en la clase
		//ComparadorTiempo()
		System.out.println(lista);
		
		
	}

}
