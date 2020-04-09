package powerSW;
import java.util.*;
public class Jugador {
	private String nombre;
	private Poderes pod;
	Scanner s = new Scanner(System.in);
	
	public Jugador(String nombre, Poderes pod) {
//		Poderes heman= new Poderes();
//		heman.cargarPoderes();
		this.nombre=nombre;
		while(!Poderes.mapaPoderes.containsKey(pod)) {
			System.out.println("ELige un poder de los que hay");
			System.out.println(Poderes.arraypoderes);
			String podernuevo= s.next();
			pod= new Poderes(podernuevo);
		}
		if(Poderes.mapaPoderes.containsKey(pod)) {
	System.out.println("este poder existe ");
	
	
		}
		this.pod=pod;
		this.pod.aumentaCantidad();
	}


protected Poderes getPod() {
		return pod;
	}


	protected void setPod(Poderes pod) {
		this.pod = pod;
	}


public static void main (String args[]) {
	Jugador javi = new Jugador("javi", new Poderes("calzoncillos"));
	Jugador jesu = new Jugador("jesu", new Poderes("fuerza"));
	
}
}