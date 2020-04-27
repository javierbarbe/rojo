package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaAlumno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno2> lista = new ArrayList<>();
		lista.add(new Alumno2("javier", 7, 69));
		lista.add(new Alumno2("sergio",6,33));
		lista.add(new Alumno2("adrian", 3, 66));
		
		
		Collections.sort(lista);
		for ( Alumno2 al : lista) {
			System.out.println(al.getNombre()+" "+ al.getNota()+" "+al.getId());
			
		}

	}

}
