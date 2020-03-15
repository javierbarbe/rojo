package tema7;

public class Prueba29a34 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Ej29a34 ola= new Ej29a34();
		int [] [] doble=ola.generaArrayBilInt(3, 3, 6, 2);
//		ola.imprimeDOble(doble);
//		ola.imprimeArray(ola.filaBilInt(1, doble));
//		ola.imprimeArray(ola.columnaBilInt(2, doble));
//		ola.coordenadasArrayBil(5, doble);	
////		ola.imprimeArray(ola.coordenadasArrayBil(55, doble));
//		System.out.println(ola.puntoDesilla(doble, 5));
		int [] [] misilla= new int [2][2];
		misilla[0][0]= 3;
		misilla[0][1]= 4;
		misilla[1][0]= 1;
		misilla[1][1]= 4;
		ola.imprimeDOble(misilla);
		System.out.println(ola.puntoDesilla(misilla, 6));
		}

}
