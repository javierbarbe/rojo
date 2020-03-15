package tema6BIS;

public class Ej6 {
	private int[][] arr = new int[3][7];
	int filaminimo, filamaximo, columnaminimo, columnamaximo;

	public Ej6() {

	}

	public int[][] iniciaYmuestraMayorMenor() {
		int max = arr[0][0];
		boolean repetido;
		int min = 1000;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				do {
					arr[i][j] = ((int) (Math.random() * 21) + 1);
					repetido = false;
					for (int k = 0; k < arr.length; k++) {
						for (int q = 0; q < arr[k].length; q++) {
							if(i!=k || q!=j) {
								if (arr[i][j] == arr[k][q] ) {
									repetido = true;
								}
							}
						}
					}
				} while (repetido == true);
				
				if (max < arr[i][j]) {
					max = arr[i][j];
					filamaximo = i;
					columnamaximo = j;
				}
				if (min > arr[i][j]) {
					min = arr[i][j];
					filaminimo = i;
					columnaminimo = j;

				}
			}
			System.out.println();

		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.printf("%4d" ,arr[i][j]);
			}System.out.println();
		}
		System.out.println(max + " fila maximo " + filamaximo + " y columna maximo " + columnamaximo);
		System.out.println(min + " fila minimo " + filaminimo + " y columna minimo " + columnaminimo);

		return arr;
	}
}
