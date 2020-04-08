package tema9ColeccionesDeitel;

import java.util.Collections;
import java.util.LinkedList;

public class Colecciones16_17AleatoriosEnOrden {


	public static void main(String[] args) {
		
		
		LinkedList<Integer> bingo = new LinkedList<>();
		int aleatorio=0;
		double suma=0;double media=0;
		for(int i= 0; i<15; i++) {
			aleatorio= (int)(Math.random()*101);
			bingo.add(aleatorio);
			suma+=aleatorio;
		}
		Collections.sort(bingo);
		System.out.println(bingo);
		media=suma/bingo.size();
		System.out.println("Media es " +media+ ", SumaTotal:"+suma);

	}

}
