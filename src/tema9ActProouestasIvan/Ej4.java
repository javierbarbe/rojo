package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej4 {
	/*
	 * Rehacer el ejercicio anterior haciendo que la clase Estante utilice la clase genérica. 
	 * Las clases Libro y Disco,no cambiarán respecto al anterior ejercicio. Hacer una clase de prueba,
	 *  en la cual crearemos un estante específico de libros, y otro específico de discos. Comprobar 
	 *  cómo solo permitirán almacenar datos del tipodefinido y no del otro. Mostrar la información de 
	 *  los libros o los discos según sea el estante mediante un foreach que recorra cada estante.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estante2 <Disco> disquera=new Estante2(3);
		disquera.add(new Disco("La comunidad del anillo","Howard Shore", 16));
		disquera.add(new Disco("Requiem","Mozart", 12));
		disquera.add(new Disco("El rey leon BSO","Hans Zimmer", 9));
		Estante2 <Libro2> biblio = new Estante2(3);
		biblio.add(new Libro2("el quijote","cervantes",1300));
		biblio.add(new Libro2("la biblia","MATUSALEM como el ron",700));
		disquera.lista.stream().forEach((o)-> System.out.println(o.getAutor()+" autor\n"
				+ o.getNumCanciones2()+ " cantidad de canciones del disco: "+ o.getTitulo())); // no coge bien este metodo de clase
		
//		for(Disco o : disquera.lista) {
//			System.out.println(o.getNumCanciones2());
//		}
		biblio.lista.stream().forEach((o)-> System.out.println(o.getTitulo()+ " titulo \n"+ o.getNumPaginas() + " paginas\n"
				+ "autor "+ o.getAutor()));
	}
	

}
class Estante2 <T> implements Iterable{
	 ArrayList <T>lista=new ArrayList();
	protected ArrayList getLista() {
		return lista;
	}
	protected void setLista(ArrayList lista) {
		this.lista = lista;
	}
	private int tope;
	public Estante2(int tope) {
		super();
		this.tope=tope;
	}
	public void add(T o) {
		if(lista.size()<tope) {
			lista.add(o);
		}else {
			System.out.println("no caaben mas");
			//throw new RuntimeException("no se admiten mas elementos");
		}
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}