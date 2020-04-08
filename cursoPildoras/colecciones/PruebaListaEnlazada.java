/**
 * 
 */
package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Javi
 *
 */
public class PruebaListaEnlazada {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList< String > paises= new LinkedList<>();
		paises.add("España");
		paises.add("Colombia");paises.add("Mexico");
		paises.add("Peru");
		System.out.println(paises);
		
		LinkedList< String > capitales= new LinkedList<>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("Mexico D.F.");
		capitales.add("Lima");
		System.out.println(capitales);
		
		ListIterator<String> ita= paises.listIterator();
		ListIterator<String> itb= capitales.listIterator();
		
		while(itb.hasNext()) {
			if(ita.hasNext()) {
				ita.next();
				ita.add(itb.next());
			}
		}
		System.out.println(paises);
		itb=capitales.listIterator(); //REINICIA EL ITERADOR A LA PRIMERA POSICION DE LA LISTA
		
		while(itb.hasNext()) { //ELIMINA LOS PARES , SALTA UNA POSICION, MIRA QUE HAYA ELEMENTO Y SALTA OTRA
				//DESPUES, ELIMINA LA SEGUNDA ( LA PAR)
			itb.next();
			if(itb.hasNext()) {
				itb.next();
				itb.remove();
			}
		}System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
		ita=paises.listIterator();
		while(ita.hasNext()) { //ELIMINA LOS IMPARES
			ita.next();
			ita.remove();
			if(ita.hasNext()) {
				ita.next();
			}
		}System.out.println(paises);
	}
	

}
