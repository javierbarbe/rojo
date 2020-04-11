package heroquest;

import java.util.ArrayList;

public class Habitacion {

	private boolean abierta = false;
	private int cantidadEnemigos;
	ArrayList<Enemigo> habitacion = new ArrayList<>();

	public void abrirPuerta() {
		if (!abierta) {
			Dado d6 = new Dado(6);
			Dado d4 = new Dado(4);
			abierta = true;
			int resultado = d6.getValor();
			switch (resultado) {
			case 1:
				for (int i = 0; i < d4.getValor(); i++) {
					habitacion.add(new Enemigo("esqueleto"));
				}
				break;
			case 2:
				for (int i = 0; i < d4.getValor(); i++) {
					habitacion.add(new Enemigo("goblin"));
				}
				break;
			case 3:
				for (int i = 0; i < d4.getValor(); i++) {
					habitacion.add(new Enemigo("orco"));
				}
				break;
			case 4:
				for (int i = 0; i < d4.getValor(); i++) {
					habitacion.add(new Enemigo("momia"));
				}
				break;
			case 5:
				for (int i = 0; i < d4.getValor(); i++) {
					habitacion.add(new Enemigo("fimir"));
				}
				break;
			}
			cantidadEnemigos = habitacion.size();
		}
	}

	public void comprobarMuertes() {
		for (Enemigo e : habitacion) {
			if (e.getVida() <= 0) {
				habitacion.remove(habitacion.size());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
