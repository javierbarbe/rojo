package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Iterator;

public class Estante implements Iterable{
	// a�ado objetos DIsco y Libro2  para intentar acceder a sus metodos 
	 Disco d1 = new Disco();
	 Libro2 l1= new Libro2();
	private int tamanio;
	protected int getTamanio() {
		return tamanio;
	}

	protected void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	ArrayList < almacenables> estanteriaLista = new ArrayList<>();
	public Estante() {

	}

	public void aniadeElementosLi(Libro2 l) {
		if(estanteriaLista.size()<= getTamanio()) {
			if(!estanteriaLista.contains(l)) {
				estanteriaLista.add(l);
			}else {
				System.out.println("ese libro: "+ l.getTitulo()+" ya esta");
			}
		}else {
			System.out.println("sobrepasado el tama�o de la estanteria, no se puede a�adir mas libros");
		}
	}
	public void a�adeElementosDisco(Disco d) {
		if(estanteriaLista.size()<=getTamanio()) {
			if(!estanteriaLista.contains(d)) {
				estanteriaLista.add(d);
			}else {
				System.out.println("ese disco: "+d.getTitulo()+ " ya esta ");
			}
		}else {
			System.out.println("sobrepasado el tama�o de la estanteria, no se puede a�adir mas discos");
		}
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}



