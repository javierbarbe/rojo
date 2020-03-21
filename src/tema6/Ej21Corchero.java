package tema6;
import java.util.Scanner;
public class Ej21Corchero {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int [] aleatorio= new int [15]; 
		for ( int i = 0; i< aleatorio.length; i++) {
			aleatorio[i]= (int)(Math.random()*501);
		}
		imprimeArray(aleatorio);
		cincueriza(aleatorio);
		System.out.println();
		imprimeArray(aleatorio);
	}

	public static void cincueriza(int [] recibido ) {
		for (int i= 0; i<recibido.length; i++) {
			while( recibido[i]%5!=0) {
				recibido[i]++;
			}
		}
	}
	public static  void imprimeArray(int [] aleatorio) {
		for (int i : aleatorio) {
			System.out.print(i+" ");
		}
	}
	
}
