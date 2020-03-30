
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

	public static void main(String[] args) {
		
		try {
			ArrayList <String> retahila= new ArrayList<String>();
			String linea="";
					while(linea!=null) {
						
						retahila.add(linea);
						linea=br.readLine();
					}
					retahila.remove(0);
					
			
			
			
			Collections.sort(retahila);
			for (String o : retahila) {
				System.out.println(o);
				bw.write(o+"\n");
			}
			
			System.out.println(retahila);
			br.close();
			bw.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
