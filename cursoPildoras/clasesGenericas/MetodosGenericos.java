package clasesGenericas;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nombres = {"juana", "su hermana", "pepa"};
		System.out.println(MetodosGenericos.getMenor(nombres));
		
		GregorianCalendar calendario [] = {
				new GregorianCalendar(2022,04,2015),
				new GregorianCalendar(2222,04,2014),
			//	new GregorianCalendar(1992,9,14),
				new GregorianCalendar(1992,11,31)
				
				
		};
		System.out.println(MetodosGenericos.getMenor(calendario).getTime());
		
	}
	public static <T extends Comparable> T getMenor( T [] a){
		T menor= a[0];
		for ( int i=0; i <a.length;i++) {
			/*
			 * para que el metodo pueda utilizar el metodo comparable, el parametro T generico
			 * debe heredar la interfaz comparable
			 * Esto ademas obliga a que , el tipo de la clase que le pasemos a este metodo generico
			 * debe de implementar la interfaz comparable No podria hacer una comparacion de una clase que
			 * no tuviera ese metodo ( como comparo peras ??? por color? por tamaño?? por fecha de recogida??
			 */
			if (menor.compareTo(a[i])>0) { 
				menor=a[i];
				System.out.println("el menor d momento es "+ i);
				
			}
		}
		return menor;
	}

}

