package tema9ActProouestasIvan;

import java.util.Map;
import java.util.TreeMap;

public class SeleccionTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> seleccion = new TreeMap<>();
		//SeleccionFutbolEntrySetImpresas sel = new SeleccionFutbolEntrySetImpresas();
		SeleccionFutbolEntrySetImpresas.inizializa(); 
		seleccion.putAll(SeleccionFutbolEntrySetImpresas.seleccion);// al hacerlo estatico no necesito instancia de clase 
		//pero no lo inicializa, creo metodo inizializa y arreglao ;)
		
		// al usar el objeto sel.seleccion y añadirlo a este mapa no es necesario introducirlos 
		//nuevamente... ahorrando codigo
				//		seleccion.put(1,"topo");
				//		seleccion.put(3, "paquete");
				//		seleccion.put(15, "ramera");
				//		seleccion.put(5, "pujol");
				//		seleccion.put(11,"capdevila");
				//		seleccion.put(14, "xabi alonso");
				//		seleccion.put(16, "tzbusketa");
				//		seleccion.put(8, "culerdo indeseabla");
				//		seleccion.put(7, "raul gonzalez blanco");
				//		seleccion.put(6, "gusiluz");
		
		seleccion.forEach((k,v)-> System.out.println("dorsal: "+k+ " jugador: "+ v));
	}

}
