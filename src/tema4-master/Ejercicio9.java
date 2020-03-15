
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int x;
		x=entrada.nextInt();
System.out.println("esto es " + (x%2==0 && x%3==0) +" "+ (x%6==0));
	}

}

