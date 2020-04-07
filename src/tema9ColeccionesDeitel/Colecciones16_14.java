package tema9ColeccionesDeitel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Colecciones16_14 {

	public static void main(String[] args) {
		/*
		 * 16.14 (Conteo de letras) Modifique el programa de la figura 16.18 para contar
		 * el número de ocurrencias de cada letra, en vez de cada palabra. Por ejemplo,
		 * la cadena “HOLA A TODOS” contiene una H, tres O, una L, dos A, una T, una D y
		 * una S. Muestre los resultados.
		 */
		int cantidad=0;char letr;
		HashMap <String,Integer > letras = new HashMap<>();
		String frase = JOptionPane.showInputDialog("Frase a contar letras");
		for ( int i= 0 ; i<frase.length(); i++) {
			letr=frase.charAt(i);
			String letrita= Character.toString(letr);
			if(letras.containsKey(letrita)) {
				int cuenta = letras.get(letrita);
				letras.put(letrita, cuenta+1);
			}else {
				letras.put(letrita, 1);
			}
		}
			
			for (Map.Entry<String, Integer> entry : letras.entrySet()) {
			    System.out.println("clave = " + entry.getKey() + ", valor = " + entry.getValue());
			}
		
	}

}
