package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class ImprimeClavesValorFuncionalForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer	, String> mimaPa= new HashMap<>();
		mimaPa.put(6, "madrid");
		mimaPa.put(9, "javier");
		int [] claves = new int [mimaPa.size()]; int i = 0;
		ArrayList <Integer> listaClaves = new ArrayList<>();
		String clavesPalabra= "";
		
		// genero una lista y en añado en la propia lista cada valor de la clave
		mimaPa.forEach((k, v)-> listaClaves.add(k)) ;
		//mimaPa.forEach((k,v )-> );
		for (int k  : listaClaves) {
			System.out.println(k);
			clavesPalabra+=k;
		}
		if(mimaPa.containsKey(9)) {
			System.out.println("el 9 esta");
			System.out.println(clavesPalabra);
		}
	}

}
