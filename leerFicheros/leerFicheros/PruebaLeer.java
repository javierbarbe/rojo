package leerFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLeer {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		try {
			BufferedReader pru= new BufferedReader(new FileReader("leerFicheros/Covid.txt"));
		//se mete desde la raiz del proyecto, la primera vez que se introduce en un fichero hijo,
		//no hay que ponerle / "")
			String linea="";
			while(linea!=null) {
				
				linea=pru.readLine();
				System.out.println(linea);
			}
			pru.close();
			
			
		}catch (FileNotFoundException e) {
			System.out.println("el archivo no se encuentra");
		}
		
		catch ( IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
			System.out.println("no se puede leer el archivo");
		}
	}

}
