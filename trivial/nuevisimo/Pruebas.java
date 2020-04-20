package nuevisimo;

public class Pruebas {

	
	public static void main (String [] a) {
		for (int i= 0; i<6; i++) {
			String culo$i= "culo";
		}
		int resultado;
		resultado=9/4;
		System.out.println(resultado);
		Pregunta p = new Pregunta();
		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasAcciones"));
		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares"));
		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasMusica"));
		System.out.println(p.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasNombres"));
		System.out.println(p.getPrfalladas());
	}
}
