package rehechosListasDiccionarios;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Collections;
public class Ej4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner s = new Scanner(System.in);
		String palabra="";
		ArrayList <String> palabras = new ArrayList< String>();
		Pattern p = Pattern.compile("[0-9]+");
		boolean contenidoerroneo=false;
		
		for (int i = 0; i< 10; i++) {
			do {
			System.out.println("Introduce una palabra para la posicion "+i);
			palabra=s.nextLine();
			palabras.add(palabra);
			contenidoerroneo=false;
			Matcher m= p.matcher(palabras.get(i));
			if (m.find()) {
				System.out.println("Palabra sin numeros por favar");
				palabras.remove(i);
				contenidoerroneo=true;
			}
//			palabras.add(palabra);
			
		}while (contenidoerroneo);
		}
		System.out.println(palabras);
		Collections.sort(palabras);
		System.out.println(palabras);
	}

}
