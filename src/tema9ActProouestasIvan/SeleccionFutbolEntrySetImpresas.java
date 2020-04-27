package tema9ActProouestasIvan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SeleccionFutbolEntrySetImpresas {
	 static Map<Integer, String> seleccion = new HashMap<>();
	 public static  void inizializa(){
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
	 }
	 {
		seleccion.put(1,"topo");
		seleccion.put(3, "paquete");
		seleccion.put(15, "ramera");
//		seleccion.put(5, "pujol");
//		seleccion.put(11,"capdevila");
//		seleccion.put(14, "xabi alonso");
//		seleccion.put(16, "tzbusketa");
//		seleccion.put(8, "culerdo indeseabla");
//		seleccion.put(7, "raul gonzalez blanco");
//		seleccion.put(6, "gusiluz");
		}
	public SeleccionFutbolEntrySetImpresas() {
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleccionFutbolEntrySetImpresas mi = new SeleccionFutbolEntrySetImpresas();
		
		
		for (Map.Entry<Integer, String> entry : mi.seleccion.entrySet()) {
		    System.out.println("clave = " + entry.getKey() + ", valor =  " + entry.getValue());
		}
		mi.seleccion.forEach((k,v)-> System.out.println(k +" "+ v ));
		  System.out.println("********* Trabajando con los métodos de Map *********");
          System.out.println("Mostramos el numero de elementos que tiene el hashMap: hashMap.size() = "+mi.seleccion.size());
          System.out.println("Vemos si el hashMap esta vacio : hashMap.isEmpty() = "+ mi.seleccion.isEmpty());
          System.out.println("Obtenemos un elemento del Map pasándole la clave 6: hashMap.get(6) = "+mi.seleccion.get(6));
          System.out.println("Borramos un elemento del Map el 18 "
          		+ "(porque fue sustituido): hashMap.remove(18)"); mi.seleccion.remove(18);
          System.out.println("Vemos que pasa si queremos obtener"
          		+ " la clave 18 que ya no existe: hashMap.get(18) = "+mi.seleccion.get(18));
          System.out.println("Vemos si existe un elemento con la"
          		+ " clave 18: hashMap.containsKey(18) = "+mi.seleccion.containsKey(18));
          System.out.println("Vemos si existe un elemento con la clave "
          		+ "1: hashMap.containsKey(1) = "+mi.seleccion.containsKey(1));
          
          System.out.println("Vemos si existe el valor 'Raul Gonzalez Blanco' en el Map: "
          		+ "hashMap.containsValue(\"Raul Gonzalez Blanco\") = "+mi.seleccion.containsValue("raul gonzalez blanco"));
          System.out.println("Vemos si existe el valor 'Pelé' "
          		+ "en el Map: hashMap.containsValue(\"Pelé\") = "+mi.seleccion.containsValue("Pelé"));
          System.out.println("Borramos todos los elementos del Map: hashMap.clear()");
          mi.seleccion.clear();
          System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: hashMap.size() = "+mi.seleccion.size());
          System.out.println("Lo comprobamos tambien viendo si esta vacio hashMap.isEmpty() = "+mi.seleccion.isEmpty());
	}

}
