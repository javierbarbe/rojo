package examen2trim;

import java.util.*;

public class Ej1 {
	private int[] array;
	int cantidad = 1;
	Scanner e = new Scanner(System.in);
	int numero;
	private int[] contador;

	public Ej1() {

	}

	public int[] iniciaArray(int longitud) {
		array = new int[longitud];
		return array;
	}

	public int[] rellenaArray(int[] recibido) {
		for (int i = 0; i < recibido.length; i++) {
			System.out.println("Introduce numero en el array");
			numero = e.nextInt();
			while( numero>100 || numero <0) {
				System.out.println("por favor numeros entre 1 y 100");
				numero=e.nextInt();
			}
			recibido[i] = numero;
			if (numero == 0) {
				i = recibido.length - 1;
			}
		}
		return recibido;
	}

	public void imprimeArray(int[] recibido) {
		for (int i = 0; i < recibido.length; i++) {
			System.out.print(recibido[i] + "  ");
		}
	}

	public void cuentaOcurrencias(int[] recibido) {
		contador = new int[recibido.length];
		for (int j = 0; j < recibido.length; j++) {
			cantidad = 1;
			for (int i = 0; i < recibido.length; i++) {
				if (i != j && recibido[i] == recibido[j]) {
					cantidad++;

				}

			}
			if (cantidad > 1 && recibido[j] != 0) {
				System.out.println("el numero " + recibido[j] + " sale " + cantidad + " veces");
			} else {
				if (recibido[j] != 0) {
					System.out.println("el numero " + recibido[j] + " sale " + cantidad + " vez");
				}
			}
		}
	}

	// METODO MAIN

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej1 ol = new Ej1();
		int[] hecho = ol.rellenaArray(ol.iniciaArray(5));
		ol.imprimeArray(hecho);
		System.out.println();
		ol.cuentaOcurrencias(hecho);

	}

}
