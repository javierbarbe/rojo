import java.util.Scanner;
public class AnyoBisiesto {




	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a;
	do {	
	System.out.println("introduzca un anyo");
	a=entrada.nextInt();
	//que pasa con 1800?? 1800/4=450, 1804 es bisiesto y 1796 tb
	// tambien pasa con el a�o 100
if( (a%4==0 && a%100!=0) || a%400==0) {
	System.out.println("El anyo " +a+ " es un anyo bisiesto");
} else {
	System.out.println("El anyo " +a+ " no es bisiesto");
}
	}while (a<10000);
	}

}
