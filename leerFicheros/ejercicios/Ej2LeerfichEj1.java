package ejercicios;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Ej2LeerfichEj1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		try {
//			BufferedReader br = new BufferedReader(new FileReader("leerFicheros/primos.txt"));
			BufferedReader br = new BufferedReader (new FileReader("leerFicheros/primos.txt"));
			String linea="";
			while(linea!=null) {
				System.out.print(linea+" ");
				linea=br.readLine();
			}
			br.close();
		
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("No se puede encontrar tu puto archivo dislexico!!");
		}
	}

}
