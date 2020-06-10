package serializacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreandoArchivosYCarpetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta = new File ("archivoPruebaCreado.docs");
		//para directorio
		//ruta.mkdir();
		// para archivo-------------------------------------------
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo es = new Escribiendo();
		es.escribir("archivoPruebaCreado.docs");
	}

}
class Escribiendo {
	public void escribir (String archivo_destino) {
		String frase= "Prueba, espero que funcione";
		try {
			FileWriter escritura = new FileWriter(archivo_destino);
			for (int i= 0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}