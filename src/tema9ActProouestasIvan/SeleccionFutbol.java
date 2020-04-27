package tema9ActProouestasIvan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SeleccionFutbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> seleccion = new HashMap<>();
		seleccion.put(1,"topo");
		seleccion.put(3, "paquete");
		seleccion.put(15, "ramera");
		seleccion.put(5, "pujol");
		seleccion.put(11,"capdevila");
		seleccion.put(14, "xabi alonso");
		seleccion.put(16, "busketa");
		seleccion.put(8, "culerdo indeseabla");
		seleccion.put(7, "raul gonzalez blanco");
		seleccion.put(6, "gusiluz");
		for (Map.Entry<Integer, String> entry : seleccion.entrySet()) {
		    System.out.println("clave = " + entry.getKey() + ", valor =  " + entry.getValue());
		}
		for ( int i = 0 ; i < seleccion.size(); i++) {
			System.out.println(seleccion.containsKey(i));
		}

	}

}
