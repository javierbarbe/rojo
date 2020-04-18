package nuevisimo;

public class Turno {

	Jugador n = new Jugador("javi");
	Jugador n2 = new Jugador("papa");
	
	public Turno () {
		Pregunta p = new Pregunta();
		while(n.moverse()==true) {
			System.out.println("te toca otra vez");
		}System.out.println("le toca al jugador "+n2.getNombre());
		while(n2.moverse()==true) {
			System.out.println("te vuelve a tocar");
		}
		//System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasNombres"));
		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasAcciones"));
		p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
		System.out.println(p.prfalladas);
	}
	public static void main (String [] a) {
		Turno t = new Turno();
	
		
	}
}
