package lista;

import java.util.ArrayList;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> aleatorios= new ArrayList<Integer>();
		int tamanioLista=(int) (Math.random()*(21-10)+10);
		System.out.println(tamanioLista);
		for (int i=0; i<tamanioLista;i++) {
			aleatorios.add((int)(Math.random()*101));
		}
		
		System.out.println(aleatorios);

	}

}
