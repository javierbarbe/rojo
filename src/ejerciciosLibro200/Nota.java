package ejerciciosLibro200;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner e=new Scanner(System.in);

boolean a = true;
boolean b = false;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("a && b = " + (a && b));
System.out.println("a || b = " + (a || b));
System.out.println("!a = " + !a);
System.out.println("a || (6 > 10) = " + (a || (6 > 10)));
System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
		System.out.println("Introduce la nota que deseas en el trimestre");
		double nota=e.nextDouble();
		System.out.println("Introduce la nota de tu primer examen");
		double nota1=e.nextDouble();
		double notatotal=(nota*0.9+nota1*0.1);
		System.out.println("Necesitas sacar "+notatotal+" para tener un "+nota+ " en el trimestre\ndespues de sacar un "+nota1+" en el primer examen");
		
		
	}

}
