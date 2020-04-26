package tema9ActProouestasIvan;

import java.util.ArrayList;

public class Ej3 {
	/*
	 * Supongamos que tenemos una clase Estante destinada a almacenar o bien libros, o bien discos. Dichos
	elementos los cargaremos en un ArrayList de elementos, siendo necesario definir un tamaño máximo de
	elementos. Además sobre la clase Estante incorporaremos un método para añadir elementos que controlará no
	sobrepasar el número máximo que soporta. Además implementará la interfaz Iterable devolviendo un iterador
	de la lista de elementos.
	Crearemos una clase Libro con atributos titulo, autor y número de páginas, su constructor general y sus
	métodos getters y setters.
	Crearemos una clase Disco con atributos titulo, autor y número de canciones, su constructor general y sus
	métodos getters y setters.
	Crearemos una clase de prueba que cargará en un objeto Estante de 10 elementos una serie de objetos Libro y
	objetos Disco. Recorreremos a continuación los elementos de dicho estante con un for-each, mostrando el
	número de páginas para los libros, y el número de canciones para las canciones.
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



