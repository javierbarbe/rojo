package rehechosListasDiccionarios;

import java.util.*;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		/*
		 * programa que ordene 10 numeros introducidos por teclad almacenados en un
		 * objeto arrayList
		 */
		Scanner s = new Scanner(System.in);
		boolean datomalo = false;
		ArrayList<Integer> ordenado = new ArrayList<Integer>();
		int i = 0;
		int nume = 0;
		while (i < 10) {
			System.out.println("Valor a introducir en la lista " + i);
			do {
				try {
					nume = s.nextInt();
					datomalo = false;
				} catch (InputMismatchException e) {
					System.out.println("ese numero no es entero, no se añade\nIntroduzc"
							+ "ca un valor valido hippie");
					datomalo = true;
					s.next();
				}
			} while (datomalo == true);
			ordenado.add(nume);
			i++;
		}
		System.out.println(ordenado + " Sin ordenar");
		Collections.sort(ordenado);
		System.out.println(ordenado);
	}

}
