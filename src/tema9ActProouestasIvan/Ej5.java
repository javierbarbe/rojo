package tema9ActProouestasIvan;

import java.util.ArrayList;
import java.util.Collection;

public class Ej5 {
/*
 * Crear una colección de objetos Alumno, que a su vez estarán descritos por un nombre y una nota entera entre
0 y 10,y un constructor general y sus métodos getters y setters.
La colección se llamará listaAlumnos y será de tipo Alumno, utilizándose como constructor la clase
ArrayList derivada de la clase Collection. Incorporemos una serie de alumnos. Mostraremos el contenido de
la colección en forma de pares (nombre, nota). A continuación eliminaremos algún elemento, y tras esto,
volveremos a mostrar el contenido para comprobar que efectivamente se elimina el objeto u objetos Alumno.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> listAlumnos = new ArrayList<>();
		listAlumnos.add(new Alumno("javier", 7));
		listAlumnos.add(new Alumno("alex", 8));
		listAlumnos.add(new Alumno("ivan", 9));
		
		listAlumnos.stream().forEach((o)-> System.out.println(o.getNombre()+ " "+ o.getNota()));
		
		listAlumnos.remove(listAlumnos.get(listAlumnos.size()-1));
		System.out.println("tras eliminar");
		listAlumnos.stream().forEach((o)-> System.out.println(o.getNombre()+ " "+ o.getNota()));

	}

}
