package nuevisimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Pregunta {
	boolean correcta = false;
	TacoPreguntas t3 = new TacoPreguntas();
	Scanner sc = new Scanner(System.in);
	String[] categorias = { "nombres", "lugares", "acciones", "nombres", "historia" };
	HashMap<String, String> tacoPreguntas = new HashMap<>();
	// genero los hashmap donde almacenar preguntas y sus respuestas//
	HashMap<String, String> pregNombres = new HashMap<>();
	HashMap<String, String> pregPersonajes = new HashMap<>();
	HashMap<String, String> pregAcciones = new HashMap<>();
	HashMap<String, String> pregLugares = t3.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
	// genero los arraylist en los que almaceno solamente las preguntas// ( para
	// poder usarlas como key y comprobar si la respuesta es correcta)
	ArrayList<String> prfalladas= new ArrayList<>();
	ArrayList<String> prNombres = new ArrayList<>();
	ArrayList<String> prAcciones = new ArrayList<>();
	ArrayList<String> prLugares = new ArrayList<>();// t3.devuelvePreguntasDe("preguntasLugares");
	// String [] soloPreguntasLugares=prLugares.toArray(new String[0]);
	int contadorPreguntasNombres = 0, contadorPreguntasLugares = 0, contadorPreguntasAcciones = 0;
	{
		try {// hay que leer los archivos externos e ir añadiendo pregunta y respuesta de
				// manera conjunta a su hashmap
				// correspondiente
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasNombres.txt"));
			BufferedReader brL = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasLugares.txt"));
			BufferedReader brP = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasAcciones.txt"));

			String linea = "";
			String respuesta = "";
			while (linea != null) {

				linea = br.readLine();
				respuesta = br.readLine();
				if (linea != null) {
					pregNombres.put(linea, respuesta);
					prNombres.add(linea);
				}
			} // despues de cada lectura de archivo, linea tiene que estar limpia para no
				// meter una pregunta de otro archivo
				// en el siguiente
			linea = "";
			while (linea != null) {
				linea = brL.readLine();
				respuesta = brL.readLine();
				if (respuesta != null) {
					// añado al hashmap y a la lista de preguntas correspondiente
					pregLugares.put(linea, respuesta);
					prLugares.add(linea);
				}
			}
			linea = "";
			while (linea != null) {
				linea = brP.readLine();
				respuesta = brP.readLine();
				if (respuesta != null) {
					// añado al hashmap y a la lista de pregunatas correspondiente
					pregAcciones.put(linea, respuesta);
					prAcciones.add(linea);
				}
			}
			linea = "";
		} catch (FileNotFoundException e) {
			System.out.println("no se encontro el archivo de preguntas ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al leer del archivo");
		}
		// mezclo las listas para que no siempre salgan en el mismo orden
		Collections.shuffle(prNombres);
		Collections.shuffle(prLugares);
		Collections.shuffle(prAcciones);
	}
	// paso las listas de preguntas a arrays ... ¿podria hacerse con un iterador??
	// al accederlo mediante indices me es mas facil con un aarray
	String[] soloPreguntasAcciones = prAcciones.toArray(new String[0]);
	String[] soloPreguntasLugares = prLugares.toArray(new String[0]);
	String[] preguntasNombres = prNombres.toArray(new String[0]);
	String categoria;

	public void leerPreguntas() {
		Pregunta p = new Pregunta();
		for (String i : preguntasNombres) {
			System.out.println(i);
		}
	}

	public Pregunta() {

	}

	public boolean preguntar(String categoria) {
		if (contadorPreguntasAcciones < soloPreguntasAcciones.length && contadorPreguntasLugares < soloPreguntasLugares.length
				&& contadorPreguntasNombres < preguntasNombres.length) {
			String pregunta="";
			if (categoria.equals("nombres")) {
				 pregunta = preguntasNombres[contadorPreguntasNombres];
				System.out.println(pregunta);
				System.out.println("Respuesta?");
				String respuesta = sc.nextLine();

				if (respuesta.equalsIgnoreCase(pregNombres.get(pregunta))) {
					System.out.println("respuesta correcta");
					contadorPreguntasNombres++;
					correcta = true;
				} else {
					System.out.println("nooooooooooooooooooooo incorrecto");
					correcta = false;
				}
			} 
			if (categoria.equals("lugares")) {
				 pregunta = soloPreguntasLugares[contadorPreguntasLugares];
				System.out.println(pregunta);
				System.out.println("Respuesta?");
				String respuesta = sc.nextLine();
				System.out.println(pregLugares.get(pregunta));
				if (respuesta.equalsIgnoreCase(pregLugares.get(pregunta))) {
					System.out.println("respuesta correcta");
					contadorPreguntasLugares++;
					correcta = true;
				} else {
					System.out.println("nooooooooooooooooooooo incorrecto");
					correcta = false;
				}
			}
			if (categoria.equals("acciones")) {
				 pregunta = soloPreguntasAcciones[contadorPreguntasAcciones];
				System.out.println(pregunta);
				System.out.println("Respuesta?");
				String respuesta = sc.nextLine();
				System.out.println(pregAcciones.get(pregunta));
				if (respuesta.equalsIgnoreCase(pregAcciones.get(pregunta))) {
					System.out.println("respuesta correcta");
					contadorPreguntasAcciones++;
					correcta = true;
				} else {
					System.out.println("nooooooooooooooooooooo incorrecto");
					correcta = false;
				}
			}if (!correcta)
				{prfalladas.add(pregunta);}
		}//fin del if controlador para no salirnos del rango de cantidad de preguntas que hay
		return correcta;
	}

	public HashMap<String, String> devuelvePreguntasyRespuestasenObjetoPregunta(String nombreArchivo) {
		try {
			HashMap<String, String> tacoPreguntas = new HashMap<>();
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/" + nombreArchivo + ".txt"));
			String linea = "";
			String respuesta = "";
			// String nombreLista="pr"+nombreArchivo;

			while (linea != null) {
				linea = br.readLine();
				respuesta = br.readLine();
				if (linea != null) {
					tacoPreguntas.put(linea, respuesta);
				}
			}
			return tacoPreguntas;

		} catch (FileNotFoundException e) {
			System.out.println("NO SE ENCUENTRA EL ARCHIVO");
		} catch (IOException e) {
			System.out.println("No se pudo leer la linea");
		}
		return tacoPreguntas;

	}

	public static void main(String[] args) {
		Pregunta t1 = new Pregunta();
		TacoPreguntas t2 = new TacoPreguntas();
		HashMap<String, String> preguntasNuevas = t1.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
		// t1.preguntar("lugares");
		t1.preguntar("acciones");
		t1.preguntar("lugares");
		// t2.devuelvePreguntasDe("preguntasLugares");
//	System.out.println(t2.devuelvePreguntasDe("preguntasLugares"));
		// t1.preguntar(t2.categoria);
		// t1.leerPreguntas();
//	t1.preguntar("nombres");
	}
}
