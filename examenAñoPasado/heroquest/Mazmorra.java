package heroquest;

import javax.swing.JOptionPane;

public class Mazmorra {
	boolean habitacionesCerradas=true;
	Dado d5 = new Dado(5);
	Habitacion [] habitaciones = new Habitacion[d5.getValor()];
	public Mazmorra() {
		for (int i = 0; i< habitaciones.length;i++) {
			habitaciones[i]=new Habitacion();
		}
		System.out.println("Esta mazmorra tiene "+habitaciones.length+ " habitaciones");
	}
	public Habitacion [] devuelveHabitaciones() {
	
			return habitaciones;
		
	}
	
	public static void main (String [] args) {
		Mazmorra mazmo = new Mazmorra();
		
		Personaje javi= new Personaje("Javi", "Humano", "Bárbaro");
//		for (int i = 0; i< mazmo.habitaciones.length; i++) {
//			mazmo.habitaciones[i].abrirPuerta(javi);
//		}
		
		
		for(Habitacion i : mazmo.devuelveHabitaciones()) {
			System.out.println(i);
		}
		do{
			int habElegida= Integer.valueOf(JOptionPane.showInputDialog("A que habitacion entras?"));
			Habitacion elegido2= mazmo.habitaciones[habElegida-1];
			do {
			javi.eligeAccion(elegido2);
			for(Enemigo e : elegido2.listaMonstruosHabitacion) {
				e.enemigosAtacan(javi);
			}
			if(javi.getVida()<1) {
				System.out.println("Has muerto... fin de juego");
				System.exit(0);
			}
		}		while(elegido2.numEnemigosRestantes()>0);
			for (Habitacion i : mazmo.devuelveHabitaciones()) {
				if(i.isAbierta()&& Habitacion.listaMonstruosHabitacion.size()==0) {
					mazmo.habitacionesCerradas=false;
				}if(!i.isAbierta()) {
					mazmo.habitacionesCerradas=true;
					break;
				}
			}
	}while(mazmo.habitacionesCerradas);
		System.out.println("Enhorabuena !! Has sobrevivido");
		System.out.println("Has conseguido un botin de "+javi.getOro()+ "\nPuntos de experiencia :"+
		javi.getExperiencia()+"\nMantienes para la siguiente aventura "+ javi.getCartastesoro()+ " cartas de tesoro");
	}
}
