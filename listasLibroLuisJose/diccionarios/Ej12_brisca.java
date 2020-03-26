package diccionarios;

import lista.Cartas2;

import java.util.ArrayList;
import java.util.HashMap;

public class Ej12_brisca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> puntaje = new HashMap<String, Integer>();
		puntaje.put("as", 11);
		puntaje.put("3", 10);
		puntaje.put("sota", 2);
		puntaje.put("caballo", 3);
		puntaje.put("rey", 4);
		puntaje.put("2", 0);
		puntaje.put("4", 0);
		puntaje.put("5", 0);
		puntaje.put("6", 0);
		puntaje.put("7", 0);
		Cartas2 carto = new Cartas2();
		int puntos = 0;
		ArrayList<Cartas2> mano = new ArrayList<Cartas2>(); // con esto hago una lista
		// introduzco valores, en el caso de que exista el valor nuevo, busca otro no
		// usado
		// luego lo añade a la mano;
		for (int i = 0; i < 10; i++) {
			do {
				carto = new Cartas2();

			} while (mano.contains(carto));
			mano.add(carto);
			Integer[] sumo = puntaje.values().toArray(new Integer[0]);
//			for (Integer s : sumo) {
//				System.out.println(s + " valores");
//				puntos += s;
//			}
		}

		for (Cartas2 c : mano) {
			System.out.println(c +" son: "+ puntaje.get(c.getNumero())+" puntos");
//			System.out.println(puntaje.get(c.getNumero()));
			puntos+=puntaje.get(c.getNumero());
		}
//		System.out.println(puntaje.values());
		System.out.println("Has conseguido " + puntos + " con esas cartas");
	}

}
