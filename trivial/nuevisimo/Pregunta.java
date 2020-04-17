package nuevisimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Pregunta {
	Scanner sc = new Scanner(System.in);
	String[] categorias = { "arte", "ciencia", "literatura", "cine", "historia" };
	HashMap<String, String> tacoPreguntas = new HashMap<>();
	HashMap<String, String> pregNombres = new HashMap<>();
	HashMap<String, String> pregLugares = new HashMap<>();
	String [] preguntasNombres= pregNombres.entrySet().toArray(new String [0]);
	int contadorPreguntasNombres=0;
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasYrespuestas.txt"));
			String linea = "";
			String respuesta = "";
			while (linea != null) {
		
				linea = br.readLine();
				respuesta = br.readLine();
				if (linea != null) {
					pregNombres.put(linea, respuesta);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("no se encontro el archivo de preguntas respuestas de historia");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al leer del archivo");
		}
	}
	String categoria;

	public void preguntar(String categoria) {
		if (categoria.equals("nombres")) {
			String pregunta= pregNombres.get(preguntasNombres[contadorPreguntasNombres]);
			System.out.println("Respuesta?");
			String respuesta = sc.nextLine();
			if(respuesta.equalsIgnoreCase(pregNombres.get(preguntasNombres[contadorPreguntasNombres]))){
				System.out.println("respuesta correcta");
			}
			else {
				System.out.println("nooooooooooooooooooooo incorrecto");
			}
		}
	}

}
