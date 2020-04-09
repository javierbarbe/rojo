package tema9ColeccionesDeitel;

import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Colecciones19_20OrdenaTreesetSplit {
	/*
	 * (Ordenar palabras con un objeto TreeSet) Escriba un programa que utilice el
	 * método split de String para dividir en tokens una línea de texto introducida
	 * por el usuario, y que coloque cada token en un objeto TreeSet. Imprima los
	 * elementos del objeto TreeSet. [Nota: esto debe hacer que se impriman los
	 * elementos en orden ascendente].
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fraseOriginal = JOptionPane.showInputDialog("Pon tu frase a ordenar aqui");
		TreeSet<String> fraseSet= new TreeSet<>();
		String [] palabrasCortadas = fraseOriginal.split(" ");
		for (String palabra : palabrasCortadas) {
			fraseSet.add(palabra);
		}
	
		System.out.println(fraseSet);
	}

}
