package lista;

import java.util.ArrayList;
import java.util.Collections;

public class Ej3_Ordenanumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeral= new ArrayList <Integer>();
		
		numeral.add(7);
		numeral.add(15);
		numeral.add(3);
		numeral.add(66);
		numeral.add(17);
		numeral.add(2324);
		numeral.add(54);
		System.out.println(numeral);
		Collections.sort(numeral);
		System.out.println(numeral);
		
	}

}
