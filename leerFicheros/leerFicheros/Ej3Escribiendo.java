package leerFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Ej3Escribiendo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		try {
			OutputStream ous= new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {
					// TODO Auto-generated method stub
					
				}
			};
			BufferedWriter bf = new BufferedWriter(new FileWriter("fruta.txt"));
		
		bf.append("\nnaranjero\n");
		bf.append("pomelanio\n");
		bf.append("parra");
		bf.write("\nhola javier\n");
		bf.close();
		// AL A�ADIR EL CONSTRUCTOR FILEWRITER (ARCHIVO, BOOLEAN ) LO QUE HACE ES A�ADIR, NO SOBREESCRIBIR
		BufferedWriter bf2 = new BufferedWriter(new FileWriter("fruta.txt",true));
	//	bf2.write("\nhola javier\n");
		bf2.append("\nnaranjero\n");
		bf2.append("pomelanio\n");
		bf2.append("parra");
		bf2.close();
		
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
			System.out.println("No se ha podido encontrar el fichero");
		}
		
		
		
	}

}
