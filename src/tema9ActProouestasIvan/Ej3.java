package tema9ActProouestasIvan;

import java.util.ArrayList;

public class Ej3 {
	/*
	 * Supongamos que tenemos una clase Estante destinada a almacenar o bien libros, o bien discos. Dichos
	elementos los cargaremos en un ArrayList de elementos, siendo necesario definir un tama�o m�ximo de
	elementos. Adem�s sobre la clase Estante incorporaremos un m�todo para a�adir elementos que controlar� no
	sobrepasar el n�mero m�ximo que soporta. Adem�s implementar� la interfaz Iterable devolviendo un iterador
	de la lista de elementos.
	Crearemos una clase Libro con atributos titulo, autor y n�mero de p�ginas, su constructor general y sus
	m�todos getters y setters.
	Crearemos una clase Disco con atributos titulo, autor y n�mero de canciones, su constructor general y sus
	m�todos getters y setters.
	Crearemos una clase de prueba que cargar� en un objeto Estante de 10 elementos una serie de objetos Libro y
	objetos Disco. Recorreremos a continuaci�n los elementos de dicho estante con un for-each, mostrando el
	n�mero de p�ginas para los libros, y el n�mero de canciones para las canciones.
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList < almacenables> estanteriaLista = new ArrayList<>();
		estanteriaLista.add(new Libro());
		estanteriaLista.add(new Disco());
	}



}


class almacenables{
	private String titulo,autor;
	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
}
class Libro extends almacenables{
	
	private int numPaginas;
	public Libro() {
	}
	protected int getNumPaginas() {
		return numPaginas;
	}
	protected void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
}

class Disco extends almacenables{
	
	 private int numCanciones;
	 public Disco () {
		 
	 }

	protected int getNumCanciones() {
		return numCanciones;
	}
	protected void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
}



