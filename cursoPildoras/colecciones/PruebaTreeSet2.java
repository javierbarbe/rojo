package colecciones;

import java.util.*;
import java.util.TreeSet;



public class PruebaTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juegos UNO =  new Juegos("Carcassone", 2008, 7);
		Juegos segundo = new Juegos ( "Heroquest", 1983, 4);
		Juegos tercer = new Juegos ("Zombicide",2012,6);
		TreeSet<Juegos> trastero = new TreeSet<Juegos>();
		//ArrayList<Juegos> trastero = new ArrayList<Juegos>();
		trastero.add(tercer);
		trastero.add(UNO);
		
		trastero.add(segundo);
		System.out.println("------------------ORDENADOS ALFABETICAMENTE---------------------");
		for (Juegos j : trastero) {
			System.out.println(j);
		}
		System.out.println("-------------ORDENADOS POR NUMERO JUGADORES ASCENDENTE-------------------------");
		Juegos comparador = new Juegos();
		TreeSet<Juegos > trastero2= new TreeSet<Juegos>(comparador);
		trastero2.add(UNO);
		trastero2.add(segundo);
		trastero2.add(tercer);
		for ( Juegos t : trastero2) {
			System.out.println(t);
		}
		
		///EN EL CASO DE QUE UNA CLASE QUE RECIBAS NO IMPLEMENTE COMPARABLE , LA SOLUCION PASA POR ESTO
		// aqui creamos un objeto que implementa la interfaz COMPARATOR, tenemos un comparador
		ComparadorJuegos compara_juegos= new ComparadorJuegos();
		//creamos un treeset QUE RECIBA POR PARAMETROS EL OBJETO A TENER EN CUENTA EN LA COMPARACION
		//COMPARA JUEGOS LO QUE HACE ES COMPARAR DOS JUEGOS EXACATMENTE SEGUN SU ANTIGUEDAD
		TreeSet<Juegos> trastero3 = new TreeSet<Juegos>(compara_juegos);
		trastero3.add(UNO);
		trastero3.add(segundo);
		trastero3.add(tercer);
		System.out.println("-------------ORDENADOS POR ANTIGÜEDAD---------------------");
		for (Juegos a : trastero3) {
			System.out.println(a);
		}
		
		///------------------------------------------------------------------------------
		
		// TAMBIEN PODRIA HACERSE CON UNA CLASE INTERNA ANONIMA
		TreeSet<Juegos> trastero4 = new TreeSet<Juegos>(new Comparator<Juegos>() {

			@Override
			public int compare(Juegos o1, Juegos o2) {
				// TODO Auto-generated method stub
				return o1.getAgno()-o2.getAgno();
			}
		});
		trastero4.add(UNO);
		trastero4.add(segundo);
		trastero4.add(tercer);
		System.out.println("-------ordenados con CLASE INTERNA ANONIMA-------------");
		for (Juegos a: trastero4) {
			System.out.println(a);
		}
	}

}
class Juegos implements Comparable<Juegos> , Comparator<Juegos>{
	private int agno,n_jugadores;
	private String nombre;
	public Juegos (String nombre, int agno, int n_jugadores) {
		this.nombre=nombre;
		this.agno=agno;
		this.n_jugadores=n_jugadores;
	}
	
	public Juegos() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return this.nombre;
	}

	@Override
	public int compareTo(Juegos o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre); //por nombre
		//return o.agno-this.agno; // por fecha, el mas joven primero
	}
	@Override
	public int compare(Juegos o1, Juegos o2) {
		// aqui puedo establecer otro criterio de ordenacion
		return o1.n_jugadores-o2.n_jugadores;
	}
	
	//getters y setters
	public int getAgno() {
		return agno;
	}
	public void setAgno(int agno) {
		this.agno = agno;
	}
	public int getN_jugadores() {
		return n_jugadores;
	}
	public void setN_jugadores(int n_jugadores) {
		this.n_jugadores = n_jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

	

// clase  comparador------------------------
class ComparadorJuegos implements Comparator<Juegos>{

	@Override
	public int compare(Juegos o1, Juegos o2) {
		// TODO Auto-generated method stub
		return o1.getAgno()-o2.getAgno();
	}
}
