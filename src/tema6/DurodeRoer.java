package tema6;
import java.util.*;

public class DurodeRoer {
Scanner e=new Scanner(System.in);
	public int[] ej1() {
		int a;
		 /*Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
		  * Muestra por consola el indice y el valor
		  al que corresponde. Haz dos m�todos,
		  uno para rellenar valores y otro para mostrar.*/
		
		int num []=new int [4];
	return num;
	}
	public void rellena(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Introduce valor");
			a[i]=e.nextInt();
		}
		
	}
	
	public void muestra(int []a) {
		for (int q: a) {
			System.out.print(q+" ");
		}
	}
	
	/*Crea un array de n�meros donde le indicamos por teclado el tama�o del array, 
	 * rellenaremos el array con n�meros aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posici�n y
	 *  la suma de todos los valores. Haz un m�todo para rellenar el array (que tenga como par�metros
	 *  los n�meros entre los que tenga que generar), para mostrar el contenido
	 *   y la suma del array y un m�todo privado para generar n�mero aleatorio (lo puedes usar para otros ejercicios).
	 */
	
	public int [] sumante() {
	
		System.out.println("Introduce longitud del array");
		int longitud=e.nextInt();
		int sumatorio []= new int [longitud];
		for (int i=0;i<sumatorio.length;i++) {
			sumatorio[i]=aleatorio();
			for(int j=sumatorio.length-1;j>=0;j--) {
				if(j!=i) {
					while (sumatorio[i]==sumatorio[j]) {
						sumatorio[i]=aleatorio();
						for (int q=0;q<sumatorio.length;q++) {
							if(q!=i) {
								
							}
						}
							while(sumatorio[i]==sumatorio[j]) {
							sumatorio[i]=aleatorio();
						}
					}
				}
			}
		} return sumatorio;
	}
	
	
	private int aleatorio() {
		int aleatorio=(int)(Math.random()*2);
		return aleatorio;
	}
	
	public void muestra() {
		int impreso []=sumante();
		for (int i=0;i<impreso.length;i++) {
			System.out.print(impreso[i]+" ");
		}
		
	}
	
	
	
}

