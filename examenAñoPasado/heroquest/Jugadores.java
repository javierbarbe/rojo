package heroquest;



import java.util.*;

import powerSW.Poderes;

public class Jugadores {
	private String nombre;
	private Poderes pod;
	Scanner s = new Scanner(System.in);
	Set <Poderes> acumulados = new TreeSet<Poderes>();
	public void añadePoderes(Poderes pod) {
		this.pod=pod;
		this.acumulados.add(pod);
//		System.out.println(pod.getCantidad());
		this.pod.aumentaCantidad();
//		System.out.println(pod.getCantidad());
	}
	public Jugadores (String nombre, Personaje raza, Set<Poderes> miset) {
		this.nombre=nombre;
		this.acumulados.addAll(miset);
	}
	
	public Jugadores (String nombre) {
		this.nombre=nombre;
	}
	public Jugadores(String nombre, Poderes pod) {
//		Poderes heman= new Poderes();
//		heman.cargarPoderes();
		this.nombre=nombre;
		while(!Poderes.mapaPoderes.containsKey(pod)) {
			System.out.println("ELige un poder de los que hay");
			System.out.println(Poderes.getArraypoderes());
			String podernuevo= s.next();
			pod= new Poderes(podernuevo);
		}
		if(Poderes.mapaPoderes.containsKey(pod)) {
//	System.out.println("este poder existe ");
	
	
		}
		this.pod=pod;
		this.pod.aumentaCantidad();
		this.añadePoderes(pod);
	}


protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


protected String getPod() {
	for (Poderes a : this.acumulados) {
		return (a.toString());
	}
		return "h";
	}


	protected void setPod(Poderes pod) {
		this.pod = pod;
	}

	public String toString () {
		return this.nombre+" "+ this.acumulados;
	}

public static void main (String args[]) {
	Poderes jo = new Poderes();
	jo.cargarPoderes();
	Jugadores jesu = new Jugadores("jesu", new Poderes("fuerza"));
	jesu.añadePoderes(new Poderes("paciencia"));
	jesu.añadePoderes(new Poderes("invisibilidad"));
	Jugadores javi = new Jugadores("javi", jesu.acumulados);
	
	System.out.println(javi);
}
}