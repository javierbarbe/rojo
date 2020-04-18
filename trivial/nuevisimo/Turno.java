package nuevisimo;

public class Turno {

	Jugador n = new Jugador("javi");
	Jugador n2 = new Jugador("papa");
	
	public Turno () {
		//Pregunta p = new Pregunta();
		int o=0;
//		while(Jugador.prfinal.contadorPreguntasMusica< Jugador.prfinal.prMusica.size()) {
			System.out.println("le toca al jugador "+n.getNombre());
			while(n.moverse()==true) { //moverse() devuelve un booleano en funcion de si la respuesta es correcta true, si es mala false
			System.out.println("te toca otra vez");
			}System.out.println("le toca al jugador "+n2.getNombre());
			while(n2.moverse()==true) {
				System.out.println("te vuelve a tocar");
			}
		//System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasNombres"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasAcciones"));
//		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares"));
//		System.out.println(p.getPrfalladas());
//		}
	}
	public static void main (String [] a) {
		Turno t = new Turno();
	
		
	}
}
