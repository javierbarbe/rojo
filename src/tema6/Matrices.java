package tema6;
import java.util.*;

public class Matrices {
	Scanner e=new Scanner(System.in);
	double [] [] mat;
	double suma=0;
	int filas, columnas;
	double [][] boceto=  {{1,2,3},{4,5,6},{7,8,9}};
	public Matrices() {
		
	}
	
	public double[] [] leerMatriz()  {
		System.out.println("Introduce el numero de filas para tu matriz");
			filas=e.nextInt();
		System.out.println("Introduce ahora el numero de columnas para tu matriz");
			columnas=e.nextInt();
		System.out.println("generando matriz...");
		//Thread.sleep(3000L);
		this.mat=new double [filas][columnas];
		for (int i=0; i<filas;i++) {
			for (int j=0;j<columnas;j++) {
				System.out.println("introduce valor");
				this.mat[i][j]=e.nextDouble();
			}
		}
		return this.mat;
	}
	
	public double [] [] escribirMatriz(double [] [] recibida){
		for (int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				System.out.printf("%8.1f", recibida[i][j]);
			} System.out.println();
		}
		return recibida;
	}
	public double [] [] escribirMatriz(){
		double [][]recibida=leerMatriz();
		for (int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				System.out.printf("%8.1f", recibida[i][j]);
			} System.out.println();
		}
		return recibida;
	}
	
	public double sumaDiagonal(double [] [] recibida) {
		
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				if(i==j) {
					suma+=recibida[i][j];
				}
			}
		}
		System.out.println(suma);
		return suma;
	}
	public double encimaDiagonal(double [][] recibida) {
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				if (i+1==j) {
					suma+=recibida[i][j];
				}
			}
		} System.out.println(suma);
		return suma;
	}
	public double encimaDiagonal() {
		double [][] recibida=leerMatriz();
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				if (i+1==j) {
					suma+=recibida[i][j];
				}
			}
		} System.out.println(suma);
		return suma;
	}
	public double abajoDiagonal(double [][] recibida) {
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				if (i==j+1) {
					suma+=recibida[i][j];
				}
			}
		} System.out.println(suma);
		return suma;
	}
	public double abajoDiagonal() {
		double [] [] recibida=leerMatriz();
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				if (i==j+1) {
					suma+=recibida[i][j];
				}
			}
		} System.out.println(suma);
		return suma;
	}
	public double [] []traspuesta(double [] [] recibida){
		double [][] tras=new double[recibida[0].length][recibida.length];
		for (int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++) {
				/*if(i==j+1) {
					mat[j][i]=recibida[i][j];
				}else {*/
				tras[j][i]=recibida[i][j];
				}
			}
		escribirMatriz(tras);
		
		
		return tras;
	}
	public double maximo(double [][] recibida) {
		
		double maximo=recibida[0][0];
		for(int i=0;i<recibida.length;i++) {
			for (int j=0;j<recibida[i].length;j++){
				if(maximo< recibida[i][j]) {
					maximo=recibida[i][j];
				}
			}
		}System.out.println(maximo);
		return maximo;
	}
	public double[] totales(double [][] recibido) {
		double sumafila=0;
		double sumacolumna;
		double []filas = new double [recibido.length];
		double [] columnas= new double [recibido[0].length];
		for (int i=0;i<recibido.length;i++) {
			sumafila=0;
			for (int j=0;j<recibido[i].length;j++) {
				
				  sumafila+=recibido[i][j];
			}
			filas [i]=sumafila;
		} for (int i=0;i<filas.length;i++) {
			System.out.println(filas[i]);
		}
		
		for (int j=0;j<recibido.length;j++) {
			sumacolumna=0;
			for (int i=0;i<recibido[j].length;i++) {
				
				  sumacolumna+=recibido[i][j];
			}
			columnas [j]=sumacolumna;
		} for (int i=0;i<columnas.length;i++) {
			System.out.println(columnas[i]);
		}
		
		double [] sumatorio= new double [columnas.length+filas.length];
			for (int i=0;i<sumatorio.length;i++) {
				if (i<filas.length) {
					sumatorio[i]=filas[i];
				}
				for (int j=0;j<sumatorio.length;j++) {
					
					if(i>=filas.length) {
						sumatorio[i]=columnas[j];
					}
				}
			}
			for (int i=0;i<sumatorio.length;i++) {
				System.out.println(sumatorio[i]);
			}
			
		return sumatorio;
	}
}
