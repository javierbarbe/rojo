package tema9ActProouestasIvan;

import java.util.LinkedList;

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
		jo.insertarPrincipio(new Persona ("Javi", "barbero", 1332));
		
		for(int i= 0; i<jo.listaCambia.size();i++) {
			System.out.println(jo.listaCambia.get(i));
		}
		
	}

	

	
	
	
}
class LinkedListeo <T> {
	T atri;
	LinkedList<T> listaCambia= new LinkedList<>();
	public void insertarPrincipio(T atri) {
		listaCambia.add(0,atri);
	}
	
	public void insertaFinal(T atri) {
		listaCambia.add(atri);
	}
	
}
