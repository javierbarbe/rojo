package tema9ActProouestasIvan;

import java.util.ArrayList;


public class Ej14implementandoMetodosALista {
	/*
	 * Escribe las clases necesarias para implementar una lista enlazada simple (ser� programada 
	 * �ntegramente por el alumno, sin usar librer�as espec�ficas de listas de Java). 
	 * Los m�todos ser�n: insertarPrincipio(), insertarFinal(), buscar(), mostrarLista(), eliminarNodo().
	 */

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListeo jo = new LinkedListeo();
		jo.insertarPrincipio("hola");
		Persona ni�o = new Persona("mario", "valverde",2002);
		jo.insertarPrincipio(new Persona ("Javi", "barbero", 1332));
		jo.insertaFinal(ni�o);
		
		for(int i= 0; i<jo.listaCambia.size();i++) {
			System.out.println(jo.listaCambia.get(i));
		}
		jo.buscar("hola");
		jo.buscar(new Persona ("Javi", "barbero", 1332));
		jo.eliminarNodo(2);
		jo.mostrarLista();
	}

	

	
	
	
}

