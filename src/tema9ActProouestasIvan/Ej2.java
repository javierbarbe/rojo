package tema9ActProouestasIvan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JOptionPane;

public class Ej2 {

	/*
	 * Crear una LinkedList sobre la cual incorporaremos objetos de tipo String (por ejemplo 5 nombres leídos por
	teclado). Una vez incorporados mostraremos:
	- Tamaño de la lista.
	- Nodo en primera posición.
	- Nodo en última posición. 
	- Nodo en una posición cualquiera dentro del rango.
	- Nodo en una posición cualquiera fuera del rango. Incorporar control de excepciones.
	- Recorrer la lista con bucle for.
	- Recorrer la lista con un iterador.
	- Recorrer la lista con bucle for desde el final hasta el principio.
	- Recorrer la lista con un iterador desde el final hasta el principio.
	- ¿Se puede recorrer la lista con un bucle for-each?
	- ¿Se puede recorrer la lista con un bucle for-each desde el final hasta el principio?
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> listaNombres = new LinkedList<>();
		for (int i = 0; i<5; i++) {
			String nombre= JOptionPane.showInputDialog("Introduce nombre "+ i+" ");
			listaNombres.add(nombre);
		}

		System.out.println(listaNombres.size() +" es el tamaño de la lista");
		System.out.println(listaNombres.getFirst() +" --->nodo en primera poscion") ;
		System.out.println(listaNombres.getLast()+ " ----> nodo en ultima posicion");
		
		//int num= (int) Math.random()*listaNombres.size();
		
		System.out.println(listaNombres.get((int) (Math.random()*listaNombres.size()))+ " element0 aleatorio dentro de rango");
		try {
		System.out.println(listaNombres.get(100)); //hay que incorporar control de excepciones
		}catch (IndexOutOfBoundsException e) {
			System.out.println("\n\n<<<<<<<<<<<<<<<<EXCEPCION>>>>>>>>>>>>>>>>>");
			System.out.println("Excepcion de " +e.getMessage()+" "+e.getCause());
			System.out.println("fuera de rango, la lista no es tan grande");
		}
		System.out.println("\n\nrecorrida con bucle for mejorado <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		for ( String i : listaNombres) {
			System.out.println(i);
		}
		System.out.println("\n\nrecorrida con iterador <<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
		Iterator<String > iteList = listaNombres.iterator();
		while (iteList.hasNext()) {
			System.out.println(iteList.next());
		}
		
		System.out.println("\n\n recorrida definal a principio con FOR");
		for ( int i= listaNombres.size()-1; i>=0; i--) {
			System.out.println(listaNombres.get(i));
		}
		ListIterator<String> lista2It = listaNombres.listIterator(listaNombres.size()); // necesario un iteradorLista 
		System.out.println("\n\n<<<<<<<<<<<<recorrida con iterador de final a principio");
		while(lista2It.hasPrevious()) {
			System.out.println(lista2It.previous());
		}
		
		System.out.println("\n\nRecorriendola con un foreach?? ><<<<<<<<<<<<<<<<<");
		listaNombres.forEach((s)-> System.out.println(s));
		
		System.out.println("\n\n Recorriendola con un foreach al reves<<<<<<<<<<<<<<<<<");
		listaNombres.descendingIterator().forEachRemaining((s)-> System.out.println(s));
	}
	
	

}
