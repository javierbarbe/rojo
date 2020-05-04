package ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class IvanPrimos {



	    public static void main(String[] args) throws IOException {
	        
	        Escribiendo fichero = new Escribiendo();
	        
	        fichero.escribir();
	        
	    }    
	}    


	class Escribiendo {
	    
	    public void escribir() throws IOException {
	        
	        int i, j;
	        boolean esPrimo;
	        int rInicial = 1;
	        int rFinal = 500;

	        
	        for (i = rInicial; i <= rFinal; i++) {

	            esPrimo = true;
	            for (j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    
	                    esPrimo = false;
	                    
	                }
	            }
	            
	            if(esPrimo) {
	                System.out.println(i);
	                FileWriter escritura=new FileWriter("numerosprimos.txt",true);
	                
	                escritura.write(i+" ") ; 
	                escritura.close();
	                            
	                
	            }
	            
	            
	            }
	        }
	    }
	
	

