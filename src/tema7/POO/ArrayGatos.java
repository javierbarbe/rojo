package tema7.POO;
import java.util.*;
public class ArrayGatos {
////ORDENA ALFABETICAMENTEEEEEEEEEEEEEEE////

	public static void main(String[] args) {	
		Scanner e= new Scanner(System.in);
	
		Gato [] arrao= new Gato [2];
		for (int i=0; i<arrao.length;i++) {
			arrao[i]=new Gato();
			System.out.println("Nombre de la mascota");
			String nombre= e.next() ;
			System.out.println("Color de la mascota");
			String color=e.next();
			System.out.println("Sexo de la mascota");
			String sexo=e.next();
			arrao[i].setSexo(sexo);
			arrao[i].setNombre(nombre);
			arrao[i].setColor(color);
		}
		
		Arrays.sort(arrao); //ESTO ES LO QUE ORDENA 
		//EN LA CLASE GATO OBLIGATORIO IMPLMEMENTAR Comparable
		//ESO OBLIGA A SOBREESCRIBIR EL METODO public int CompareTo(Object o)
		//ademas eese metodo devuelve un entero, -1 en caso de ser menor , 1 en caso de ser mayor,
		//0 en caso de ser iguales
//		for (int i=0; i<arrao.length;i++) {
//			System.out.println("Gato "+(i+1));
//			System.out.println("Nombre " +arrao[i].getNombre());
//			System.out.println("Sexo "+arrao[i].getSexo());
//			System.out.println("Color "+arrao[i].getColor());
//		}
		for (Gato a: arrao) {
			System.out.println(a);
		}
//	arrao[0].setNombre("garfield");
//	arrao[0].setSexo("macho");
//	arrao[0].setColor("marron");
//		for (Gato a : arrao) {
//			a=new Gato();
//			System.out.println(a.getColor()+" "+a.getNombre()+" "+a.getSexo());
//		}
	}

	

}
