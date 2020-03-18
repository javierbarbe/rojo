package lista;

import java.util.ArrayList;
import java.util.Collections;

public class Ej4_OrdenaPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> palabras= new ArrayList<String>();
		palabras.add("casa");
		palabras.add("cuarentena");
		palabras.add("online");
		palabras.add("premium");
		palabras.add("austeridad");
		palabras.add("videoconferencia");
		palabras.add("skype");
		palabras.add("onanismo");
		System.out.println(palabras);
		Collections.sort(palabras);
		System.out.println(palabras);

	}

}
