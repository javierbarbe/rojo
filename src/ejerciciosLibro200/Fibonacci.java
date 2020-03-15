package ejerciciosLibro200;
import java.util.Scanner;
public class Fibonacci {
int posicion, n,numero;
	public Fibonacci() {}
	
	public void calcula5() {
		Scanner e=new Scanner(System.in);
		System.out.println("introduce la poscion fibonacci a partir de la cual mostrar 5 numeros");
		numero=e.nextInt();
		int posicion= ((numero-2)+(numero-1));
		
		System.out.print(numero+" ");
		/*n=((posicion-2)+(posicion-1))+1;
		while( n<=posicion+5) {
			System.out.print(n+" ");
			n++;*/
		
	}
}
