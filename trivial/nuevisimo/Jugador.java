package nuevisimo;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import heroquest.Dado;

public class Jugador {
	private int casillaActual=0,movimiento;
	static Pregunta prfinal= new Pregunta();
	String [] preguntasArray;
	Scanner sc = new Scanner (System.in);
	boolean ceroNoPuedeSalir=false,unoNoPuedeSalir=false,dosNoPuedeSalir=false,tresNoPuedeSalir=false;
 private String nombre="";
 boolean buena=false;
	protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
	public Jugador(String nombre) {
		this.nombre=nombre;
		
		try {
			comparar(nombre);
		} catch (ExcepcionNumerosenNombre e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
//	public Pregunta preguntar(String categoria) {
//	
//		if (categoria.equals("nombres")) {
//			String pregunta= preguntasNombres[contadorPreguntasNombres];
//			System.out.println(pregunta);
//			System.out.println("Respuesta?");
//			String respuesta = sc.nextLine();
//			if(respuesta.equalsIgnoreCase(pregNombres.get(pregunta))){
//				System.out.println("respuesta correcta");
//				contadorPreguntasNombres++;
//			}
//			else {
//				System.out.println("nooooooooooooooooooooo incorrecto");
//			}
//		}
//		if(categoria.equals("lugares")) {
//			String pregunta=soloPreguntasLugares[contadorPreguntasLugares];
//			System.out.println(pregunta);
//			System.out.println("Respuesta?");
//			String respuesta = sc.nextLine();
//			System.out.println(pregLugares.get(pregunta));
//			if(respuesta.equalsIgnoreCase(pregLugares.get(pregunta))){
//				System.out.println("respuesta correcta");
//				contadorPreguntasLugares++;
//			}
//			else {
//				System.out.println("nooooooooooooooooooooo incorrecto");
//			}
//		}
//		if(categoria.equals("acciones")) {
//			String pregunta=soloPreguntasAcciones[contadorPreguntasAcciones];
//			System.out.println(pregunta);
//			System.out.println("Respuesta?");
//			String respuesta = sc.nextLine();
//			System.out.println(pregAcciones.get(pregunta));
//			if(respuesta.equalsIgnoreCase(pregAcciones.get(pregunta))){
//				System.out.println("respuesta correcta");
//				contadorPreguntasAcciones++;
//			}
//			else {
//				System.out.println("nooooooooooooooooooooo incorrecto");
//			}
//		}
//	}
	
	public boolean moverse() { // devuelve true si el acierto es correcto
							   //cada vez que se ejecuta genera una tirada
		boolean acierto=false;
		Dado d6mov= new Dado(4); // de 1 a 4 tiene que ser de 0 a 3 por eso el menos 1, array de 4 pos
		int valordado=d6mov.getValor()-1;
		casillaActual=valordado;
		movimiento+=casillaActual;
//		while(casillaActual>4) {
//			casillaActual/=4;
//		}
		if(prfinal.finPreguntasMusica==true && valordado==3) {
			do {
				 d6mov= new Dado(4); // de 1 a 4 
				 valordado=d6mov.getValor()-1;
				 tresNoPuedeSalir=true;
			}while(valordado==3);
		}
		if(prfinal.finPreguntasAcciones==true && valordado==2) {
			do {
				 d6mov= new Dado(4); // de 1 a 4 
				 valordado=d6mov.getValor()-1;
				 dosNoPuedeSalir=true;
			}while(valordado==2);
		}
		if(prfinal.finPreguntasLugares==true && valordado==1) {
			do {
				 d6mov= new Dado(4); // de 1 a 4 
				 valordado=d6mov.getValor()-1;
				 unoNoPuedeSalir=true;
			}while(valordado==1);
		}
	
		if(prfinal.finPreguntasMusica==true && valordado==0) {
			do {
				 d6mov= new Dado(4); // de 1 a 4 
				 valordado=d6mov.getValor()-1;
				 ceroNoPuedeSalir=true;
			}while(valordado==0);
		}else {
			ceroNoPuedeSalir=false;
		}
		//while((!tresNoPuedeSalir && valordado==3) || (!unoNoPuedeSalir && valordado==1))
	
		acierto=prfinal.preguntar(prfinal.categorias[valordado]);
		
		return acierto;
	}
	
	
	
	
	
	public void responder() {
		PreguntaNombres ne = new PreguntaNombres();
		HashMap<String, String> preguntado= ne.getTacoPreguntas();
		 preguntasArray =preguntado.keySet().toArray(new String [0]);
		Dado d6 = new Dado(preguntado.size());
		String pregunta2 =preguntado.get(preguntasArray[d6.getValor()-1]);
		System.out.println(preguntasArray[d6.getValor()-1]);
		System.out.println("tu respuesta es: ");
		
		String respuestaJugador= sc.nextLine();
		if (pregunta2.equalsIgnoreCase(respuestaJugador)) {
			System.out.println("respuesta correcta!!!");
		}else {
			System.out.println("eres un analfabeto disney");
		}
	}
	
	boolean comparar(String nombre) throws ExcepcionNumerosenNombre{
		nombre=nombre.toLowerCase();
		String letra="";
		String abec= "abcdefghijklmn�opqrstuvwxyz";

		//////////////////////METODO CARLOS RUDIMENTARIO XD///////////////////////////////////////////
		
		for (int i= 0 ; i< nombre.length(); i++) {
//		 char carPos= nombre.charAt(i);
//		  letra = letra.valueOf(carPos); 
		  //valueOf(carPos);
//		 if(abec.contains(letra)) {
//			 System.out.println("esta posicion es una letra");
//			 buena=true;
//		 }else {
//				System.out.println("esta poscion NO ES LETRA");
//				buena=false;
//			}
		
		/////////////////////////////////////FIN METODO CARLOS///////////////////////////////////////////////////
			Pattern pat = Pattern.compile("[abcdefghijklmn�opqrstuvwxyz ]+");
			Matcher m= pat.matcher(nombre);
			if(m.matches()) {
				//System.out.println("el patron encaja");
				buena=true;
			}else {
				
				buena=false;
				throw new ExcepcionNumerosenNombre();
				
				//break;
			}
	

		
		
		}return buena; 
	}
}
