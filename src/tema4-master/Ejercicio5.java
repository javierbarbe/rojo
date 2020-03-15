
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner entrada=new Scanner(System.in);
 float num;
 System.out.println("Introduzca un numero");
 num=entrada.nextFloat();
 
 if((num%2==0) && (num%3==0)){
	 
	 System.out.println("el numero es multiplo de 2 y 3");
	 
 }else if ((num%2==0) || (num%3==0)) {
	 System.out.print("el numero  es multiplo de 2 o 3 \nmas concretamente: ");
	 if (num%2==0) {
	 System.out.println("el numero es multiplo de 2");}
	 else {
		 System.out.println("es multiplo de 3");
	 }
 } else if ((num%2==0) ^ (num%3==0)) {
	 
	 System.out.println("El numero solo es  multiplo de 2 o de 3");
 }
 
	}

}

