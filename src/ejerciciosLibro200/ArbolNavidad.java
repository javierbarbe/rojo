package ejerciciosLibro200;
import java.util.Scanner;
public class ArbolNavidad {
	String ladrillo="";
	int altura, planta=1,espacios,anchura=1 ;
	Scanner e=new Scanner(System.in);
	
	public ArbolNavidad() {}
	
	public void dibujaArbol() {
		
		System.out.println("Introduce altura del arbol");
		altura=e.nextInt();
		System.out.println("Introduce ladrillo");
		ladrillo=e.next();
		espacios=(altura-planta);
		while (planta<=altura) {
			for(int i=1;i<=espacios;i++) {
				System.out.print(" ");
				
			}
			for (int i=1;i<=anchura;i++) {
				System.out.print(ladrillo);
			}
			System.out.println(" ");
		planta++;
		anchura+=2;
		espacios=altura-planta;
		}
	}
}
