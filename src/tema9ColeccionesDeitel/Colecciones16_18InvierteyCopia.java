package tema9ColeccionesDeitel;

import java.util.Collections;
import java.util.LinkedList;

public class Colecciones16_18InvierteyCopia {

	public static void main(String[] args) {
		String abecedario= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String letra ;
		// TODO Auto-generated method stub
		LinkedList<String> letras= new LinkedList<>();
		for (int i=0; i<10;i++) {
			letra=String.valueOf(abecedario.charAt((int)(Math.random()*abecedario.length())));
			while(!abecedario.contains( letra)){
				letra=String.valueOf(abecedario.charAt((int)(Math.random()*abecedario.length())));
			
			}letras.add(letra);
		}
		System.out.println("sin ordenar");
		System.out.println(letras);
		Collections.sort(letras);
		System.out.println("ordenado");
		System.out.println(letras);
		LinkedList<String> letrasCopia= new LinkedList<>();
		for (String a : letras) {
			letrasCopia.addFirst(a);
		}
		System.out.println("Copia invertida");
		System.out.println(letrasCopia);
	}

}
