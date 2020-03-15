package ejerciciosLibro200;
import java.util.Scanner;
public class PruebaSuma100 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			String relleno="";
		    Scanner e=new Scanner(System.in);
		    System.out.print("Por favor, introduzca la altura de la pirámide: ");
		    int alturaIntroducida = e.nextInt();

		    System.out.print("Introduzca el carácter de relleno: ");
		     relleno = e.next();
		    
		    int planta = 1;
		    int longitudDeLinea = 1;
		    int espacios = alturaIntroducida-1;
		    
		    while (planta <= alturaIntroducida) {
		      
		      // inserta espacios
		      for (int i = 1; i <= espacios; i++) {
		        System.out.print(" ");
		      }

		      // pinta la línea
		      for (int i = 1; i <= longitudDeLinea; i++) {
		        System.out.print(relleno);
		      }

		      System.out.println();

		      planta++;
		      espacios--;
		      longitudDeLinea += 2;
		    }
		  }
		}

