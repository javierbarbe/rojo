package diccionarios;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Diccionario2 {

	public static void main(String[] args) {
		Scanner e = new Scanner (System.in);
		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(333, " Maria un Pajote");
		m.put(123," Alex Corchero");
		m.put(1234, " Javier Barbero");
		System.out.println(m.size()+ " numero de entradas en el hashmap");
		System.out.println(m.values()+ " lista de valores de los elementos del hashmap");
		System.out.println(m.keySet()+"  lista de claves de los elementos del hashmap");
		System.out.println(m.containsKey(155)+ " devuelve si el valor pasado por parametro existe como clave");
		System.out.println(m.entrySet()+ " coleccion de pares, clave con su valor ");
		//para obtener valores por entrada de claves ( primer parametro del hashmap) 
		System.out.println(m.get(333)+ " =>la persona con esa clave se llama asi");
		
		//EXTRAYENDO LAS ENTRADAS DEL DICCIONARIO CON UN ENTRYSET
		System.out.println(m.entrySet()+ " mediante entrySet");
		// sin entry set
		System.out.println(m);
		//con bucle for mejorado
		for ( Map.Entry par: m.entrySet()) {
			System.out.println(par);
		}
		
		//PONIENDOLO BONITO 
		System.out.println(" Numero de Clave\t Nombre ");
		System.out.println("=====================================");
		for (Map.Entry pares: m.entrySet()) {
			System.out.println("     " +pares.getKey()+"\t\t"+ pares.getValue());
		}
//		comprobando mediantee insercion de teclado si existe un codigo o un value.. primero codigo
		System.out.println("Introduce el codigo a buscar: ");
		int codigo = e.nextInt();
		
		if( m.containsKey(codigo)) {
			System.out.println("el codigo existe, ademas su valor asignado es "+m.get(codigo));
		}else {
			System.out.println("le codigo "+codigo+" no existe");
		}
		
		
		
	}
//
	
}
