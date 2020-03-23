package rehechosListasDiccionarios;

import java.util.ArrayList;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArrayList <Integer> numerales = new ArrayList<Integer>();
		double suma=0;
		int tamanio = (int) (Math.random()*(21-10)+10);
		for ( int i = 0; i< tamanio; i++) {
			int numero = (int)(Math.random()*101);
			numerales.add(numero);
			suma+= numero;
		}
		int max=0; int min=100;
		for ( int nu: numerales) {
			if ( nu <min) {
				min=nu;
			}
			if(nu>max) {
				max=nu;
			}
		}
		double tridia = ( ((suma/tamanio))); // no tira 
//		double  media=(( double ) (suma)) / ((double) tamanio);
				//suma/tamanio;
//		System.out.println(tridia);
		System.out.println(max+ " es el mayor");
		System.out.println(min+" es el mas pequeño");
		 System.out.println("La suma es "+suma);
		 System.out.println("La media es " +tridia);
		System.out.println(numerales);
		System.out.println(numerales.size());
	}

}
