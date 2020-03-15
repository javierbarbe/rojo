package ejerciciosLibro200;
import java.util.Scanner;
public class NuevaPiramide {

	public NuevaPiramide() {}
	public  void creaPiramide() {
    Scanner e=new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida =e.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = e.nextLine();
    
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
	    

/*Scanner e=new Scanner(System.in);
	    	
	    	System.out.println("introduce altura");
	    	alturaDada=e.nextInt();
	    	System.out.println("introduce caracter para construirla");
	    	ladrillo=e.nextLine();
	  /*  while(altura<=alturaDada) {
	    	for(int i=1;i<=espacios;i++) {
	    		System.out.println(" ");
	    	}
	    	for (int i=1;i<=longitudLinea;i++) {
	    		
	    		System.out.println(ladrillo);
	    	}
	    	System.out.println(" ");
	    	altura++;
	    	espacios--;
	    	longitudLinea+=2;
	    }
	    	
	    }
	    
	    
	  
	
}*/
