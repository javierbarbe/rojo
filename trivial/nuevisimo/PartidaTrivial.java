package nuevisimo;
import java.util.*;
public class PartidaTrivial {
	Scanner sc = new Scanner(System.in);
	
	public PartidaTrivial(Jugador [] arrayJugadores) {
		System.out.println("Sera una partida de "+ arrayJugadores.length+ " jugadores");
		System.out.println("En orden, introducid vuestros nombres");
		for(int i = 0; i < arrayJugadores.length;i++){
			System.out.println("Introduce tu nombre");
			String nombre= sc.nextLine();
			arrayJugadores[i].setNombre(nombre);
			
		}System.out.println("EMPIEZA LA PARTIDA");
		while(!Jugador.prfinal.isFinPreguntasTodas()) {
			for(Jugador j : arrayJugadores) {
				Turno t= new Turno();
				t.jugar(j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantJugadores=0;
		//PartidaTrivial par = new Par
		Jugador [] arrayJugadores = new Jugador [2];
		boolean numJugadoresOk=false;
		// TODO Auto-generated method stub
		System.out.println("Bienvenido!!! ");
		System.out.println("Introducce el numero de jugadores");
		do {
			try {
				cantJugadores= sc.nextInt();
				
				numJugadoresOk=true;
				}catch (Exception e) {
				System.out.println("introduce un numero entero melon ");
				sc.next();
			}
		}while(!numJugadoresOk);
		 arrayJugadores = new Jugador[cantJugadores];
		 for ( int i = 0; i<arrayJugadores.length;i++) {
			 arrayJugadores[i]=new Jugador();
			//  arrayJugadores[i].setNombre(nombre);
		 }
		PartidaTrivial par= new PartidaTrivial(arrayJugadores);
		
		
		for (Jugador j : arrayJugadores) {
			System.out.println(j.getNombre());
			System.out.println(j.getAcertadas()+ " estas son las acertadas");
		}
		
		
	}

}
