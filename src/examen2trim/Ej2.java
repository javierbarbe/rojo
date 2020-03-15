package examen2trim;

public class Ej2 {
	protected int[][] horarios = new int[7][7];

	public Ej2() {

	}

	public void rellenahoras() {
		for (int i = 0; i < horarios.length; i++) {
			for (int j = 0; j < horarios[i].length; j++) {
				horarios[i][j] = (int) (Math.random() * (10 - 1) + 1);
			}
		}
	}

	public void imprimeMatriz(int[][] horarios) {
		System.out.println("  Empleado Horas Semanales");
		System.out.println("==========================");
		for (int i = 0; i < horarios.length; i++) {
			for (int j = 0; j < horarios[i].length; j++) {
				System.out.printf("%8d", horarios[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] sumaFilas(int[][] recibido) {

		int[][] auxiliar = new int[7][2];
		for (int i = 0; i < recibido.length; i++) {
			int suma = 0;
			for (int j = 0; j < recibido[i].length; j++) {
				suma += recibido[i][j];
			}
			auxiliar[i][1] = suma;
			auxiliar[i][0] = i;
		}
		return auxiliar;
	}

}
