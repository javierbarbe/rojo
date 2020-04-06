package tema9ColeccionesDeitel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Colores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] colores= {"verde","amarillo", "azul", "rojo","negro"};
		List <String> lista1= new LinkedList<>();
		for ( String c: colores) {
			lista1.add(c);
		}
		
		String [] colores2= {"rosa", "marron", "plateado", "naranja"};
		List <String> lista2 = new LinkedList<>(); 
		for( String e: colores2) {
			lista2.add(e);
		}
		System.out.println(lista1);
		lista1.addAll(lista2);
		System.out.println(lista1);
		lista2=null;
		System.out.println(lista2);
//		imprimirlista(lista1);
		convertirAMayusculas(lista1);
		eliminarDesdeHasta(lista1, -3,5 );
		imprimirlista(lista1);
		imprimirInvertido(lista1);
	}

	
	static void imprimirlista(List <String> a) {
		System.out.println("LISTA");
		for (String e : a) {
			System.out.printf("%s ",e);
		}
	}
	static void convertirAMayusculas(List <String> p) {
//		Iterator <String> iterador = p.listIterator();
		String [] mayus=p.toArray(new String [0]);
		p.clear();
	for ( String q : mayus) {
		q=q.toUpperCase();
		p.add(q);
		}
	}
	static void eliminarDesdeHasta(List <String> l , int inicio, int fin) {
		if(fin>l.size()) {
			System.out.println("Se ha pasado de indice.\nTomando por defecto el ultimo valor de la "
					+ "lista = "+ l.size());
			fin=l.size();
		}
		if (inicio<0) {
			System.out.println("No puede elegir un valor negativo...\n"
					+ "Eliminando desde el primer elemento de la lista");
			inicio=0;
		}
		l.subList(inicio, fin).clear();
	}
	
	static void imprimirInvertido(List <String> l) {
		System.out.println("LIsta inversa");
		ListIterator <String> iterador= l.listIterator(l.size());
		while ( iterador.hasPrevious()) {
			System.out.printf("%s ",iterador.previous());
		}
	}
	
}
