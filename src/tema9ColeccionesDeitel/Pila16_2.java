package tema9ColeccionesDeitel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.swing.JOptionPane;

/*
 * Eliminación de duplicados) Escriba un programa que lea una serie de nombres de pila y
 *  elimine duplicados almacenándolos en un objeto Set. Permita al usuario buscar un nombre de pila.
 */
public class Pila16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int canti = 0;
		String nombre = "";
		ArrayList<String> nombres1 = new ArrayList<>();
		while (!nombre.equals("0")) {
			nombre = JOptionPane.showInputDialog("Introduce nombre\n" + "Introduce 0 para no introducir mas nombres");
			if(!nombre.equals("0")){
				nombres1.add(nombre);
			}
					
		}
		Set<String> mipila = new HashSet<>();
		mipila.addAll(nombres1);
		nombre="";
		String busqueda= JOptionPane.showInputDialog("Introduce el nombre a buscar\nIntroduce 0 para salir");
		if(mipila.contains(busqueda)) {
			System.out.println("El nombre "+ busqueda+ " esta en la lista");
		}else {
			System.out.println("El nombre buscado "+ busqueda+ " no existe");
		}
//		String cantidad = JOptionPane.showInputDialog("Cuantos elementos va a tener tu pila?");
//		try {
//			canti = Integer.valueOf(cantidad);
//
//			while (total < canti) {
//
//				String elemen = JOptionPane.showInputDialog("elemento " + total);
//				total++;
//
//				if (mipila.contains(elemen)) {
//					System.out.println("El elemento " + elemen + " ya estaba");
//					total--;
//				}
//				mipila.add(elemen);
//			}
//		} catch (Exception E) {
//			System.out.println(E.getMessage());
//		}

//		Set < Object> sinrep= Set<Object>mipila;
//		System.out.println(canti);
		System.out.println(mipila);
		System.out.println(nombres1);

	}

}
