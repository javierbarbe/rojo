
import java.util.Scanner;
public class EjercicioHoroscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
int anyo,animal;

do {
System.out.println("Introduce año de nacimiento");
anyo=entrada.nextInt();

	animal=anyo%12;
			switch (animal) {
			case 0: 
				System.out.println("Tu animal es el mono");
				break;
			case 1: 
				System.out.println("Tu animal es el gallo");
				break;
			case 2: 
				System.out.println("Tu animal es el perro");
				break;
			case 3: 
				System.out.println("Tu animal es el cerdo");
				break;
			case 4: 
				System.out.println("Tu animal es el rata");
				break;
			case 5: 
				System.out.println("Tu animal es el cabra");
				break;
			case 6: 
				System.out.println("Tu animal es el tigra");
				break;
			case 7: 
					System.out.println("Tu animal es el conejo");
					break;
			case 8: 
				System.out.println("Tu animal es el dragon");
					break;
			case 9: 
				System.out.println("Tu animal es el serpiente");
					break;
			case 10: 
				System.out.println("Tu animal es el caballo");
				break;
			case 11: 
				System.out.println("Tu animal es el oveja");
				break;
			
			}} while (anyo<100000) ;
			
	}

}

