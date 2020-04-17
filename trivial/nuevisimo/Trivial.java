package nuevisimo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import heroquest.Dado;
/*
 * 1� Crear un metodo en el cual se pregunte cuantos jugadores que van a jugar	
	1�A el numero no puede tener letras (Exception)
	1�B el numero tiene que tener un limite entre 2 y los que quieras
2� Viendo cuantos jugadores son preguntar los nombres
	2�A el nombre no puede tener numeros (Exception)
3� Se tiene que elegir aleatoreamente el orden
4� Meter 4 tipos de preguntas (Historia,musica,deportes,cine)
	4�A Meter preguntas  
5� Numero aleatorio para saber de que tipo de pregunta es^
6� Cargar la pregunta que tiene que ser de ese tipo 
7� si aciertas se suma un 1 punto el que llege tener un putno de cada pregunta gana
8� Si aciertas te hace otra pregunta hasta fallar
 */
public class Trivial {
boolean buena=false;

	public void compararTodos(String [] jugadores) {
		Scanner sc = new Scanner(System.in);
		boolean salidaNombres=false;
		for(int i=0; i<jugadores.length;i++) {
			do {
				System.out.println("nombre");
				jugadores[i]=sc.next();
				try {
					comparar(jugadores[i]);
					salidaNombres=true;
				
				} catch (ExcepcionNumerosenNombre e) {
					// TODO Auto-generated catch block
				//	e.printStackTrace();
					salidaNombres=false;
				}
			
			}while(!salidaNombres);
			
		
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String nombre="";
		boolean nombreOk=false;
		Trivial prueba= new Trivial();
		int cantidadJugadores=0;
	ArrayList<Jugador> jugadoresLista= new ArrayList<>(); 
	Jugador [] jugadoresNombres ;
	
		boolean cantJugadores=false;
			boolean salidaNombres=false;
				
						
						do{
							try{
								System.out.println("Numero de jugadores");
								cantidadJugadores= sc.nextInt();
								if(cantidadJugadores<2) {
									System.out.println("No sois suficientes jugadores, m�nimo 2");
								}else {
									cantJugadores=true;
									
									
								}
							}catch(Exception e) {
								System.out.println("Numero por favor");
								sc.next();
							}
						}while(!cantJugadores);
						jugadoresNombres= new Jugador [cantidadJugadores];
						do {
							for(int i=0;i<jugadoresNombres.length;i++) {
								try {
									nombreOk=false;
									System.out.println("Introduce tu nombre");
									String palabra=sc.next();
									jugadoresNombres[i]=new Jugador(palabra);
									jugadoresNombres[i].comparar(jugadoresNombres[i].getNombre());
									nombreOk=true;
									jugadoresLista.add(new Jugador(palabra));
								} catch (ExcepcionNumerosenNombre e) {
									// TODO Auto-generated catch block
									System.out.println("Nombre incluye caracteres no admitidos");
								}
							}
						}while(!nombreOk);
						System.out.println("el orden de juego sera");
						Collections.shuffle(jugadoresLista);
						for ( Jugador jugador : jugadoresLista) {
							System.out.println(jugador.getNombre());
						}
		Pregunta ronda1= new Pregunta();
		
		ronda1.preguntar("nombres");
						
		 }

}
