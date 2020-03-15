package tema6BIS;

public class Ej4 {
	int[][] arr = new int[5][6];
	int sumafila = 0, sumacolumna = 0;

	public Ej4() {

	}

	public int[][] rellenaYcalculaSumaFila() throws InterruptedException {

		for (int fila = 0; fila < arr.length; fila++) {
			sumafila = 0;
			if (fila < arr.length - 1) {
				for (int columna = 0; columna < arr[fila].length; columna++) {

					arr[fila][columna] = (int) (Math.random() * 800) + 100;
					if (columna < arr[fila].length - 1) {
						sumafila += arr[fila][columna];
					} else {
						Thread.sleep(800);
						arr[fila][columna] = sumafila;
					}
					System.out.printf("%6d", arr[fila][columna]);
				}
				System.out.println();
			}
		}
		return arr;
	}

	public int[][] imprimeYcalculaSumaColumnas() throws InterruptedException {
		for (int columnas = 0; columnas < arr[0].length; columnas++) {
			sumacolumna = 0;
			for (int filas = 0; filas < arr.length; filas++) {
				sumacolumna += arr[filas][columnas];
				if (columnas < arr[filas].length - 1) {
					if (filas == arr.length - 1) {
						arr[filas][columnas] = sumacolumna;
						System.out.printf("%6d", arr[filas][columnas]);
					}
				} else if (columnas == arr[filas].length - 1 && filas == arr.length - 1) {
					Thread.sleep(800);
					arr[filas][columnas] = sumacolumna * 2;
					System.out.printf("%6d", arr[filas][columnas]);
				}
			}
		}

		return arr;
	}
}
