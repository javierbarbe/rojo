package leerFicheros;
import java.io.File;
import java.util.Scanner;
public class Ej5 {
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		File f = new File(".");
		String []lista = f.list();
		for ( String l: lista) {
			System.out.println(l);
		}
	System.out.print("Introduzca el nombre del archivo que desea borrar: "); 
	String nombreFichero = s.next();
	File fichero = new File(nombreFichero);
	
	if (fichero.exists()) {
		fichero.delete(); 
		System.out.println("El fichero se ha borrado correctamente."); 
		} else { 
			System.out.println("El fichero " + nombreFichero + " no existe.");
			}
	}
	} 


