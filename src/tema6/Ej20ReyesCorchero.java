package tema6;

import java.util.*;

public class Ej20ReyesCorchero {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce la longitud del array");
		int longitud = s.nextInt();
		 int  orden=1;
		String nombre;
		String[] lista = new String[longitud];
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("introduce el nombre del rey ");
			nombre = s.next();
			lista[i] = nombre;
		}
		
//		for (int i = 0; i< lista.length; i++) {
//			System.out.println(lista[i]);
//		}
		for (String i : lista) {
			System.out.println(i);
		}
		
		for ( int i = 0 ; i<lista.length; i++) {
			orden=1;
			for( int j = 0; j<lista.length; j++) {
				if(lista[i].equals(lista[j])&& i!=j) {
//					if (j<i) {
//					
					orden++;
//					}
				}
			}
		
		}
		
		for (int i = 0; i< lista.length; i++) {
			System.out.println(lista[i]+" "+ orden+ " º de su nombre");
		}
	}

}
