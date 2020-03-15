package tema6;
import java.util.*;
public class Ejercicio6Temperatura {

	Scanner e =new Scanner(System.in);
	String [] meses = {"Enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre",
			"octubre","noviembre","diciembre"};
	int [] temperatura= new int[12];
	
	public void rellenaMeses() {
		for(int i=0;i<meses.length;i++) {
			temperatura[i]=(int)(Math.random()*12);
		}
	}
	
	public void imprimeTemp() {
		for (int i=0;i<meses.length;i++) {
			System.out.printf("%12s" ,meses[i]);
			for (int j=0;j<temperatura[i];j++) {
				//int inicio=temperatura[i];
				char cu='*';
				System.out.printf("%4s",cu);
				if (j==temperatura[i]-1) {
					System.out.print(temperatura[i]); 
				} 
			}
			System.out.println();
		
		}
	}
	
}
