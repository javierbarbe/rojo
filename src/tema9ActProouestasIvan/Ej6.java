package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Collections;

public class Ej6 {
/*
	 * Dado un ArrayList de n�meros enteros, ordenar los datos de menor a mayor mediante m�todo est�tico
	proporcionado por la clase Collections. A continuaci�n hacer la operaci�n de ordenaci�n de mayor a menor a
	trav�s de Collections con ayuda de la clase Comparator.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numerosDes= new ArrayList<>();
		numerosDes.add(7);
		numerosDes.add(2);
		numerosDes.add(6);
		numerosDes.add(3);
		numerosDes.add(12);
		numerosDes.add(5);
		numerosDes.add(1);
		
		
		System.out.println(" desordenado... segun se insertaron en la lista");
		for( int i : numerosDes) {
			System.out.println(i);
		}
		Collections.sort(numerosDes);
		System.out.println("ordenado");
		numerosDes.forEach((o)-> System.out.println(o));
		System.out.println("invertido");
		Collections.reverse(numerosDes);
		for (int o : numerosDes) {
			System.out.println(o);
		}
		//Collections.reverseOrder(numerosDes);
		
	}

}
