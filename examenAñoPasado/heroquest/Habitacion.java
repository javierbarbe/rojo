package heroquest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Habitacion {

	private boolean abierta = false;
	private int cantidadEnemigos;
	LinkedList<Enemigo> habitacion = new LinkedList<>();
	ListIterator <Enemigo> muerto = habitacion.listIterator();

	public void abrirPuerta(Personaje personaje) {
		if (!abierta) {
			Dado d6 = new Dado(6);
			Dado d4 = new Dado(4);
			abierta = true;
			int resultado = d6.getValor();// pongo un valor fijo de pruebas
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

	protected boolean isAbierta() {
		return abierta;
	}

	protected void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	public void enemigo() {
		if(habitacion.size()!=0) {
		  habitacion.remove(0);}
		else {
			System.out.println("No quedan enemigos");
			
		}
	}
	protected LinkedList <Enemigo> listaEnemigos(){
		while(muerto.hasNext()) {
			System.out.println(muerto.next().getVida());
		}
		return habitacion;
	}
	protected int numEnemigosRestantes() {
		return cantidadEnemigos;
	}
	protected int getCantidadEnemigos() {
	//	comprobarMuertes();
		for (Enemigo e : habitacion) {
			System.out.println(e);
			System.out.println();
		}
		return cantidadEnemigos;
	}

	protected void setCantidadEnemigos(int cantidadEnemigos) {
		this.cantidadEnemigos = cantidadEnemigos;
	}

//	public void comprobarMuertes() {
//
//		while (muerto.hasNext()) {
//			if (muerto.next().getVida() <= 0) {
//				habitacion.remove(0); //elimina el ultimo al coger el tamaño de la lista de monstruos
//				cantidadEnemigos--;
//			}
//		}
//		System.out.println(cantidadEnemigos);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitacion verde = new Habitacion();
		Personaje javi = new Personaje("jos", "humano", "bárbaro");
		verde.abrirPuerta(javi);
	//	verde.comprobarMuertes();
		javi.atacar(verde);
		while(verde.muerto.hasNext()) {
			System.out.println(verde.muerto.next());
		}
		//verde.listaEnemigos();
//		System.out.println(verde.getCantidadEnemigos());
		

	}

}
