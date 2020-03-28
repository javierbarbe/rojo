package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2copiado {
	public static void main(String[] args) {
		try { 	BufferedReader br = new BufferedReader (new FileReader("leerFbhbkhbkbicheros/primos.txt"));
//			BufferedReader br = new BufferedReader(new FileReader("leerFicheros/primos.txt"));
	String linea = ""; 
	while (linea != null) {
		System.out.print(linea + " "); 
		linea = br.readLine(); 
		} 
		System.out.println();
		br.close();
	} catch (IOException e) { 
		System.out.println("Error de lectura.");
		}
	}

}
