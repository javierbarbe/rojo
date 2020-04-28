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
		miestante.setTamanio(3);
		System.out.println("añado los libros y los discos a la estanteria");
	//	miestante.estanteriaLista.add(new almacenables());
		miestante.aniadeElementosLi(new Libro2("las mil y una noches", "popular", 1001));
		miestante.aniadeElementosLi(new Libro2("las mil y dos noches", "popular", 1001));
		miestante.aniadeElementosLi(new Libro2("las mil y dos noches", "popular", 1001));
		miestante.añadeElementosDisco(new Disco("HELP!", "The Beatles", 9));
	;
		
		miestante.recorrerIterador();

		miestante.añadeElementosDisco(new Disco("aladdin","disney", 25));
		miestante.aniadeElementosLi(new Libro2("aladdin","disney", 250));
		//UTILIZANDO LAMBDAS PARA EL FOREACH
		//CON STREAM ME PERMITE FILTRAR PONER CONDICIONES
		miestante.estanteriaLista.stream().filter(s->s.getNumCanciones()==0).
		forEach((o)->System.out.println(o.getNumPag()+ " numero de paginas") );
		
		miestante.estanteriaLista.stream().filter(s-> s.getNumPag()==0).
		forEach((o)->System.out.println(o.getNumCanciones()+ " num de canciones"));
		miestante.recorrerIterador();
	}



}







