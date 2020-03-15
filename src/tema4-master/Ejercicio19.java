
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner entrada=new Scanner(System.in);
 int score,scale = 10, income ,number;
 String i="es multiplo", j="no es multiplo";
 double tax;
 System.out.println("Introduzca ganancias");
		income=entrada.nextInt();
		tax=(income>10000)? income*0.2 : income*0.17+1000;
		System.out.println(tax);
		 if(income>10000) {
			 System.out.println("tax= "+ income*0.2);
		 }else {
			 System.out.println("tax= "+ income*0.17 +1000);
		 }
 System.out.println("Introduzca puntuacion");
 score=entrada.nextInt();
 if (score>10) {
	System.out.println( scale*3);
 } else {
	 System.out.println(scale*4);
	 }
 
	 System.out.println("Introduzca numero multiplo de tres");
	number=entrada.nextInt() ; 
	if(number%3==0) {
		System.out.println(i);
	}else {
		System.out.println(j);
	}
 }
		
	}


