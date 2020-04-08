package colecciones;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetsinInterfazComparator {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Set<String > nombres = new TreeSet<>();
			nombres.add("Maria");
			nombres.add("Adrian");
//			Collections.sort(nombres); LO HACE AUTOMATICAMENTEEEEE !!! 
			System.out.println(nombres);

			Articulo2 a1 = new Articulo2( 0, "zapatillas");
			Articulo2 a2 = new Articulo2(6, "calcetines");
			Articulo2 a3 = new Articulo2(1, "balon");
			TreeSet<Articulo2> almacen = new TreeSet<>();
			almacen.add(a1);
			almacen.add(a2);
			almacen.add(a3);
			for(Articulo2 a : almacen) {
			System.out.println(a.getDescripcion());
			}
			
			//con instancia de clase creada
			ComparadorArticulos compara_art = new ComparadorArticulos();
			
			 //REQUERIDO PARA QUE A LA HORA DE CONSTRUIR EL TREESET CON EL 
			//NUEVO CRITERIO DE ORDENACION EXISTA UN OBJETO CON LA INTERFAZ COMPARATOR QUE USE DE MODELO
			
			//si lo hago con una clase interna habria que eliminar la instancia del objeto comparadorarticulos y poner new Comparator<Articulo>()
		/*	{
				public int compare( Articulo2 o1 , Articulo2 o2){
				
				String desc1= o1.getDescripcion();
				String desc2= o2.getDescripcion();
				return desc1.compareTo(desc2);
				}
			}*/
			TreeSet<Articulo2> ordenaAlfabetico = new TreeSet<>(new Comparator<Articulo2>() {

				@Override
				public int compare(Articulo2 o1, Articulo2 o2) {
					
					return o1.getDescripcion().compareTo(o2.getDescripcion());
				}
				
			});
			ordenaAlfabetico.add(a1);
			ordenaAlfabetico.add(a2);
			ordenaAlfabetico.add(a3);
			
			
			for (Articulo2 a : ordenaAlfabetico) {
				System.out.println(a.getDescripcion());
			}
		}

	}
	class Articulo2 implements Comparable<Articulo2>{ //HAY QUE METERLE UN GENERICO DE LA CLASE PARA QUE COMPARE OBJETOS DE LA CLASE
		//ATRIBUTOS  ESO O HACER EL CASTEO EN EL METODO COMPARETO Articulo2 otro = (Articulo2)o;
		private String desc;
		private int num;
		
	
		
		public Articulo2 (int num, String desc) {
			this.num=num;
			this.desc=desc;
		}
		
		public String getDescripcion(){
			return desc;
		}
		@Override
		public int compareTo(Articulo2 o) {
			// TODO Auto-generated method stub
//			if(num>o.num) {
//				return 1;
//			} else if(num==o.num) {
//				return 0;
//			} else {
//				return -1;
//			}
			return num- o.num; //ORDENA EN FUNCION DEL NUMERO DE Articulo2 AQUI NO TIENE PINTA DE SER 1, -1, Ó 0
		}
		
	}
	class ComparadorArticulos implements Comparator<Articulo2>{

		@Override
		public int compare(Articulo2 o1, Articulo2 o2) {
			
			return o1.getDescripcion().compareTo(o2.getDescripcion());
		}
		
	}
