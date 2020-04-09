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
	static public  HashMap<Poderes,Integer> mapaPoderes = new HashMap<>();
	static Set <Poderes> arraypoderes= new TreeSet<>();
	private int cantidad=0;
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
	protected void aumentaCantidad() {
		int total =mapaPoderes.get(this);
		total++;
		mapaPoderes.put(this, total);
		
		System.out.println(mapaPoderes.get(this));
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
				System.out.println(linea);
				linea = br.readLine();
				
				if(linea!=null) {
					String pod = linea.toString();
					Poderes po = new Poderes(pod);
					arraypoderes.add(po);
					mapaPoderes.put(po,0);
				}
			}System.out.println(mapaPoderes);
			System.out.println(arraypoderes);
			// mapaPoderes.put(key, value)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		}	public HashMap<Poderes, Integer> muestraPoderes(){
			return mapaPoderes;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poderes letal = new Poderes();
		letal.cargarPoderes();
		Jugador jesu = new Jugador("jesu", new Poderes("invisibilidad"));
		Jugador papa = new Jugador("jesu", new Poderes("invisibilidad"));
		Jugador javi = new Jugador("javier", new Poderes("arco"));
		System.out.println(mapaPoderes);
		System.out.println(letal.muestraPoderes());
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

}
