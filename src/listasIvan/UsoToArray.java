package listasIvan;

import java.util.Arrays;
import java.util.LinkedList;

public class UsoToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String []colores = {"rojo","azul","amarillo"};
		LinkedList<String> enlaces= new LinkedList<>(Arrays.asList(colores));
		System.out.println(enlaces);
		enlaces.add(2,"vermellon");
		enlaces.addLast("colorado");
		
		colores=enlaces.toArray(new String [0]); //tambien funciona sin indicar tamaño, lo coge 
		// él por defecto , la otra opcion seria (new String[enlaces.size()]);
		colores[0]="negro";
		System.out.println("COOLLORES");
		for (String o : colores) {
			System.out.println(o);
		} System.out.println(enlaces);
	}

}
