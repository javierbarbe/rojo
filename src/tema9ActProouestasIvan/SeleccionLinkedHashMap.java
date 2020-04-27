package tema9ActProouestasIvan;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SeleccionLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> seleccion = new LinkedHashMap<>();
		SeleccionFutbolEntrySetImpresas.inizializa();
						seleccion.put(1,"topo");
						seleccion.put(3, "paquete");
						seleccion.put(15, "ramera");
						seleccion.put(5, "pujol");
						seleccion.put(11,"capdevila");
						seleccion.put(14, "xabi alonso");
						seleccion.put(16, "tzbusketa");
						seleccion.put(8, "culerdo indeseabla");
						seleccion.put(7, "raul gonzalez blanco");
						seleccion.put(6, "gusiluz");
		seleccion.putAll(SeleccionFutbolEntrySetImpresas.seleccion);
		
		for (Map.Entry<Integer, String> entry : seleccion.entrySet()) {
		    System.out.println("clave = " + entry.getKey() + ", valor =  " + entry.getValue());
		}
		for (Map.Entry<Integer, String> entry : seleccion.entrySet()) {
			if(entry.getKey()<6) {
				System.out.println("defensa");
			}else if(entry.getKey()==7) {
				System.out.println("eres el gran capitan");
			}else if (entry.getKey()==14) {
				System.out.println("eres xabi alonso");
			}
		}
		
	}

}
