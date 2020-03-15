
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
	int x,y; 
	Scanner entrada= new Scanner(System.in);
		System.out.println("introduzca dos numeros x , y");
		x=entrada.nextInt();
		y=entrada.nextInt();
		//System.out.println("(x > y > 0) es " + (x > y > 0)); //necesita un operador logico
		//System.out.println("(x = y && y)" + (x=y && y));// e "y" qué? 
		//System.out.println(" (x /= y) es " + ( x/=y));
		System.out.println(" (x !=0 && x==0) es " + ( x !=0 && x==0)); // false 
		
	}

}
