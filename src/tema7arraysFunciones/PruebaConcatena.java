package tema7arraysFunciones;

public class PruebaConcatena  {

	public static void main(String[] args) {

		Concatena pe = new Concatena();
		double [] uno = new double [3];
		double [] dos = new double [3];
		uno[0]=0;
		uno[1]=1;
		uno[2]=2;
		dos[1]=5;
		dos[0]=4;
		dos[2]=6;
		pe.imprimeDoubleArr(pe.mezcla(uno,dos));
		double [] prime = pe.inicializa(6);
		double [] secu = pe.inicializa(6);
		pe.imprimeDoubleArr(pe.mezcla(prime, secu));
		
	}

}
