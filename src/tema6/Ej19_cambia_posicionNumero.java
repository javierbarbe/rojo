package tema6;
import java.util.*;
public class Ej19_cambia_posicionNumero {
	int [] primero= new int [12];
	int [] orden= new int [12];
	Scanner e=new Scanner(System.in);
	public Ej19_cambia_posicionNumero() {
		
		
	}
	public int[] generaArray() {
		
		for (int i=0;i<primero.length;i++) {
			primero[i]=(int)(Math.random()*201);
		}return primero;
	}
	
	public int[] muestraArray(int [] recibido) {
		for(int i=0;i<orden.length;i++) {
			if(i==0) {
				System.out.print("indice    ");
			}
			orden[i]=i;
			System.out.printf("%6d", orden[i]);
		}System.out.println();
		for(int i=0;i<recibido.length;i++) {
			if(i==0) {
				System.out.print("Valores   ");
			}
			System.out.printf("%6d", recibido[i]);
		} return recibido;
	}
	public int [] cambiaNumero(int [] recibido) {
		System.out.println();
		System.out.println("Que posicion quieres cambiar?");
		int pos=e.nextInt();

		for(int i=recibido.length-1;i>=pos;i--) {
			if(i!=0) {
			recibido[i]=recibido[i-1];
			}

		}
		recibido[pos]= e.nextInt();
		
		return recibido;
	}
	public static void main(String[] args) {
		Ej19_cambia_posicionNumero neo= new Ej19_cambia_posicionNumero();
		//neo.generaNumeros();
		neo.muestraArray(neo.cambiaNumero(neo.muestraArray(neo.generaArray())));

	}
}
