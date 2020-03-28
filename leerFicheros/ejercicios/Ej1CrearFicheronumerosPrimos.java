package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej1CrearFicheronumerosPrimos {
	 ArrayList <Integer> primos= new ArrayList<Integer>();
	 public int longitud() {
		 return primos.size();
	 }
	 
	public   int [] calculaPrimos(){
		int contador=0;
		int cantidad=0;
		for (int i= 1; i <501; i++) {
			contador=0;
			for (int j= 1; j<=i; j++) {
				if(i%j==0) {
					contador++;
				}
				if (contador<3 && i==j) {
					primos.add(i);
					cantidad++;
				}
			}
		}
		Integer [] primosarray=primos.toArray(new Integer [0]);
		int [] finale= new int [longitud()];
		for( int i= 0; i< cantidad; i++) {
			finale[i]=primosarray[i];
//			System.out.println(finale[i]);
		}
		return finale;
	}

	public static void main(String[] args) {
		
		Ej1CrearFicheronumerosPrimos mi = new Ej1CrearFicheronumerosPrimos();
		int [] arrayfinal=mi.calculaPrimos();
	System.out.println(mi.longitud());

		// TODO Apéndice de método generado automáticamente
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter("leerFicheros/primos.txt"));
//			BufferedReader br = new BufferedReader (new FileReader());
			for ( int i = 0; i<mi.longitud();i++) {
			bw.write(String.valueOf(arrayfinal[i])+"\n");
			}
		
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
			System.out.println("No ha podido crearse el archivo");
		}
		
		//idea de LUIS JOSE 
		for ( int i= 1; i< 501; i++) {
			if(esPrimo(i)) {
				System.out.println(i);
			}
		}

	}// IDEA DE LUISJOSE SANCHEZ
	public static boolean  esPrimo( int x) {
		 for ( int i= 2; i<x; i++) {
			 if(x%i==0) {
				 return false;
			 }
		 }
		 return true;
	 }

}
