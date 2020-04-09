package tema9ColeccionesDeitel;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Colecciones19_21OrdenarPriorityQueue {

	/*
	 * (Cambiar el orden de un objeto PriorityQueue) Los resultados de la figura
	 * 16.15 muestran que PriorityQueue ordena elementos Double en orden ascendente.
	 * Vuelva a escribir la figura 16.15, de manera que ordene los elementos Double
	 * en forma descendente (es decir, 9.8 debe ser el elemento de mayor prioridad,
	 * en vez de 3.2).
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cola con capacidad de 11
		PriorityQueue<Double> cola = new PriorityQueue<>();

		// inserta elementos en la cola
		cola.offer(3.2);
		cola.offer(9.8);
		cola.offer(5.4);

		System.out.print("Sondeando de cola: ");
		System.out.println(cola);
		// muestra los elementos en la cola
//		       while (cola.size() > 0)
//		        {
//		           System.out.printf("%.1f ", cola.peek()); // ve el elemento superior
//		         cola.poll(); // elimina el elemento superior
//		         System.out.println(cola);
//		
//		        	}
		PriorityQueue<Double> cola2 = new PriorityQueue<>(11, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				// TODO Auto-generated method stub
				int prim = o1.intValue();
				int seg = o2.intValue();
				return seg - prim;
			}

		});
		cola2.offer(2.1);
		cola2.offer(7.6);
		cola2.offer(4.3);
		cola2.offer(3.2);
		cola2.offer(9.8);
		cola2.offer(5.4);
		cola2.offer(19.3);
		while (cola2.size()>0) {
			System.out.print(cola2.peek()+" ");
			cola2.poll();
		}

		

	}
}
