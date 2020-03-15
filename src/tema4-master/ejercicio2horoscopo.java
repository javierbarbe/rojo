
import java.util.Scanner;
public class ejercicio2horoscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int anyo,animal;

do {
System.out.println("Introduce anyo de nacimiento");
anyo=entrada.nextInt();

	animal=anyo%12;
			if (animal%12==0) {
			 
				System.out.println("Tu animal es el mono");
				
			}else if (animal%12==1) { 
				System.out.println("Tu animal es el gallo");
			}
			else if (animal%12==2) { 
				System.out.println("Tu animal es el perro");
			}
			else if (animal%12==3) { 
				System.out.println("Tu animal es el cerdo");
			}else if (animal%12==4) { 
				System.out.println("Tu animal es el rata");
			}
			else if (animal%12==5) { 
				System.out.println("Tu animal es el cabra");
			}
			else if (animal%12==6) {  
				System.out.println("Tu animal es el tigra");
			}
			else if (animal%12==7) {  
					System.out.println("Tu animal es el conejo");
			}
			else if (animal%12==8) {  
				System.out.println("Tu animal es el dragon");
			}
			else if (animal%12==9) {  
				System.out.println("Tu animal es el serpiente");
			}
			else if (animal%12==10) {  
				System.out.println("Tu animal es el caballo");
			}
			else if (animal%12==11) {  
				System.out.println("Tu animal es el oveja");
			}
			
			} while (anyo<100000) ;
			
	}

}
