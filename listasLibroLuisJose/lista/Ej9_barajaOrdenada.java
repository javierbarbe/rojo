package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Ej9_barajaOrdenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Cartas2> baraja= new ArrayList<Cartas2>();
		Cartas2 cartaaux= new Cartas2();
		
		baraja.add(cartaaux);
		for(int i =0; i<39 ; i++) {
			do {
				cartaaux=new Cartas2();
			}while(baraja.contains(cartaaux));
		baraja.add(cartaaux);
		}
		
		for (Cartas2 c : baraja) {
			System.out.println(c);
		}
		Collections.sort(baraja);
		System.out.println("////////////////////////////////////////////////////");
		for (Cartas2 c : baraja) {
			System.out.println(c);
		}
	}

}

