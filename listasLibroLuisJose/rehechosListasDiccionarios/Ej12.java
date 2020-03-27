package rehechosListasDiccionarios;

import java.util.ArrayList;
import java.util.HashMap;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		HashMap <String, Integer> valores = new HashMap<String, Integer>();
		valores.put("as", 11);
		valores.put("2", 0);
		valores.put("3", 10);
		valores.put("4", 0);
		valores.put("5", 0);
		valores.put("6", 0);
		valores.put("7", 0);
		valores.put("sota", 2);
		valores.put("caballo", 3);
		valores.put("rey", 4);
		int puntuacion=0;
		ArrayList <Carta > mano= new ArrayList<Carta>();
		Carta carto= new Carta();
		for ( int i = 0; i< 10 ; i++) {
			do {
				carto=new Carta();
			}while(mano.contains(carto));
			mano.add(carto);
			
		}for( Carta c : mano) {
			System.out.printf("%10s vale %20d", c ,valores.get(c.getValor()));
			System.out.println();
			puntuacion+=valores.get(c.getValor());
		}
	System.out.println("Has obtenido "+puntuacion+" puntos");
	}

}
