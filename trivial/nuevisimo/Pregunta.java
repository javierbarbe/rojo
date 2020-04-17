package nuevisimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pregunta {
	TacoPreguntas t3 = new TacoPreguntas();
	Scanner sc = new Scanner(System.in);
	String[] categorias = { "arte", "ciencia", "literatura", "cine", "historia" };
	HashMap<String, String> tacoPreguntas = new HashMap<>();
	HashMap<String, String> pregNombres = new HashMap<>();
	HashMap<String, String> pregLugares =t3.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
	ArrayList <String> prNombres = new ArrayList<>();
	ArrayList <String> prLugares= t3.devuelvePreguntasDe("preguntasLugares");
	String [] soloPreguntasLugares=prLugares.toArray(new String[0]);
	int contadorPreguntasNombres=0,contadorPreguntasLugares=0;
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
					prNombres.add(linea);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("no se encontro el archivo de preguntas respuestas de historia");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al leer del archivo");
		}
		
	}
	String [] preguntasNombres= prNombres.toArray(new String[0]);
	String categoria;
	public void leerPreguntas() {
		Pregunta p= new Pregunta();
		for (String i : preguntasNombres) {
			System.out.println(i);
		}
	}
	public Pregunta() {
		
	}
	public void preguntar(String categoria) {
	
		if (categoria.equals("nombres")) {
			String pregunta= preguntasNombres[contadorPreguntasNombres];
			System.out.println(pregunta);
			System.out.println("Respuesta?");
			String respuesta = sc.nextLine();
			if(respuesta.equalsIgnoreCase(pregNombres.get(pregunta))){
				System.out.println("respuesta correcta");
			}
			else {
				System.out.println("nooooooooooooooooooooo incorrecto");
			}
		}
		if(categoria.equals("lugares")) {
			String pregunta=soloPreguntasLugares[contadorPreguntasLugares];
			System.out.println(pregunta);
			System.out.println("Respuesta?");
			String respuesta = sc.nextLine();
			if(respuesta.equalsIgnoreCase(pregNombres.get(pregunta))){
				System.out.println("respuesta correcta");
			}
			else {
				System.out.println("nooooooooooooooooooooo incorrecto");
			}
		}
	}
	
	public HashMap<String,String> devuelvePreguntasyRespuestasenObjetoPregunta(String nombreArchivo) {
		try {
			HashMap<String, String> tacoPreguntas = new HashMap<>();
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/"+nombreArchivo+".txt"));
			String linea="";
			String respuesta="";
			//String nombreLista="pr"+nombreArchivo;
			
			while(linea!=null) {
				linea=br.readLine();
				respuesta=br.readLine();
				if(linea!=null) {
					tacoPreguntas.put(linea, respuesta);
				}
			}return tacoPreguntas;
			
		} catch (FileNotFoundException e) {
		System.out.println("NO SE ENCUENTRA EL ARCHIVO");
		} catch (IOException e) {
			System.out.println("No se pudo leer la linea");
		}
		return tacoPreguntas;
		
	}
	
	
	
public static void main (String [] args) {
	Pregunta t1 = new Pregunta();
	TacoPreguntas t2= new TacoPreguntas();
	HashMap<String, String> preguntasNuevas=t1.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
	t1.preguntar("lugares");
	//t2.devuelvePreguntasDe("preguntasLugares");
//	System.out.println(t2.devuelvePreguntasDe("preguntasLugares"));
	//t1.preguntar(t2.categoria);
	//t1.leerPreguntas();
//	t1.preguntar("nombres");
}
}
