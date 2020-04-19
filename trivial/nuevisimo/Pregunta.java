package nuevisimo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import heroquest.Dado;

public class Pregunta {
	//-----------------------controladores de fin de preguntas-------------------------------------------
	private boolean finPreguntasMusica=false,finPreguntasNombres=false, 
			finPreguntasLugares=false, finPreguntasAcciones=false,
			finPreguntasTodas=false;
	
	
	// ******************************************
	
	boolean correcta = false;
	Scanner sc = new Scanner(System.in);
	String[] categorias = { "nombres", "lugares", "acciones",  "musica", "nombres", "lugares", "acciones",  "musica", "nombres" };
	//String[] categorias = { "nombres", "musica", "musica",  "musica" };
	ArrayList <String> categorias2= new ArrayList<>();

	// --------------genero los hashmap donde almacenar preguntas y sus respuestas//---------------
	
	HashMap<String, String> pregNombres = new HashMap<>();
	HashMap<String, String> pregPersonajes = new HashMap<>(); // sin usar
	HashMap<String, String> pregAcciones = new HashMap<>();
	HashMap<String, String> pregLugares = new HashMap<>();
	HashMap<String, String> pregMusica = new HashMap<>();
	
	//*************************************************
	
	
	//----------------------- Arrays con solamente las preguntas----------------------------
	// paso las listas de preguntas a arrays ... ¿podria hacerse con un iterador??
		// al accederlo mediante indices me es mas facil con un aarray
	
		String[] soloPreguntasAcciones ;//= prAcciones.toArray(new String[0]);
		String[] soloPreguntasLugares;// = prLugares.toArray(new String[0]);
		String[] soloPreguntasNombres ; //= prNombres.toArray(new String[0]);
		String[] soloPreguntasMusica;
		String categoria;
		
	// **********************************************
		
	
	//-- -------genero los arraylist en los que almaceno solamente las preguntas// ( para --------------------
	//---------------- poder usarlas como key y comprobar si la respuesta es correcta)
	ArrayList<String> prfalladas= new ArrayList<>();
	ArrayList<String> prNombres = new ArrayList<>();
	ArrayList<String> prAcciones = new ArrayList<>();
	ArrayList<String> prMusica = new ArrayList<>();
	ArrayList<String> prLugares = new ArrayList<>();
	
	//*********************************************************************************
	
	public ArrayList<String> leerArchivoPreguntas
	(String ruta, HashMap<String, String> pregYRespuetas, ArrayList<String> listaSoloPreguntas)
	  {
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String pregunta="";
			String respuesta="";
			while(pregunta!=null) {
				pregunta=br.readLine();
				respuesta=br.readLine();
				if(respuesta!=null) {
					listaSoloPreguntas.add(pregunta);
					pregYRespuetas.put(pregunta, respuesta);
				}
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("el archivo no se encuentra en la ruta especificada por parametros al metodo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer la linea del archivo");
		}
		return listaSoloPreguntas;
	}// fin metodoLeer que devuelve la lista de preguntas y llena el archivo HashMap con preg y respuestas???
	

	

	public void leerPreguntas(String [] nombreArrayPreguntas) {
		Pregunta p = new Pregunta();
		for (String i : nombreArrayPreguntas) {
			System.out.println(i);
		}
	}

	public Pregunta() {
		
		categorias2.add("nombres");
		categorias2.add("acciones");
		categorias2.add("lugares");
		categorias2.add("musica");
		prMusica=leerArchivoPreguntas("trivial/nuevisimo/preguntasMusica.txt", pregMusica, prMusica);
		prAcciones =leerArchivoPreguntas("trivial/nuevisimo/preguntasAcciones.txt", pregAcciones, prAcciones);
		prLugares=leerArchivoPreguntas("trivial/nuevisimo/preguntasLugares.txt", pregLugares, prLugares);
		prNombres=leerArchivoPreguntas("trivial/nuevisimo/preguntasNombres.txt", pregNombres, prNombres);
		Collections.shuffle(prMusica);
		Collections.shuffle(prAcciones);
		Collections.shuffle(prLugares);
		Collections.shuffle(prNombres);
		soloPreguntasAcciones = prAcciones.toArray(new String[0]);
		soloPreguntasLugares = prLugares.toArray(new String[0]);
		soloPreguntasNombres = prNombres.toArray(new String[0]);
		soloPreguntasMusica = prMusica.toArray(new String[0]);
		
	}

	public boolean preguntar(String categoria, Jugador player) {
		boolean comprobador=false;
		if(!finPreguntasTodas) {
			String pregunta="";
			while(!comprobador) {
			if (categoria.equals("nombres")) {
				if(contadorPreguntasNombres < soloPreguntasNombres.length) {
					comprobador=true;
					 pregunta = soloPreguntasNombres[contadorPreguntasNombres];
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
						contadorPreguntasNombres++;
					}
				}else {
					finPreguntasNombres=true;
					System.out.println("no quedan preguntas de nombres");
					Dado d4= new Dado(4);
					categoria=categorias[d4.getValor()-1];
				}
			} 
			if (categoria.equals("lugares")) {
				if( contadorPreguntasLugares < soloPreguntasLugares.length) {
					comprobador=true;
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
						contadorPreguntasLugares++;
					}
				}else {
					System.out.println("Se han acabado las preguntas de lugares");
					Dado d4= new Dado(4);
					finPreguntasLugares=true;
					categoria=categorias[d4.getValor()-1];
				}
			}
			if (categoria.equals("acciones")) {
				if(contadorPreguntasAcciones < soloPreguntasAcciones.length) {
					comprobador=true;
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
						contadorPreguntasAcciones++;
					}
				}else {
					finPreguntasAcciones=true;
					Dado d4= new Dado(4);
					categoria=categorias[d4.getValor()-1];
					System.out.println("se han acabado las preguntas de Acciones");
				}
			}
			if(categoria.equalsIgnoreCase("musica")) {
				if(contadorPreguntasMusica<soloPreguntasMusica.length) {
					comprobador=true;
					 pregunta = soloPreguntasMusica[contadorPreguntasMusica];
					 System.out.println(pregunta);
					 System.out.println("Respuesta?");
					 String respuesta= sc.nextLine();
					 if(respuesta.equalsIgnoreCase(pregMusica.get(pregunta))) {
						 System.out.println("Respuesta correcta");
						 contadorPreguntasMusica++;
						 correcta=true;
					 }else {
						 System.out.println("Nooo incorrecta");
						 correcta=false;
						 contadorPreguntasMusica++;
					 }
				}else {
					System.out.println("No quedan preguntas de musica");
					finPreguntasMusica=true;
					player.moverse();
//					Dado d4= new Dado(4);
//					categoria=categorias[d4.getValor()-1];
					
				}
			}
			
			if (!correcta){
				prfalladas.add(pregunta);
				}
			}// fin while controlador
		}else{
			if(finPreguntasAcciones && finPreguntasLugares && finPreguntasMusica && finPreguntasMusica && finPreguntasNombres) {
				finPreguntasTodas=true;
				comprobador=true;
			}
			correcta=false;
			System.out.println("fin de preguntas ");//fin del if controlador para no salirnos del rango de cantidad de preguntas que hay
		}
		return correcta;
	}
	
	protected boolean isFinPreguntasTodas() {
		return finPreguntasTodas;
	}




	protected void setFinPreguntasTodas(boolean finPreguntasTodas) {
		this.finPreguntasTodas = finPreguntasTodas;
	}




	public boolean devuelveSiquedanPreguntas() {
		if(contadorPreguntasAcciones>soloPreguntasAcciones.length) {
			System.out.println("sin preguntas del tipo accion");
		}
		if(contadorPreguntasLugares>soloPreguntasLugares.length) {
			System.out.println("sin preguntas del tipo lugares");
		}
		if(contadorPreguntasMusica>soloPreguntasMusica.length) {
			System.out.println("sin preguntas de musica");
		}
		if(contadorPreguntasNombres>soloPreguntasNombres.length) {
			System.out.println("sin preguntas de tipo nombre");
		}
		
		return false;
	}


	public ArrayList<String> getPrfalladas() {
		return prfalladas;
	}

	
	
	
	public static void main(String[] args) {
		Pregunta t1 = new Pregunta();
		TacoPreguntas t2 = new TacoPreguntas();
		//HashMap<String, String> preguntasNuevas = t1.devuelvePreguntasyRespuestasenObjetoPregunta("preguntasLugares");
		// t1.preguntar("lugares");
		
		// t2.devuelvePreguntasDe("preguntasLugares");
//	System.out.println(t2.devuelvePreguntasDe("preguntasLugares"));
		// t1.preguntar(t2.categoria);
		// t1.leerPreguntas();
//	t1.preguntar("nombres");
	}
	
	//---------------------CODIGO BASURA ---------------------
	
	public HashMap<String, String> devuelvePreguntasyRespuestasenObjetoPregunta(String nombreArchivo) {
		HashMap<String, String> tacoPreguntas = new HashMap<>();
	try {
		
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
//-----------------GETTERS Y SETTERS --------------------------------
	
	protected boolean isFinPreguntasMusica() {
		return finPreguntasMusica;
	}




	protected void setFinPreguntasMusica(boolean finPreguntasMusica) {
		this.finPreguntasMusica = finPreguntasMusica;
	}




	protected boolean isFinPreguntasNombres() {
		return finPreguntasNombres;
	}




	protected void setFinPreguntasNombres(boolean finPreguntasNombres) {
		this.finPreguntasNombres = finPreguntasNombres;
	}




	protected boolean isFinPreguntasLugares() {
		return finPreguntasLugares;
	}




	protected void setFinPreguntasLugares(boolean finPreguntasLugares) {
		this.finPreguntasLugares = finPreguntasLugares;
	}




	protected boolean isFinPreguntasAcciones() {
		return finPreguntasAcciones;
	}




	protected void setFinPreguntasAcciones(boolean finPreguntasAcciones) {
		this.finPreguntasAcciones = finPreguntasAcciones;
	}

	int contadorPreguntasNombres = 0, contadorPreguntasLugares = 0,
			contadorPreguntasAcciones = 0, contadorPreguntasMusica=0;
	
	
	
	
	
}
