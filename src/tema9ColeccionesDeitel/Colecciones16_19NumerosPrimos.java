package tema9ColeccionesDeitel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Colecciones16_19NumerosPrimos {
	/*
	 * (Números primos y factores primos) Escriba un programa que reciba una entrada
	 * tipo número entero de un usuario, y que determine si es primo. Si el número
	 * no es primo, muestre sus factores primos únicos. Recuerde que los factores de
	 * un número primo son sólo 1 y el mismo número primo. Todo número que no sea
	 * primo tiene una factorización prima única. Por ejemplo, considere el número
	 * 54. Los factores primos de 54 son 2, 3, 3 y 3. Cuando los valores se
	 * multiplican entre sí, el resultado es 54. Para el número 54, los factores
	 * primos a imprimir deben ser 2 y 3. Use objetos Set como parte de su solución.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> factores = new HashMap<>();
		//int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero a introucir"));
//		boolean primo=false;
		int contador = 0;
//		for (int i = 2; i < numero; i++) {
//			if (numero % i == 0) {
//				contador++;
//			}
//		}

		Primo jaja = new Primo(4);
		System.out.println(jaja.esPrimo());
		System.out.println(jaja.primoSiguiente());
		for (int i : jaja.primoSiguiente()) {
			System.out.println(i);
		}
	

//		if (contador < 2) {
//			System.out.println("ERES PRIMO");
//		} else {
//			while (numero > 0) {
//
//			}
//			System.out.println("no eres primo");
//		}
	}

}

class Primo {
	private int contador = 0;
	private int numero;
	private boolean esPrimo = false;
	private int[] Primos = new int[50];
	Set<Integer> lista = new HashSet<Integer>();

	public Primo(int numero) {
		this.numero = numero;
	}

	public boolean esPrimo() {
		for (int i = 2; i < this.numero; i++) {
			if (this.numero % i == 0) {
				contador++;
			}
		}
		if (contador < 1) {
			esPrimo = true;
			return esPrimo;
		}else {
			return esPrimo;
		}
	}

	public Set<Integer> primoSiguiente() {

		for (int i = 0; i < numero; i++) {
			Primo aux = new Primo(i);
			if (aux.esPrimo==true) {
				lista.add(i);
			}else {
				System.out.println(aux.numero+ " no es primo");
			}
		}
		if (Primos.length == 0) {
			System.out.println("El array de primos esta vacio");
		}
		return lista;
	}
}
