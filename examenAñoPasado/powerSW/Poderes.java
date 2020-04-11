package powerSW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Poderes implements Comparable<Poderes> {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poder == null) ? 0 : poder.hashCode());
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
		Poderes other = (Poderes) obj;
		if (poder == null) {
			if (other.poder != null)
				return false;
		} else if (!poder.equals(other.poder))
			return false;
		return true;
	}

	private String poder;
	static public HashMap<Poderes, Integer> mapaPoderes = new HashMap<>();
	private static Set<Poderes> arraypoderes = new TreeSet<>();
	private int cantidad = 0;

	public Poderes(String power) {
		this.poder = power;

	}

	public Poderes() {

	}

	public int getCantidad() {
		return cantidad;
	}

	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void aumentaCantidad() {
		int total = mapaPoderes.get(this);
		total++;
		mapaPoderes.put(this, total);

//		System.out.println(mapaPoderes.get(this));
//		mapaPoderes.put(this, cantidad++);

	}

	public String toString() {
		return poder;
	}

	public void cargarPoderes() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("examenAñoPasado/powerSW/poderes.txt"));
			String linea = "";
			while (linea != null) {
//				System.out.println(linea);
				linea = br.readLine();

				if (linea != null) {
					String pod = linea.toString();
					Poderes po = new Poderes(pod);
					getArraypoderes().add(po);
					mapaPoderes.put(po, 0);
				}
			}
//			System.out.println(mapaPoderes);
//			System.out.println(arraypoderes);
			// mapaPoderes.put(key, value)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public HashMap<Poderes, Integer> muestraPoderes() {
		return mapaPoderes;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poderes letal = new Poderes();
		letal.cargarPoderes();
		String poderEscrito = "";
		Poderes poderelegido;
		String poderExtra = "";
		HashMap<String, String> listajugadores = new HashMap<>();
		try {
			int numJugadores = Integer.valueOf(JOptionPane.showInputDialog("Cuantos jugadores sois?"));
			Jugador[] arrayJugadores = new Jugador[numJugadores];
			int cero = 0;
			while (cero < numJugadores) {
				String nombre = JOptionPane.showInputDialog("Nombre de jugador");

				do {
					poderEscrito = JOptionPane.showInputDialog("Elige tu poder");

					poderelegido = new Poderes(poderEscrito);


					listajugadores.put(nombre, poderelegido.poder);
				} while (!mapaPoderes.containsKey(poderelegido));
				arrayJugadores[cero] = new Jugador((nombre));//, poderelegido);
				arrayJugadores[cero].añadePoderes(poderelegido);
				String respuesta = JOptionPane.showInputDialog("Deseas añadir otro poder?");
				if (respuesta.equalsIgnoreCase("si")) {
					do {
						
						poderExtra = JOptionPane.showInputDialog("Nombre del poder");
						poderelegido= new Poderes (poderExtra);
					} while (!mapaPoderes.containsKey(poderelegido));
					//.toString());
					arrayJugadores[cero].añadePoderes(poderelegido);
//					arrayJugadores[cero]=new Jugador (nombre, arrayJugadores[cero].acumulados);
					System.out.println(arrayJugadores[cero].getPod());
				}
				cero++;
			}
			System.out.println(listajugadores);

			for (Jugador k : arrayJugadores) {
				System.out.println(k);
				
			}
			for (Jugador j : arrayJugadores) {
			System.out.println(j.getNombre()+":");
				for (Poderes p : j.acumulados) {
					System.out.println(p);
				}
			}
			
//		Jugador jesu = new Jugador("jesu", new Poderes("invisibilidad"));
//			Jugador papa = new Jugador("papa", new Poderes("invisibilidad"));
//			papa.añadePoderes(new Poderes("fuerza"));
//			System.out.println(papa);
//		Jugador javi = new Jugador("javier", new Poderes("arco"));
//		listajugadores.put(papa.getNombre(), for(Poderes a : papa.acumulados ) {papa.getPod().toString()});
			System.out.println(listajugadores);
			System.out.println(mapaPoderes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		System.out.println(letal.muestraPoderes());
	}

//	@Override
//	public int compare(Poderes o1, Poderes o2) {
//
//		return o1.poder.compareTo(o2.poder);
//	}

	@Override
	public int compareTo(Poderes o) {
		// TODO Auto-generated method stub
		return this.poder.compareTo(o.poder);
	}

	public static Set<Poderes> getArraypoderes() {
		return arraypoderes;
	}

	public static void setArraypoderes(Set<Poderes> arraypoderes) {
		Poderes.arraypoderes = arraypoderes;
	}

}
