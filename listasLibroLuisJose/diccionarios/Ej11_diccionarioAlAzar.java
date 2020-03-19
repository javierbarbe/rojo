package diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej11_diccionarioAlAzar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "";
		Scanner e = new Scanner(System.in);
		HashMap<String, String> larousse = new HashMap<String, String>();
		larousse.put("juego", "boardgame");
		larousse.put("mamada", "blowjob");
		larousse.put("fiebre", "fever");
		larousse.put("frontera", "boundary");
		larousse.put("papel_higienico", "toilet_paper");
		larousse.put("prohibir", "forbid");
// 		boolean distintos=false;
		System.out.println(larousse.get("juego"));
		NumeroAleatorio prueba= new NumeroAleatorio();
		int[] mio= new int [2];
		mio=prueba.getNumeros();
		prueba.imprimeArray(mio);
		System.out.println(mio[0]+" "+mio[1]+" "+mio[2]);
		
		System.out.println(larousse.values()+ " los values"); 
//		System.out.println(prueba.getNumeros());
int correctas=0;
		String [] a= larousse.keySet().toArray(new String[0]); //crea un array del tamaño necesario
		//por cada entrada del key 
		for( String al : a) {
			System.out.print(al+" "); //las claves 
		}
		System.out.println(mio.length);
		for (int i=0 ; i<mio.length; i++) {
			System.out.println(a[mio[i]]+" : "); //el array a String le el valor de la posicion almacenada
				// en el array mio; en cada pos tiene un valor distinto por el constructor de la clase
			String palabrametida= e.nextLine();
			if(palabrametida.equals(larousse.get(a[mio[i]]))) {
				/*
			palabrametida es igual a del hashmap larousse, cojo con get-> te devuelve 
			el valor de un value, pero necesito que le pases por parametro una clave / key
			entonces, con el array String "a" en el que he metido las respuestas con un tamaño 
			automatico gracias al metodo keysettoarraynewString[0]
			tengo en cada una de las posiciones del array las respuestas ordenadas ...
			si de ese array cojo la posicion que coincide con el valor que hay en el array mio posicion i;
			estoy cogiendo de a el valor "0" que es forbid, o el valor "1" que es fever...
			en definitiva el valor "i" que es cualquiera de los almacenados obligando a que i no se repita :)
			
			*/
				System.out.println("palabra correcta");
				correctas++; 
			}else {
				System.out.println("La respuesta "+ palabrametida+" es incorrecta");
				System.out.println("La respuesta correcta es "+ larousse.get(a[mio[i]]));
			}
			
		
		}
		if(correctas>2) {
			System.out.println("Muy bien has conseguido una puntacion de :"+ correctas);
			}else {
				System.out.println("Tu puntuación es demasiado baja ... deberías repasar zoquete");
			}
		
	
// 		System.arraycopy(numeros, 0, copiado, 0, numeros.length);
	
	}

}
class NumeroAleatorio{
	public int[] getNumeros() {
		return numeros;
	}
	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}
	public void imprimeArray() {
		for(int i= 0; i< this.numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
	public void imprimeArray(String [] recibido) {
		for(int i= 0; i< recibido.length;i++) {
			System.out.println(recibido[i]);
		}
	}
	public void imprimeArray(int [] recibido) {
		for(int i= 0; i< recibido.length;i++) {
			System.out.println(recibido[i]);
		}
	}
	private int aleatorio;
	private int[] numeros = new int[3];
	public NumeroAleatorio() {
		 
		
		for (int i = 0; i < numeros.length; i++) {
			aleatorio = ((int) (Math.random() * 6));
			numeros[i] = aleatorio;
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] == numeros[j] && i != j) {
					System.out.println(numeros[i] + " y " + numeros[j] + " son iguales");
					numeros[i] = (int) (Math.random() * 6);
					j = 0;
					i = 0;
				}
			}
		}
	}
}
