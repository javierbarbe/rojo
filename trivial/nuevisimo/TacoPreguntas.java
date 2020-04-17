package nuevisimo;
//for(Map.Entry<String, String> entry : ne.tacoPreguntas.entrySet()) {
//if(entry!=null) {
//	System.out.println("Esta clave \""+ entry.getKey()+ "\" tiene este valor "+ entry.getValue());
//}
//}
//System.out.println(ne.tacoPreguntas.entrySet().);

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TacoPreguntas {

	
	HashMap<String, String> tacoPreguntas = new HashMap<>();
//	HashMap<String, String> pregNombres = new HashMap<>();
//	HashMap<String, String> pregLugares = new HashMap<>();
	ArrayList <String> prNombres = new ArrayList<>();
	ArrayList <String> prLugares= new ArrayList<>();
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
			}
		} catch (FileNotFoundException e) {
		System.out.println("NO SE ENCUENTRA EL ARCHIVO");
		} catch (IOException e) {
			System.out.println("No se pudo leer la linea");
		}
		return tacoPreguntas;
		
	}
	
	public ArrayList<String> devuelvePreguntasDe(String nombreArchivo) {
		ArrayList<String> nombreLista= new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/"+nombreArchivo+".txt"));
			String linea="";
			String respuesta="";
			//String nombreLista="pr"+nombreArchivo;
			
			while(linea!=null) {
				linea=br.readLine();
				respuesta=br.readLine();
				if(linea!=null) {
					nombreLista.add(linea);
				}
			}
		} catch (FileNotFoundException e) {
		System.out.println("NO SE ENCUENTRA EL ARCHIVO");
		} catch (IOException e) {
			System.out.println("No se pudo leer la linea");
		}
		
		return nombreLista;
	}
	int contadorPreguntasNombres=0;
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasYrespuestas.txt"));
			BufferedReader brL= new BufferedReader(new FileReader("trivial/nuevisimo/preguntasLugares.txt"));
			String linea = "";
			String respuesta = "";
			while (linea != null) {
		
				linea = br.readLine();
				respuesta = br.readLine();
				if (linea != null) {
				//	pregNombres.put(linea, respuesta);
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

	
	
}
