package ejerciciosLibro200;
import java.util.Scanner;
public class BasePotencia {
	
	private int base, exponente;
	Scanner e =new Scanner(System.in);
public BasePotencia() {}

public void calculaPot() {
	
	System.out.println("Introduce la base");
	base=e.nextInt();
	System.out.println("introduce exponente");
	exponente=e.nextInt();
	for (int i = 1;i<=exponente;i++) {
		System.out.print(base+"^"+i +" ");
	}
}
}
