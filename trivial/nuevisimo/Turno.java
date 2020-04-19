package nuevisimo;

import javax.swing.JOptionPane;

public class Turno {
	public boolean jugar (Jugador jug) {
		
		boolean finPartida=Jugador.prfinal.isFinPreguntasTodas();
		if(!finPartida) { //mientras que la partida no se acaba 
			jug.imprimeCuantosQuesitosyPosicion();
			while(jug.moverse()==true) { //moverse() devuelve un booleano en funcion de si la respuesta es correcta true, si es mala false
				System.out.println("TE toca otra vez");
				jug.imprimeCuantosQuesitosyPosicion();
			}//fin while jug.moverse()==true
		}// fin while !finPartida
		System.out.println("fin del turno de jugador "+jug.getNombre());
		return false;
	}
	public Turno (Jugador jug) {
		
		
		Jugador n2 = new Jugador("papa");
		//Pregunta p = new Pregunta();
		int o=0;
		boolean finPartida=Jugador.prfinal.isFinPreguntasTodas();
		while(!finPartida) { //mientras que la partida no se acaba 
			System.out.println("le toca al jugador "+jug.getNombre()+ " estas en la casilla "+ jug.getMovimiento());
			System.out.println("tienes "+ jug.getCantidadQuesitos()+ " quesitos");
			while(jug.moverse()==true) { //moverse() devuelve un booleano en funcion de si la respuesta es correcta true, si es mala false
				System.out.println("te toca otra vez  estas en la casilla "+ jug.getMovimiento());
				System.out.println("tienes "+ jug.getCantidadQuesitos()+ " quesitos");
			}
			System.out.println("le toca al jugador "+n2.getNombre()+ " estas en la casilla "+ n2.getMovimiento());
			while(n2.moverse()==true) {
				System.out.println("te vuelve a tocar estas en la casilla "+ n2.getMovimiento());
				System.out.println("tienes "+n2.getCantidadQuesitos()+ " quesitos");
			}
			System.out.println(Jugador.prfinal.getPrfalladas());
			finPartida=Jugador.prfinal.isFinPreguntasTodas();
		}
		
		//System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasNombres"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasAcciones"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares"));
//		System.out.println(p.getPrfalladas());
//		}
	}
	
	
	public Turno () {
		System.out.println("introduce tu nombre");
		Jugador n = new Jugador("javi");
		Jugador n2 = new Jugador("papa");
		//Pregunta p = new Pregunta();
//		int o=0;
//		boolean finPartida=Jugador.prfinal.isFinPreguntasTodas();
//		while(!finPartida) {
//			System.out.println("le toca al jugador "+n.getNombre()+ " estas en la casilla "+ n.getMovimiento());
//			System.out.println("tienes "+ n.getCantidadQuesitos()+ " quesitos");
//			while(n.moverse()==true) { //moverse() devuelve un booleano en funcion de si la respuesta es correcta true, si es mala false
//				System.out.println("te toca otra vez  estas en la casilla "+ n.getMovimiento());
//				System.out.println("tienes "+ n.getCantidadQuesitos()+ " quesitos");
//			}
//			System.out.println("le toca al jugador "+n2.getNombre()+ " estas en la casilla "+ n2.getMovimiento());
//			while(n2.moverse()==true) {
//				System.out.println("te vuelve a tocar estas en la casilla "+ n2.getMovimiento());
//				System.out.println("tienes "+n2.getCantidadQuesitos()+ " quesitos");
//			}
//			System.out.println(Jugador.prfinal.getPrfalladas());
//			finPartida=Jugador.prfinal.isFinPreguntasTodas();
//		}
		//System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasNombres"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasAcciones"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares"));
//		System.out.println(p.getPrfalladas());
//		}
	}
	public static void main (String [] a) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		Jugador n = new Jugador(nombre);
		Jugador n2= new Jugador ("jsd2");
		Turno t = new Turno();
		t.jugar(n);
		t.jugar(n2);
		
	}
}
