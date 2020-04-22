package heroquest;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Mazmorra {
	boolean habitacionesCerradas = true;
	Dado d5 = new Dado(5);
	Habitacion[] habitaciones = new Habitacion[d5.getValor()];

	public Mazmorra() {
		for (int i = 0; i < habitaciones.length; i++) {
			habitaciones[i] = new Habitacion();
		}
		System.out.println("Esta mazmorra tiene " + habitaciones.length + " habitaciones");
	}

	public Habitacion[] devuelveHabitaciones() {

		return habitaciones;

	}

	public int cantidadHabitaciones() {
		int nHab = habitaciones.length;

		return nHab;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean numeroPlayers=false;
		Mazmorra mazmo = new Mazmorra();
		int cantidadJugadores;

		try {
			do{
				cantidadJugadores = Integer.parseInt(JOptionPane.showInputDialog("Numero de jugadores"));
				if(cantidadJugadores>0) {
					numeroPlayers=true;
				}

			Personaje[] grupoHeroes = new Personaje[cantidadJugadores];
			for (int i = 0; i < cantidadJugadores; i++) {
				String nombre = JOptionPane.showInputDialog("Introduce tu nombre aventurero");
				String raza = JOptionPane.showInputDialog("De que raza eres??");
				String oficio = JOptionPane.showInputDialog("¿cual es tu oficio?");
				grupoHeroes[i] = new Personaje(nombre, raza, oficio);
			}
//		for (int i = 0; i< mazmo.habitaciones.length; i++) {
//			mazmo.habitaciones[i].abrirPuerta(javi);
//		}
			System.out.println(mazmo.cantidadHabitaciones());

			for (Habitacion i : mazmo.devuelveHabitaciones()) {
				System.out.println(i);
			}
			do {
				int habElegida = Integer.valueOf(JOptionPane.showInputDialog("De las "+mazmo.cantidadHabitaciones()+" habitaciones, A que habitacion entras?"));
				Habitacion elegido2 = mazmo.habitaciones[habElegida - 1];
				do {
					for (Personaje p : grupoHeroes) {
						System.out.println("Turno del Jugador "+p.getNombre());
						System.out.println("Estais en la habitacion "+ (habElegida));
						p.eligeAccion(elegido2);
					}
						for (Enemigo e : elegido2.listaMonstruosHabitacion) {
							if(grupoHeroes.length>1) {
								Dado dado = new Dado (grupoHeroes.length-1);//un dado con la cantidad de heroes para 
								System.out.println("el enemigo "+e.getRaza()+ " ataca a "+ grupoHeroes[dado.getValor()].getNombre());
								e.enemigoAtacan(grupoHeroes[dado.getValor()]);										//elegir uno aleatorio, restar 1 para que coincida
							}else {
							e.enemigoAtacan(grupoHeroes[0]);
						}
//						if (p.getVida() < 1) {
//							System.out.println("Has muerto... fin de juego");
//							System.exit(0);
//						}
					
						} 
				}while (elegido2.numEnemigosRestantes() > 0);
				for (Habitacion i : mazmo.devuelveHabitaciones()) {
					if (i.isAbierta() && elegido2.listaMonstruosHabitacion.size() == 0) {
						mazmo.habitacionesCerradas = false;
					}
					if (!i.isAbierta()) {
						mazmo.habitacionesCerradas = true;
						break;
					}
				}
			} while (mazmo.habitacionesCerradas);
			System.out.println("Enhorabuena !! Has sobrevivido");
			System.out.println("Has conseguido un botin de " + grupoHeroes[0].getOro() + "\nPuntos de experiencia :"
					+ grupoHeroes[0].getExperiencia() + "\nMantienes para la siguiente aventura "
					+ grupoHeroes[0].getCartastesoro() + " cartas de tesoro");
			
			}while (!numeroPlayers);
		} catch (Exception inputMismatchException) {
			System.out.println(inputMismatchException.getMessage());
			System.out.println("Introduce numero de jugadores mayor que 0");
			cantidadJugadores= sc.nextInt();
		}
	}
}
