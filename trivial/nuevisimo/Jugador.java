package nuevisimo;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import heroquest.Dado;

public class Jugador {
	
	//--------------------ATRIBUTOS--------------------------------------------
	
	private int casillaActual=0,movimiento,cantidadQuesitos=0;
	static Pregunta prfinal= new Pregunta();
	private int acertadas=0;
	private boolean quesitoAcciones=false,quesitoLugares=false, quesitoMusica=false,quesitoNombres=false;
	String [] preguntasArray;
	Scanner sc = new Scanner (System.in);
	boolean ceroNoPuedeSalir=false,unoNoPuedeSalir=false,dosNoPuedeSalir=false,tresNoPuedeSalir=false;
	 private String nombre="";
	 boolean buena=false;
	 
///*******************************************************************************
	 
	 // --------------------------CONSTRUCTORES -------------------------------------------
	 
	public Jugador(String nombre) {
			
			this.nombre=nombre;
			
			try {
				comparar(nombre);
			} catch (ExcepcionNumerosenNombre e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	
	public Jugador() {
		 
	}
	// -**********************************************************
	

	public void ganarQueso(boolean acierto, boolean quesito, String categoria) {
		if(acierto && quesito) {
			switch (categoria) {
			case "acciones": quesitoAcciones=true;
				System.out.println("!GANASTE EL QUESO DE ACCIONES!!");
					cantidadQuesitos++;
					break;
			case "lugares": quesitoLugares=true;
				System.out.println("!GANASTE EL QUESO DE LUGARES!!");
				cantidadQuesitos++;
					break;
			case "musica" : quesitoMusica=true;
				System.out.println("!GANASTE EL QUESO DE MUSICA!!");
				cantidadQuesitos++;
					break;
			case "nombres": quesitoNombres=true;
				System.out.println("!GANASTE EL QUESO DE NOMBRES!!");
				cantidadQuesitos++;
				break;
			}
		}else {
			System.out.println("OOOHHH has fallado la pregunta de quesito... ");
			switch (categoria) {
			case "acciones": if(quesitoAcciones) { 
								quesitoAcciones=false;
								System.out.println("!y ademas...PERDISTE EL QUESO DE ACCIONES!!");
							}
					break;
			case "lugares":if (quesitoLugares) {
							quesitoLugares=false;
							System.out.println("!y ademas...PERDISTE EL QUESO DE LUGARES!!");
					}
					break;
			case "musica" :if(quesitoMusica) {
							quesitoMusica=false;
							System.out.println("!y ademas...PERDISTE EL QUESO DE MUSICA!!");
							}
					break;
			case "nombres": if(quesitoNombres) {
						quesitoNombres=false;
						System.out.println("!y ademas...PERDISTE EL QUESO DE NOMBRES!!");
						}
				break;
			}
			
			
		}
	}
	
	public boolean moverse() { // devuelve true si el acierto es correcto
		if(quesitoNombres && quesitoAcciones && quesitoLugares && quesitoMusica) {
			System.out.println("fin de juego");
			System.out.println("ganador "+ this.nombre);
			System.exit(0);
		}
		if(prfinal.isFinPreguntasAcciones() && prfinal.isFinPreguntasLugares() && prfinal.isFinPreguntasMusica() 
				&& prfinal.isFinPreguntasNombres()) {
			prfinal.setFinPreguntasTodas(true);
		}
		boolean seacabo=prfinal.isFinPreguntasTodas();
		if(seacabo) {
			System.out.println("se acabaron las preguntas");
			//System.exit(0);
		}
		boolean quesito=false;				   //cada vez que se ejecuta genera una tirada
		boolean acierto=false;
		Dado d6mov= new Dado(8); // de 1 a 4 tiene que ser de 0 a 3 por eso el menos 1, array de 4 pos
		int valordado=d6mov.getValor();
		animacionTiradaDado();
		casillaActual=valordado;
		movimiento+=casillaActual;
//		while(casillaActual>4) {
//			casillaActual/=4;
//		}
		switch (movimiento) { //aqui establezco las casillas de quesitos
		case 5 : System.out.println("<<<<<<<<<<<<<<<<<<Pregunta de quesito<<>>>>>>>>>>>");
				quesito=true;
				break;
		case 10 : System.out.println("<<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 15 : System.out.println("<<<<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 20: System.out.println("<<<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 25 : System.out.println("<<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 30: System.out.println("<<<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 35 : System.out.println("<<<<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>");
				quesito=true;
				break;
		case 40: System.out.println("<<<<<<<<<<<<<<Pregunta de quesito>>>>>>>>>>>>>>>>>>");
				quesito=true;
				break;
//		default : quesito=true; 
//				System.out.println("Por defecto quesito siempre PRUEBAS");
		}
		if (movimiento>40) {
			movimiento=0;
		}
		System.out.println("sacas un "+ valordado);
		System.out.println("vas a la casilla " +this.movimiento);
		System.out.println("la pregunta es de la categoria "+ prfinal.categorias[valordado]);
		acierto=prfinal.preguntar(prfinal.categorias[valordado],this);
		if(quesito) { //con este if evaluo si ha caido en pregunta de quesito
			ganarQueso(acierto, quesito, prfinal.categorias[valordado]); //ganarqueso evalua si acierto y 
			// quesito son true te otorga el queso o 
			//te devuelve un string sintiendo mucho que hayas fallado
		}
		if(acierto) {
			acertadas++;
		}
		return acierto;
	}
	
	
	public void animacionTiradaDado() {
		try {
			System.out.print(".");
			Thread.sleep(350);
			System.out.print("..");
			Thread.sleep(350);
			System.out.print("...");
			Thread.sleep(350);
			System.out.print("....");
			Thread.sleep(350);
			System.out.println("__");
			System.out.println("..........|�|");
			System.out.println("          --");
			
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("error al parar el programa");
		}
	}
	
	public void imprimeCuantosQuesitosyPosicion() {
		System.out.println("le toca al jugador "+this.getNombre()+ " estas en la casilla "+ this.getMovimiento());
		if (this.getCantidadQuesitos()>1 || this.getCantidadQuesitos()==0) {
		System.out.println("tienes "+ this.getCantidadQuesitos()+ " quesitos");
		}else {
			System.out.println("tienes "+ this.getCantidadQuesitos()+ " quesito");
		}
	}
	
	boolean comparar(String nombre) throws ExcepcionNumerosenNombre{
		nombre=nombre.toLowerCase();
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

return buena; 
//////////////////////METODO CARLOS RUDIMENTARIO XD///////////////////////////////////////////

//for (int i= 0 ; i< nombre.length(); i++) {
//char carPos= nombre.charAt(i);
//letra = letra.valueOf(carPos); 
//valueOf(carPos);
//if(abec.contains(letra)) {
//System.out.println("esta posicion es una letra");
//buena=true;
//}else {
//System.out.println("esta poscion NO ES LETRA");
//buena=false;
//}
//}

/////////////////////////////////////FIN METODO CARLOS///////////////////////////////////////////////////
}

	//-----------------------------GETTERS Y SETTERS------------------------
	
	protected String getNombre() {
	return nombre;
	}
	protected void setNombre(String nombre) {
		boolean nombreCorrecto=false;
		do {
		try {
				comparar(nombre);
				nombreCorrecto=true;
			} catch (ExcepcionNumerosenNombre e) {
				// TODO Auto-generated catch block
				//sc.next();
				System.out.println("solo caracteres alfabeticos simples");
				System.out.println("introduce un nuevo nombre");
				nombre=sc.nextLine();
			}
		}while(!nombreCorrecto);
		this.nombre = nombre;
		nombreCorrecto=false;
	}

	
	protected int getCasillaActual() {
		return casillaActual;
	}
	protected void setCasillaActual(int casillaActual) {
		this.casillaActual = casillaActual;
	}
	protected int getMovimiento() {
		return movimiento;
	}
	protected void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}
	protected int getAcertadas() {
		return acertadas;
	}
	protected void setAcertadas(int acertadas) {
		this.acertadas = acertadas;
	}
	protected int getCantidadQuesitos() {
		return cantidadQuesitos;
	}
	///******************************--------------------------------------------------------------------
	
	
	
	//--------------------CODIGO BASURA-------------------------------------------
//	public void responder() {
//	PreguntaNombres ne = new PreguntaNombres();
//	HashMap<String, String> preguntado= ne.getTacoPreguntas();
//	 preguntasArray =preguntado.keySet().toArray(new String [0]);
//	Dado d6 = new Dado(preguntado.size());
//	String pregunta2 =preguntado.get(preguntasArray[d6.getValor()-1]);
//	System.out.println(preguntasArray[d6.getValor()-1]);
//	System.out.println("tu respuesta es: ");
//	
//	String respuestaJugador= sc.nextLine();
//	if (pregunta2.equalsIgnoreCase(respuestaJugador)) {
//		System.out.println("respuesta correcta!!!");
//	}else {
//		System.out.println("eres un analfabeto disney");
//	}
//}
	
	
	
}
