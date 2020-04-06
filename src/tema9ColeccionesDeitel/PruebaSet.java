package tema9ColeccionesDeitel;

import java.util.HashSet;
import java.util.Set;

public class PruebaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> nombres = new HashSet<>();
		nombres.add("Javier");
		nombres.add("Poner");
		nombres.add(null);
		nombres.add("Javier");
		System.out.println(nombres);

	}

}
