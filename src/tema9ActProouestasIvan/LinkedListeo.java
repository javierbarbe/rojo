package tema9ActProouestasIvan;

import java.util.ArrayList;

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