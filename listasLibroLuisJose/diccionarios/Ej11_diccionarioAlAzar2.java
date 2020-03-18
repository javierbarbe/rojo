package diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej11_diccionarioAlAzar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="";
		Scanner e = new Scanner(System.in);
		HashMap <String,String> larousse = new HashMap<String,String>();
 		larousse.put("juego","boardgame");
 		larousse.put("mamada", "blowjob");
 		larousse.put("fiebre", "fever");
 		larousse.put("frontera", "boundary");
 		larousse.put("papel_higienico","toilet_paper");
 		larousse.put("prohibir","forbid");
 		boolean distintos=false;
 		int aleatorio ;
 		
 		int [] numeros= new int [5];
 		int [] copiado= new int [numeros.length];
 		for(int i= 0; i< numeros.length;i++) {
 			aleatorio= (int) (Math.random()*6); 
 			numeros[i]=aleatorio;
 		}
// 		System.arraycopy(numeros, 0, copiado, 0, numeros.length);
	for (int i = 0; i< numeros.length; i++) {
		for(int j = 0; j < numeros.length; j++) {
			if (  numeros[i]== numeros[j] && i !=j){
				System.out.println(numeros[i]+" y "+ numeros[j]+" son iguales");
				numeros[i]=(int) (Math.random()*6);
				j=0;
				i=0;
		
				
			
				
					
				
			}
		}
	}
	}

}
