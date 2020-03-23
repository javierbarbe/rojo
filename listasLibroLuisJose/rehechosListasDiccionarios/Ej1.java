package rehechosListasDiccionarios;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Moyano 1");
		nombres.add("Corchero 2");
		nombres.add("Tapetado");
		nombres.add("Alberto");
		nombres.add("Robert");
		nombres.add("Javi");
		nombres.add("e36");
		for (String n : nombres) {
			System.out.println(n);
		}
		for (int num = 0; num < nombres.size(); num++) {
//			for (String n : nombres) {
				nombres.removeIf(apellido -> apellido.equalsIgnoreCase("Javi"));
					
				Pattern vocales = Pattern.compile("[0-9]");
//				Matcher m = vocales.matcher(String.valueOf(nombres.get(num).charAt(num)));
//		nombres.removeIf(nomb -> nomb.contains(String.valueOf(nombres.get(num).charAt(num)))); 
				nombres.removeIf(nombre-> nombre.contains("[0-9]"));
				nombres.removeIf(ape-> ape.equals("Tapetado"));
//				nombres.removeIf(nomb -> nomb.contains(String.valueOf(n.charAt(num))));// si quiero eliminar por
				
				// patrones... como?
//			}
		/*
				 * } de momento lo unico que he conseguido es que me compare un caracter con
				 * cualquiera de los que tiene la variable nomb, y si coincide se lo cepilla...
				 * pero si por ejemplo quisiera que fuera cualquier vocal... estilo patron...
				 * ???
				 */
//		nombres.removeIf(nomb -> nomb.contains("[aeiou]"));
			System.out.println(nombres);
			
			
			String [] po= new String [4];
			po[0]="Jose 1";
			po[2]="juan";
			po[1]="serco 2";
			po[3]= "noe";
			for (int i= 0; i< po.length; i++) {
			Pattern numeros = Pattern.compile(".* [0-9]");
			Matcher m  = numeros.matcher(po[i]);
			 if (m.matches()) {
				 System.out.println(po[i]);
			 }
			}
			
		}
	}
}
