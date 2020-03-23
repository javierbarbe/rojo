package lista;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaArrayListIterator {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArrayList <String> listaCompra= new ArrayList<String>();
		listaCompra.add("Leche");
		listaCompra.add("Huevos");
		listaCompra.add("Patatas");
		listaCompra.add("Pan");
		listaCompra.add("Cereales");
		listaCompra.add("Bollos");
		listaCompra.add("Leche");
		
		System.out.println(listaCompra);
		ArrayList <String>compraCopia= (ArrayList <String>) listaCompra.clone();
		compraCopia.add("Zapatillas");
		System.out.println(compraCopia);
		System.out.println(listaCompra);
		System.out.println(listaCompra.size());
		Iterator <String> iterador= listaCompra.iterator();
		while(iterador.hasNext()) {
			String palabra = iterador.next();
			if (palabra.equals("Leche")) {
				iterador.remove();
			}
		}
		System.out.println(listaCompra);
		System.out.println(listaCompra.size());
	}

}
