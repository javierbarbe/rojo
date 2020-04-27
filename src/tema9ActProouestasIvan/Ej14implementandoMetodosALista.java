package tema9ActProouestasIvan;

import java.util.ArrayList;


public class Ej14implementandoMetodosALista {
	/*
	 * Escribe las clases necesarias para implementar una lista enlazada simple (será programada 
	 * íntegramente por el alumno, sin usar librerías específicas de listas de Java). 
	 * Los métodos serán: insertarPrincipio(), insertarFinal(), buscar(), mostrarLista(), eliminarNodo().
	 */

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListeo jo = new LinkedListeo();
		jo.insertarPrincipio("hola");
		Persona niño = new Persona("mario", "valverde",2002);
		jo.insertarPrincipio(new Persona ("Javi", "barbero", 1332));
		jo.insertaFinal(niño);
		
		for(int i= 0; i<jo.listaCambia.size();i++) {
			System.out.println(jo.listaCambia.get(i));
		}
		jo.buscar("hola");
		jo.buscar(new Persona ("Javi", "barbero", 1332));
		jo.eliminarNodo(2);
		jo.mostrarLista();
	}

	

	
	
	
}
class LinkedListeo <T> {
	//T atri;
	ArrayList<T> listaCambia= new ArrayList<>();
	public void insertarPrincipio(T atri) {
		listaCambia.add(0,atri);
	}
	
	public void insertaFinal(T atri) {
		listaCambia.add(atri);
	}
	
	public void buscar(T objeto) {
		if(listaCambia.contains(objeto)) {
			System.out.println("el objeto existe");
		}else {
			System.out.println("no se encuentra");
		}
	}
	public void mostrarLista() {
		listaCambia.forEach((o)-> System.out.println(o));
	}
	
	public void eliminarNodo(int posicion) {
		if(posicion>=listaCambia.size()) {
			System.out.println("te has pasado de tamaño de lista, no hay elementos en esa posicion");
		}else {
		listaCambia.remove(posicion);
		}
	}
	
}
