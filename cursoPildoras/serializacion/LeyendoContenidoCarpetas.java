package serializacion;

import java.io.File;

public class LeyendoContenidoCarpetas {

	public static void main(String[] args) {
		// SI QUIERES ASEGURAR COMPATIBILIDAD, EN VEZ DE USAR BARRAS INVERTIDAS, USA File.Separator
		//eso permite que dependidendo del sistema operativo, use unas barras u otras
		File archivo= new File("imagenes"+ File.separator +".."+ File.separator+"cursoPildoras");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		String [] contenido=archivo.list();
		for ( String e : contenido) {
	// para ver si hay subcarpeta neesario el constructor que requiere la carpeta padre, y la que vamos a mirar
		File f = new File (archivo.getAbsolutePath(), e);
		
		
		if(f.isDirectory()) {
			System.out.println();
			System.out.println("CONTENIDO DE LA CARPETA "+ e.toUpperCase()+" -------------------------------------");
			System.out.println();
			String [] contenido2= f.list();
			for (String g : contenido2) {
				System.out.println(g);
			}
			System.out.println();
			System.out.println("FIN DEL CONTENIDO DE LA CARPETA "+ e.toUpperCase()+ " ----------------------------------");
		}
		
		}
	}

}
