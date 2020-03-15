package tema6;

public class PruebaMatrices {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Matrices mato = new Matrices();
		double [][] boceto=  {{1,2,3},{4,5,6},{7,8,9}};
		//mato.escribirMatriz(mato.leerMatriz());
		//mato.encimaDiagonal();
		//mato.encimaDiagonal(mato.escribirMatriz(mato.leerMatriz()));
	//mato.abajoDiagonal(mato.escribirMatriz());
		//mato.abajoDiagonal();
		//mato.traspuesta(boceto);
		//mato.maximo(boceto);
		mato.totales(mato.escribirMatriz(boceto));
	}

}
