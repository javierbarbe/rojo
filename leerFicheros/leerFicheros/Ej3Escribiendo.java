package leerFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ej3Escribiendo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("fruta.txt"));
		
		bf.append("\nnaranjero\n");
		bf.append("pomelanio\n");
		bf.append("parra");
		
		bf.close();
		
		
		
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
			System.out.println("No se ha podido encontrar el fichero");
		}
		
		
		
	}

}
