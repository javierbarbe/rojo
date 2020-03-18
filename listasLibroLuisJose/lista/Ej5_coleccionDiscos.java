package lista;

import java.util.ArrayList;

import diccionarios.Disco;

public class Ej5_coleccionDiscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Disco> coleccion= new ArrayList <Disco>();
		coleccion.add(new Disco("Amores de Barra", "Heroes del Silencio", 1998));
		coleccion.add(new Disco ("JailHouse Rock", "Elvis Presley", 1962));
		System.out.println(coleccion);
	}

}
