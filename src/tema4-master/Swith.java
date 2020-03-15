
import java.util.Scanner;
public class Swith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
double x,y,z ; 	
System.out.println("introduce 3 numeros");
x=entrada.nextInt();
y=entrada.nextInt();
z=entrada.nextInt();

	System.out.printf("numero es  %f%n", x);
System.out.println("(x < y && y < z) is " + (x<y &&y<z));
System.out.println("(x < y || y < z) is " + (x<y ||  y<z));
System.out.println("!(x < y) is " + !(x<y));
System.out.println(" (x + y < z) is "+ (x+y<z));
	
	}

}
