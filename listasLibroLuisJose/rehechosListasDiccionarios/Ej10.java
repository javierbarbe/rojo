package rehechosListasDiccionarios;
import java.util.HashMap;
import java.util.*;
public class Ej10 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner s = new Scanner(System.in);
		HashMap <String,String> midiccionario= new HashMap<String,String>();
		midiccionario.put("coche","car");
		midiccionario.put("llaves", "keys");
		midiccionario.put("castillo", "castle");
		midiccionario.put("clase", "class");
		midiccionario.put("mi casa de chocolate", "my chocolate's house");
		midiccionario.put("ordenador", "computer");
		midiccionario.put("cascos", "headphones");
		midiccionario.put("juego", "game");
		
		
		System.out.println( midiccionario.toString());
		System.out.println("Introduce una palabra en castellano que quieras consutar");
		String original=s.nextLine();
		if(midiccionario.containsKey(original)) {
			System.out.println("La traduccion de "+ original+ " es " +midiccionario.get(original));
		}else {
		
		System.out.println("Tu palabra no esta");
		}
	}

}
