package nuevisimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PreguntaNombres extends Pregunta {
	HashMap< String, String> tacoPreguntas	 = new HashMap<>();;
	public PreguntaNombres() {
	
		{
			try{
				BufferedReader br = new BufferedReader(new FileReader("trivial/nuevisimo/preguntasYrespuestas.txt"));	
				String linea="";
				String respuesta="";
				while(linea!=null) {
					//System.out.println(linea);
					linea=br.readLine();
					respuesta=br.readLine();
					//System.out.println(linea);
					//System.out.println(respuesta);
					if(linea!=null) {
						tacoPreguntas.put(linea, respuesta);
					}
				}
			
				tacoPreguntas.put("Nombre del primer ministro Español", "Pedro Sanchez");
				//System.out.println(tacoPreguntas);
			}catch (FileNotFoundException e) {
				System.out.println("no se encontro el archivo de preguntas respuestas de historia");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error al leer del archivo");
			}
				
			}
	}
	
	public static void main (String [] args) {
		PreguntaNombres ne = new PreguntaNombres();
		Jugador yo= new Jugador("Antonio");

		yo.responder();
		
		
//		System.out.println("hooooooooooooooooooooooola");
		
		
		
		
		
//		for(Map.Entry<String, String> entry : ne.tacoPreguntas.entrySet()) {
//			if(entry!=null) {
//				System.out.println("Esta clave \""+ entry.getKey()+ "\" tiene este valor "+ entry.getValue());
//			}
//		}
		//System.out.println(ne.tacoPreguntas.entrySet().);
	}

	protected HashMap<String, String> getTacoPreguntas() {
		return tacoPreguntas;
	}

	protected void setTacoPreguntas(HashMap<String, String> tacoPreguntas) {
		this.tacoPreguntas = tacoPreguntas;
	}
}
