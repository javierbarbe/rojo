package tema6;
import java.util.*;
public class OperacionesMatrices {
	Scanner e=new Scanner(System.in);
	int n;
	double []x=new double[n];
	public int[] creaArray() {
		/*un programa que pida 15 numeros y los almacene
		 * en un array . Rota los elementos una posicion
		 */
		int [] array = new int [15];
		for (int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*10); 
			
		}return array;
	}
	public int [] rotaArray(int [] array) {
		int primero=0;
		int ultimo=array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[primero]=ultimo;
		
		return array;
	}
	
	public void imprimeArray(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.out.printf("%4d",array[i]);
			switch (i) {
			case 19:	System.out.println();
						break;
			case 39: System.out.println();
					break;
			case 59: System.out.println();
					break;
			case 79: System.out.println();
					break;
			case 100: System.out.println();
						break;
			}
		}
	}
	
	public void entrecomilla() {
		int [] cien= new int[100];
		for (int i=0; i<cien.length;i++) {
			cien[i]=(int)(Math.random()*21);
			
		}
		imprimeArray(cien);
		System.out.println("Introduce la cifra a buscar");
		int cifra=e.nextInt();
		System.out.println("Introduce la cifra a intercambiar");
		int cambio=e.nextInt();
		
		for(int i=0;i<cien.length;i++){
			//System.out.print(cien[i]+" ");
			if(cien[i]==cifra) {
				cien[i]=cambio;
				System.out.print("\""+ cien[i] + "\"");
			}else {
				System.out.print(cien[i]+" ");
			}
			if (i==19) {
				System.out.println();
			}
			if(i==39) {
				System.out.println();
			}
			if (i==59) {
				System.out.println();
			}
			if (i==79) {
				System.out.println();
			}
		}
		
		
	} //fin entrecomilla
	
	///public void 
}
