package heroquest;

import java.util.HashMap;
import java.util.LinkedList;

public class MazoTesoros {
	// HashMap<Integer, CartaTesoros> mazo = new HashMap<>();
	LinkedList<CartaTesoros> mazo = new LinkedList<>();

	public MazoTesoros() {

		for (int i = 0; i < 12; i++) {
			mazo.add(new CartaTesoros());

		}
	}
	

	public CartaTesoros robarCarta(Habitacion habitacion) {
		if (!mazo.isEmpty()) {
			CartaTesoros cartaDevuelta = mazo.getFirst();
			if(habitacion.isAbierta()&& habitacion.listaMonstruosHabitacion.isEmpty()) {
				mazo.remove();
				System.out.println(cartaDevuelta.getValor());
				return cartaDevuelta;
			}else {
				cartaDevuelta.cartaVacia();
				return cartaDevuelta;
			}
		} else {
			System.out.println("No quedan cartas que robar");
			CartaTesoros cartaVacia = new CartaTesoros();
			cartaVacia.cartaVacia();
			return cartaVacia;
		}
	}
}
