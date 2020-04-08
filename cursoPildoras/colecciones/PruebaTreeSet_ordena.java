package colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaTreeSet_ordena {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String > nombres = new TreeSet<>();
		nombres.add("Maria");
		nombres.add("Adrian");
//		Collections.sort(nombres); LO HACE AUTOMATICAMENTEEEEE !!! 
		System.out.println(nombres);

		Articulo a1 = new Articulo( 0, "zapatillas");
		Articulo a2 = new Articulo(6, "calcetines");
		Articulo a3 = new Articulo(1, "balon");
		TreeSet<Articulo> almacen = new TreeSet<>();
		almacen.add(a1);
		almacen.add(a2);
		almacen.add(a3);
		for(Articulo a : almacen) {
		System.out.println(a.getDescripcion());
		}
		
		Articulo comparadorArticulos= new Articulo(); //REQUERIDO PARA QUE A LA HORA DE CONSTRUIR EL TREESET CON EL 
		//NUEVO CRITERIO DE ORDENACION EXISTA UN OBJETO CON LA INTERFAZ COMPARATOR QUE USE DE MODELO
		TreeSet<Articulo> ordenaAlfabetico = new TreeSet<>(comparadorArticulos);
		ordenaAlfabetico.add(a1);
		ordenaAlfabetico.add(a2);
		ordenaAlfabetico.add(a3);
		
		
		for (Articulo a : ordenaAlfabetico) {
			System.out.println(a.getDescripcion());
		}
	}

}
class Articulo implements Comparable<Articulo>, Comparator<Articulo>{ //HAY QUE METERLE UN GENERICO DE LA CLASE PARA QUE COMPARE OBJETOS DE LA CLASE
	//ATRIBUTOS  ESO O HACER EL CASTEO EN EL METODO COMPARETO Articulo otro = (Articulo)o;
	private String desc;
	private int num;
	
	public Articulo(){
		
	}
	
	public Articulo (int num, String desc) {
		this.num=num;
		this.desc=desc;
	}
	
	public String getDescripcion(){
		return desc;
	}
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
//		if(num>o.num) {
//			return 1;
//		} else if(num==o.num) {
//			return 0;
//		} else {
//			return -1;
//		}
		return num- o.num; //ORDENA EN FUNCION DEL NUMERO DE ARTICULO AQUI NO TIENE PINTA DE SER 1, -1, Ó 0
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		return o1.getDescripcion().compareTo(o2.getDescripcion());
		
	}
	
}
