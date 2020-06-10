package serializacion;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File ("archivoPruebaCreado");
		System.out.println(ruta.exists());
		ruta.delete();
	}

}
