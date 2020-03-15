package tema6BIS;

public class Ej8Libro {

	  public static void main(String[] args) {
		  
		    int[][] n = new int[6][6];
		    int capa;
		    int i;
		    int j;
		    int aux1;
		    int aux2;


		    // genera el array y lo muestra /////////////////////////
		    
		    System.out.println("Array original");
		    System.out.println("--------------");

		    for(i = 0; i < 6; i++) {
		      for(j = 0; j < 6; j++) {
		        n[i][j] = (int)(Math.random()*101);
		        System.out.printf("%5d", n[i][j]);
		        }
		      System.out.println();
		    }


		    // rotación /////////////////////////////////////////////

		    for(capa = 0; capa < 3; capa++) {
		      
		      // rota por arriba
		      aux1 = n[capa][5 - capa];
		      for (i = 5 - capa; i > capa; i--) {
		        n[capa][i] = n[capa][i - 1];
		      }
		        
		      // rota por la derecha
		      aux2 = n[5 - capa][5 - capa];
		      for (i = 5 - capa; i > capa + 1; i--) {
		        n[i][5 - capa] = n[i - 1][5 - capa];
		      }
		      n[capa + 1][5 - capa] = aux1;
		      
		      // rota por abajo
		      aux1 = n[5 - capa][capa];
		      for (i = capa; i < 5 - capa - 1; i++) {
		        n[5 - capa][i] = n[5 - capa][i + 1];
		      }
		      n[5 - capa][5 - capa - 1] = aux2;
		        
		      // rota por la izquierda
		      for (i = capa; i < 5 - capa - 1; i++) {
		        n[i][capa] = n[i + 1][capa];
		      }
		      n[5 - capa - 1][capa] = aux1;

		    } // for capa


		    // muestra el array resultante ///////////////////////////
		    
		    System.out.println("\n\nArray rotado en el sentido de las agujas del reloj");
		    System.out.println("--------------------------------------------------");

		    for(i = 0; i < 6; i++) {
		      for(j = 0; j < 6; j++) {
		        System.out.printf("%5d", n[i][j]);
		      }
		      System.out.println();
		    }
		    
		  }
		
}
