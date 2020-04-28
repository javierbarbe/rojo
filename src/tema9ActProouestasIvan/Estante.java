package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Estante implements Iterable{
	// añado objetos DIsco y Libro2  para intentar acceder a sus metodos 
	 Disco d1 = new Disco();
	 Libro2 l1= new Libro2();
	private int tamanio;
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	ArrayList < Almacenables> estanteriaLista = new ArrayList<>();
	public Estante() {

	}
	public void recorrerIterador() {
		ListIterator<Almacenables> iterador =estanteriaLista.listIterator();
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
				System.out.println();
				System.out.println("LIBRO: >>>>>>>>>>>>>>>>>>>>>>");
				iterador.previous();
				//System.out.println("coincide con el patron");
				System.out.println("autor del libro: " +iterador.next().getAutor());
				iterador.previous();
				System.out.println("numero de paginas del libro: "+ iterador.next().getNumPag());
				iterador.previous();
				System.out.println("titulo: "+ iterador.next().getTitulo());
			}
			if(matdisco.find()) {
				System.out.println();
				System.out.println("DISCO: >>>>>>>>>>>>>>>>>>>>>>");
				iterador.previous();
				//System.out.println("coincide con el patron");
				System.out.println("autor del DISCO: " +iterador.next().getAutor());
				iterador.previous();
				System.out.println("numero de canciones: "+ iterador.next().getNumCanciones());
				iterador.previous();
				System.out.println("titulo: "+ iterador.next().getTitulo());
				//System.out.println(iterador.next().getNumCanciones()+ " canciones del disco");
			}
		}
	}
	

	public void aniadeElementosLi(Libro2 l) {
		
		if(estanteriaLista.size()<= getTamanio()) {
			if(estanteriaLista.contains(l)) {
				
				System.out.println("ese libro: "+ l.getTitulo()+" ya esta");
			}else {
				estanteriaLista.add(l);
			}
		}else {
			System.out.println("sobrepasado el tamaño de la estanteria, no se puede añadir mas libros");
		}
	}
	public void añadeElementosDisco(Disco d) {
		if(estanteriaLista.size()<=getTamanio()) {
			if(!estanteriaLista.contains(d)) {
				estanteriaLista.add(d);
			}else {
				System.out.println("ese disco: "+d.getTitulo()+ " ya esta ");
			}
		}else {
			System.out.println("sobrepasado el tamaño de la estanteria, no se puede añadir mas discos");
		}
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}



