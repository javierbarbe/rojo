package tema7arraysFunciones;

import tema7.*;

public class Concatena {
	double[] primer;
	double[] segundo;

	public Concatena() {

	}

	public double[] mezcla(double[] primer, double[] segundo) {
		double[] mezclado = new double[primer.length + segundo.length];
//
//		primer = inicializa(primer.length);
//		segundo = inicializa(segundo.length);
		this.primer = primer;
		this.segundo = segundo;
		int j = 0;
		int k = 0;
		for (int i = 0; i < mezclado.length; i++) {

			if (i % 2 == 0 && j < primer.length) { //SI ES PAR Y AUN NO SE HA ACABADO EL PRIMER ARRAY
				mezclado[i] = primer[j];
				j++;
			} else if (i % 2 == 1 && k >= segundo.length) { //SI ES IMPAR LA POSICION PERO EL 2 ARRAY SE HA ACABAO
				
				if (k == segundo.length) {
					k++;
					mezclado[i] = primer[k];
					j++;

				} else {
					k++;
					mezclado[i] = primer[j];
					j++;

				}
			} else if (i % 2 == 1 && k < segundo.length) { //SI ES IMPAR POSICION DEL mezcla ARRAY
				mezclado[i] = segundo[k];
				k++;

			} else if (i % 2 == 0 && j >= primer.length) { //SI ES PAR POSICION PERO PRIMER ARRAY ACABADO
				if (j == primer.length) {
					
					mezclado[i] = segundo[j];
					k++;
					j++;

				} else {
					j++;
					mezclado[i] = segundo[k];
					k++;
				}
			}

		}
		return mezclado;
	}

	public double[] inicializa(int tamanio) {
		double[] inicializado = new double[tamanio];
		for (int i = 0; i < inicializado.length; i++) {
			inicializado[i] = (int) (Math.random() * 55);
		}
		return inicializado;
	}

	public void imprimeDoubleArr(double[] recibido) {
		for (int i = 0; i < recibido.length; i++) {
			System.out.print(" " + recibido[i]);
		}

	}
}
