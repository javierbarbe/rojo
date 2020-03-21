package tema8Excepciones;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Apéndice de método generado automáticamente
		int numero = 0;
		boolean numer;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			numer = true;
			do {
				System.out.println("Introduce un numero en la lista");

				try {
					numero = s.nextInt();
					lista.add(numero);
					numer = true;
				} catch (Exception e) {
					System.out.println("eso no es un numero");
					s.nextLine(); // limpia s
					numer = false;
				}
			} while (!numer);

		}
		for (Integer u : lista) {
			System.out.println(u);
		}
		System.out.println(lista.size() + " es el tamaño");
	}

}
