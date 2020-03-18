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
		NumeroAleatorio prueba= new NumeroAleatorio();
		int[] mio= new int [2];
		mio=prueba.getNumeros();
		prueba.imprimeArray(mio);
		System.out.println(mio[0]+" "+mio[1]+" "+mio[2]);
		
		System.out.println(larousse.values());
//		System.out.println(prueba.getNumeros());
int correctas=0;
		String [] a= larousse.keySet().toArray(new String[0]);
		for( String al : a) {
			System.out.print(al+" "); //las claves 
		}
		System.out.println(mio.length);
		for (int i=0 ; i<mio.length; i++) {
			System.out.println(a[mio[i]]+" : ");
			String palabrametida= e.next();
			if(palabrametida.equals(larousse.get(a[mio[i]]))) {
				System.out.println("palabra correcta");
				correctas++; 
			}else {
				System.out.println("respuesta incorrecta");
				System.out.println("La respuesta correcta es "+ larousse.get(a[mio[i]]));
			}
			
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
