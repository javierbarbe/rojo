package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ej4LeerYOrdenarAlfabeticamente {
	/*
	 *  4. Realiza un programa que sea capaz de ordenar alfab�ticamente las palabras 
	 *  * contenidas en un fichero de texto. El nombre del fichero que contiene las * 
	 *  palabras se debe pasar como argumento en la l�nea de comandos. El nombre * del 
	 *  fichero resultado debe ser el mismo que el original a�adiendo la *
	 *   coletilla <code>sort</code>, por ejemplo <code>palabras_sort.txt</code>. 
	 *   * Suponemos que cada palabra ocupa una l�nea
	 */

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		try {
			BufferedReader br =  new BufferedReader(new FileReader("leerFicheros/ICMP.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("leerFicheros/ICMPword.docx"));
			ArrayList <String> retahila= new ArrayList<String>();
			String linea="";
					while(linea!=null) {
						
						retahila.add(linea);
						linea=br.readLine();
					}
					//retahila.remove(0);
					
			
			
			
			//Collections.sort(retahila);
			for (String o : retahila) {
				System.out.println(o);
				bw.write(o+"\n");
			}
			
			System.out.println(retahila);
			br.close();
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado autom�ticamente
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		
		

	}

}
