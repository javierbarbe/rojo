package ejerciciosLibro200;
import java.util.Scanner;
public class PruebaSuma100 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			String relleno="";
		    Scanner e=new Scanner(System.in);
		    System.out.print("Por favor, introduzca la altura de la pir�mide: ");
		    int alturaIntroducida = e.nextInt();

		    System.out.print("Introduzca el car�cter de relleno: ");
		     relleno = e.next();
		    
		    int planta = 1;
		    int longitudDeLinea = 1;
		    int espacios = alturaIntroducida-1;
		    
		    while (planta <= alturaIntroducida) {
		      
		      // inserta espacios
		      for (int i = 1; i <= espacios; i++) {
		        System.out.print(" ");
		      }

		      // pinta la l�nea
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

