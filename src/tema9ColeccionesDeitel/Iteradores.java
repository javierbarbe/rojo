package tema9ColeccionesDeitel;

import java.util.LinkedList;
import java.util.ListIterator;

public class Iteradores {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String > simpsons = new LinkedList<String>();
		simpsons.add("marge");
		simpsons.add("Homer");
		simpsons.add("barney");
		ListIterator<String> iterador = simpsons.listIterator();
		while (iterador.hasNext()) {
			if(iterador.next().equals("barney")){
				iterador.remove();
			}
		}
for (String i  : simpsons) {
	System.out.println(i);
}
	}

}
