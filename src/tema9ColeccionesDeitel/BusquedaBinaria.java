package tema9ColeccionesDeitel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tema9ColeccionesDeitel.Carta.Palo;
import tema9ColeccionesDeitel.Carta.Valor;

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		String [] colores = {"rojo","azul","verde", "amarillo","blanco","morado","rojo"};
		Carta [] baraja = {new Carta (Palo.bastos ,Valor.cuatro),new Carta (Palo.bastos ,Valor.cuatro)};
		List <Carta> barajo = new ArrayList<Carta>(Arrays.asList(baraja));
		List <String> lista= new ArrayList<String>(Arrays.asList(colores));
		System.out.println(barajo);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		BusquedaBinaria.busqueda(lista, "azuwl");
		busqueda(lista, "azuwle");
		Carta eleccion = new Carta (Palo.bastos, Valor.cuatro);
		int frecuencia = Collections.frequency(barajo, eleccion);
		if ( lista .contains("azul")) {
			System.out.println("Contiene el color azul");
		}else {
			System.out.println("no contiene azul");
		}
		if(barajo.contains(eleccion)) { //hay que hacer el compareTo ... XD
			System.out.println("contiene la eleccion");
		}else {
			System.out.println("No contiene nada ");
		}
		int frequenciarojo= Collections.frequency(lista, "rojo");
		System.out.println(frecuencia);
		System.out.println(frequenciarojo);

	}
public static void busqueda(List <String> lista, String clave) {
	int resultado=0; 
	resultado = Collections.binarySearch(lista, clave);
	if( resultado>= 0) {
		System.out.println("Se encontro en el indice "+ resultado);
		
	}else {
		System.out.println("No se encuentra en la lista" + resultado);
	}
}
}


