package ejerciciosLibro200;
import java.util.Scanner;
public class ArraysEj2 {

	public static void main(String[] args) {
		Scanner e=new Scanner(System.in);
		// TODO Apéndice de método generado automáticamente
		
		/*Escribe un programa que pida 20 números enteros. Estos números se deben
		introducir en un array de 4 filas por 5 columnas. El programa mostrará las
		sumas parciales de filas y columnas igual que si de una hoja de cálculo se
		tratara. La suma total debe aparecer en la esquina inferior derecha.*/
	
		int [] [] matriz = new int [3][4]; 
		for ( int i=0; i< matriz.length; i++) { //i = filas
			int sumaFila=0;
			if (i<2) {
				for (int j=0; j<matriz[0].length;j++) {
					if(j<3) {
						System.out.println("introduce numero");
						matriz[i][j]=e.nextInt();
						sumaFila+=matriz[i][j];
					}//fin del condicional para que deje la columna j=6 libre y meter la suma
					else {
						matriz[i][j]=sumaFila;
					}
					
				} //fin del for recorriendo columnas = j
			}//fin del if i<2
				
			
		} //fin del for recorriendo filas = i
		int	sumaColumna=0;
		for(int j=0;j<matriz[0].length;j++) {
			if (j<3) {
				for(int i=0; i<matriz.length;i++) {
				
					sumaColumna+=matriz[j][i];
					matriz[i][j]=sumaColumna;
				}
			}
		}
		
		
		for(int i=0; i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}System.out.println();
		} // fin del for de imprimir las matrices
		
		
	} // fin del ejercicio

} // fin de la clase
