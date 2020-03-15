
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		 int a;		// TODO Auto-generated method stub
 Scanner entrada=new Scanner(System.in);
 
 int  num= (int) (Math.random()*100+1);
 
 do {
  System.out.println("Introduzca su boleto de 2 digitos");
  a=entrada.nextInt();
  if (a<100) {
	  
  
  if (a==num) {
	  System.out.println("el numero es correcto " + num+" y tiene un premio de 50000€.");
  }else if (a%10==num%10 || a/10%10==num/10%10) {
	  System.out.println("Ha acertado al menos un digito en el orden correcto,\n tiene un premio de..3000€.\n "
	  		+ "El numero premiado es " +num);
  } else if (a%10 == num/10%10 &&  a/10%10==num%10) {
	  System.out.println("Los digitos están invertidos. Premio de 1000€.\nEl numero premiado es "
			  + num);
  }
  
  
  //else if (a%100==num%100) {
	//  System.out.println("ha acertdo las decenas, el premio es de")
  
  else{
	  System.out.println("el numero no esta premiado. El premiado es "+ num);}
  } else {
	  System.out.println("introduzca un numero valido");
  }} 
  while (a<100) ;
  
	} 

}
