package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//		ArrayList < almacenables> estanteriaLista = new ArrayList<>();
//		estanteriaLista.add(new Libro("las mil y una noches", "popular", 1001));
//		estanteriaLista.add(new Disco("Bilo", "Cantante No se", 12));
		Estante miestante = new  Estante();
		miestante.setTamanio(2);
	//	miestante.estanteriaLista.add(new almacenables());
		miestante.aniadeElementosLi(new Libro2("las mil y una noches", "popular", 1001));
		miestante.aniadeElementosLi(new Libro2("las mil y dos noches", "popular", 1001));
		miestante.aniadeElementosLi(new Libro2("las mil y dos noches", "popular", 1001));
		miestante.añadeElementosDisco(new Disco("HELP", "The Beatles", 9));
		//miestante.estanteriaLista.
//		for(Object i: miestante) {
//			System.out.println(i);
//		}
	//	miestante.forEach((o)->System.out.println(o.toString()));
		//System.out.println(miestante.getTamanio());
		ListIterator<almacenables> iterador =miestante.estanteriaLista.listIterator();
		while(iterador.hasNext()) {
			
			Object iterado= iterador.next();
			String clase = iterado.getClass().toString();
			//System.out.println(clase);
			Pattern patlib = Pattern.compile("(Libro)");
			Matcher matlib= patlib.matcher(clase);
			Pattern patdisco= Pattern.compile(("(Disco)"));
			Matcher matdisco= patdisco.matcher(clase);
			
			// NO ME PERMITE AQUI EL UTILIZAR LOS METODOS PROPIOS DE LAS CLASES... SOLO ME DEJA USAR LOS
			// QUE TIENE LA CLASE PADRE 
			if(matlib.find()) {
				iterador.previous();
				//System.out.println("coincide con el patron");
				System.out.println(iterador.next().getNumPag()+" numero de paginas del libro");
			}
			if(matdisco.find()) {
				iterador.previous();
				System.out.println(iterador.next().getNumCanciones()+ " canciones del disco");
			}
		}
//		System.out.println("bucle for");
//		for ( int i =0; i<miestante.getTamanio()+1; i++) {
//			System.out.println(miestante.estanteriaLista.get(i).getTitulo());
//			System.out.println(miestante.estanteriaLista.get(i).getNumPag());
//			System.out.println(miestante.estanteriaLista.get(i).getNumCanciones());
//			System.out.println(miestante.estanteriaLista.get(i).getAutor());
//			
//		}
		miestante.añadeElementosDisco(new Disco("aladdir","disney", 250));
		miestante.aniadeElementosLi(new Libro2("aladdir","disney", 250));
		//UTILIZANDO LAMBDAS PARA EL FOREACH
		//CON STREAM ME PERMITE FILTRAR PONER CONDICIONES
		miestante.estanteriaLista.stream().filter(s->s.getNumCanciones()==0).
		forEach((o)->System.out.println(o.getNumPag()+ " numero de paginas") );
		
		miestante.estanteriaLista.stream().filter(s-> s.getNumPag()==0).
		forEach((o)->System.out.println(o.getNumCanciones()+ " num de canciones"));
		
	}



}

class almacenables{
	private String titulo,autor;
	private int numPag, numCanciones;
	protected int getNumPag() {
		return numPag;
	}
	protected void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	protected int getNumCanciones() {
		return numCanciones;
	}
	protected void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		almacenables other = (almacenables) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
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






