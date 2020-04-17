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
	TacoPreguntas t3 = new TacoPreguntas();
	Scanner sc = new Scanner(System.in);
	String[] categorias = { "arte", "ciencia", "literatura", "cine", "historia" };
	HashMap<String, String> tacoPreguntas = new HashMap<>();
	HashMap<String, String> pregNombres = new HashMap<>();
	HashMap<String, String> pregPersonajes = new HashMap<>();
	HashMap<String, String> pregAcciones = new HashMap<>();
	HashMap<String, String> pregLugares =t3.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
	ArrayList <String> prNombres = new ArrayList<>();
	ArrayList <String> prAcciones = new ArrayList<>();
	ArrayList <String> prLugares= new ArrayList<>();//t3.devuelvePreguntasDe("preguntasLugares");
	//String [] soloPreguntasLugares=prLugares.toArray(new String[0]);
	int contadorPreguntasNombres=0,contadorPreguntasLugares=0,contadorPreguntasAcciones=0;
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasNombres.txt"));
			BufferedReader brL= new BufferedReader(new FileReader("trivial/nuevisimo/preguntasLugares.txt"));
			BufferedReader brP= new BufferedReader(new FileReader("trivial/nuevisimo/preguntasAcciones.txt"));
			
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
			linea="";
			while (linea!=null) {
				linea=brL.readLine();
				respuesta=brL.readLine();
				if(linea!=null) {
					pregLugares.put(linea, respuesta);
					prLugares.add(linea);
				}
			}
			linea="";
			while(linea!=null) {
				linea=brP.readLine();
				respuesta=brP.readLine();
				if(linea!=null) {
					pregAcciones.put(linea,respuesta);
					prAcciones.add(linea);
				}
			}
			linea="";
		} catch (FileNotFoundException e) {
			System.out.println("no se encontro el archivo de preguntas ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error al leer del archivo");
		}
		Collections.shuffle(prNombres);
		Collections.shuffle(prLugares);
	}
	String [] soloPreguntasAcciones= prAcciones.toArray(new String[0]);
	String [] soloPreguntasLugares= prLugares.toArray(new String[0]);
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
				contadorPreguntasNombres++;
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
			System.out.println(pregLugares.get(pregunta));
			if(respuesta.equalsIgnoreCase(pregLugares.get(pregunta))){
				System.out.println("respuesta correcta");
				contadorPreguntasLugares++;
			}
			else {
				System.out.println("nooooooooooooooooooooo incorrecto");
			}
		}
		if(categoria.equals("acciones")) {
			String pregunta=soloPreguntasAcciones[contadorPreguntasAcciones];
			System.out.println(pregunta);
			System.out.println("Respuesta?");
			String respuesta = sc.nextLine();
			System.out.println(pregAcciones.get(pregunta));
			if(respuesta.equalsIgnoreCase(pregAcciones.get(pregunta))){
				System.out.println("respuesta correcta");
				contadorPreguntasAcciones++;
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
	//t1.preguntar("lugares");
	t1.preguntar("acciones");
	t1.preguntar("lugares");
	//t2.devuelvePreguntasDe("preguntasLugares");
//	System.out.println(t2.devuelvePreguntasDe("preguntasLugares"));
	//t1.preguntar(t2.categoria);
	//t1.leerPreguntas();
//	t1.preguntar("nombres");
}
}
