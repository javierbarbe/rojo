package rehechosListasDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		Scanner s = new Scanner(System.in);
		int contador=0;
		HashMap <String,String> midiccionario= new HashMap<String,String>();
		midiccionario.put("coche","car");
		midiccionario.put("llaves", "keys");
		midiccionario.put("castillo", "castle");
		midiccionario.put("clase", "class");
		midiccionario.put("mi casa de chocolate", "my chocolate's house");
		midiccionario.put("ordenador", "computer");
		midiccionario.put("cascos", "headphones");
		midiccionario.put("juego", "game");
		int erroneas=0;
		System.out.println(midiccionario.values());
		/*
		 * se puede pasar a string cualquiera de los dos parametros. tanto el key como el value
		 */
//		String [] soluciones=midiccionario.values().toArray(new String[0]);
//		for (String q: soluciones) {
//			System.out.println(q);
//		}
		System.out.println(midiccionario.containsKey("juego"));
		int [] erroneos= new int [5];
		String [] dicarray= midiccionario.keySet().toArray(new String [0] );
		NumAleatorio mio = new NumAleatorio(midiccionario.size());
		int [] elegidos=mio.getAleato();
	//	mio.imprime();
		//System.out.println(elegidos[0]+ " "+ elegidos[2]);
		for (int i = 0; i< 5; i++) {
		System.out.println("Introduce la traduccion de "+ dicarray[elegidos[i]]);
		String respuesta=s.next();
		if(respuesta.equals(midiccionario.get(dicarray[elegidos[i]]))){
			System.out.println("Correcto!");
			contador++;
		}else {
			System.out.println("Respuesta incorrecta");
			erroneas++;
			erroneos[i]=elegidos[i];
		}
	}
		
		
System.out.println("tus respuestas correctas son "+ contador);
for (int i= 0 ; i< erroneas; i++) {
System.out.printf("%10s traduccion correcta=> %10s",dicarray[erroneos[i]] ,midiccionario.get(dicarray[erroneos[i]]));
System.out.println();
}
}}
class NumAleatorio{
	protected int[] getAleato() {
		return aleato;
	}
	protected void setAleato(int[] aleato) {
		this.aleato = aleato;
	}
	int [] aleato= new int[5];
	public NumAleatorio(int tamanio) {
		
		int aletorio= (int)(Math.random()*tamanio);
		for (int i=0; i< aleato.length;i++) {
			aleato[i]=aletorio;
			 aletorio= (int)(Math.random()*tamanio);
		}
		
		for (int i= 0 ; i<aleato.length;i++) {
			for(int j=0;j<aleato.length;j++) {
				if(aleato[i]==aleato[j] && i!=j) {
					aleato[i]=(int)(Math.random()*tamanio);
					i=0;
					j=0;
				}
			}
		}
	} //fin metodo CONSTRUCTOR
	public void imprime() {
		for(int n:aleato) {
			System.out.println(n);
		}
	}

}
