package examen2trim;

import java.util.*;

public class Matrices {
// ATRIBUTOS
	static double[][] mat;

//METODOS
	public Matrices() {

	}

	public static double[][] setMatrix(int n) {
		mat = new double[n][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = (int) (Math.random() * 100);
			}
		}
		return mat;
	}

	public void getMatrix(double[][] recibido) {
		for (int i = 0; i < recibido.length; i++) {
			for (int j = 0; j < recibido[i].length; j++) {
				System.out.print(recibido[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static double getMediaSec(double[][] recibido) {
		double mediaSec = 0;
		double[] sumandos = new double[recibido.length];
		int sumadiago = recibido.length - 1;
		for (int i = 0; i < recibido.length; i++) {
			for (int j = 0; j < recibido[i].length; j++) {
				if (j + i == sumadiago) {
					mediaSec += recibido[i][j];
					sumandos[i] = recibido[i][j];
				}
			}
		}
		System.out.println("Calculo media secundaria es: ");
		for (int i = 0; i < sumandos.length; i++) {
			System.out.print(sumandos[i] + "  ");
		}
		System.out.print("La media es: ");
		return mediaSec / recibido.length;
	}

///////////////////////////////// METODO MAIN ///////////////
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		Matrices eh = new Matrices();
		System.out.println("Introduzca dimensiones matriz n*n");
		int indice = e.nextInt();
		while (indice < 3) {
			System.out.println("introduce indice mayor o igual a 3");
			indice = e.nextInt();
		}
		double[][] hecha = (Matrices.setMatrix(indice));
		eh.getMatrix(hecha);
		System.out.println(Matrices.getMediaSec(hecha));

	}

}
