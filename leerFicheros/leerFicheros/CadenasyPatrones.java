package leerFicheros;

import java.util.regex.Pattern;

public class CadenasyPatrones {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		String presentacion= "HOla mi nombre es Javier Ba9999rbero y vengo de china";
//		Pattern pa= Pattern.compile("[0-9]");
		presentacion=(presentacion.replaceAll("(Javier)", "Iasien"));
		presentacion=presentacion.replaceAll("e", "E");
		presentacion=presentacion.replaceAll("[0-9]","" );
		System.out.println(presentacion);
		char [] letras=new char [10];
		presentacion.getChars(2, 6+1, letras, 4);
		for (char c: letras) {
			System.out.println(c);
		}
System.out.println(letras);
	}

}
