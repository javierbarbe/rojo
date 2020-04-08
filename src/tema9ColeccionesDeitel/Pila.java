package tema9ColeccionesDeitel;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		System.out.println(args[0]);
		Stack <Number> pila = new Stack<>();
		
		pila.add(434);
		System.out.println(pila);
		pila.add(22.2);
		System.out.println(pila);
		pila.push(333);
		System.out.println(pila);
		//pila.pop();
		//System.out.println(pila);
		try{
			while(true) {
		
			Number objetoEliminado=pila.pop();
			System.out.println("se ha sacado "+ objetoEliminado);
			System.out.println(pila);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
