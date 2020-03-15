package tema6BIS;

public class Ej8 {
	int [] [] numeral=new int [4][4];
	int []fin= new int[numeral.length];
	int [] prim= new int [numeral.length];
	public Ej8() {
		
	}
	public int [] [] rellenaArray() {
		for (int i=0;i<numeral.length;i++) {
			for (int j=0;j<numeral[i].length;j++) {
				numeral[i][j]=(int)(Math.random()*101);
			}
		}
		return numeral;
	}
	public  int [] [] imprimeArray(int [] [] recibido){
		for (int i=0;i<recibido.length;i++) {
			for (int j=0;j<recibido[i].length;j++) {
				System.out.printf("%4d", recibido[i][j]);
			}System.out.println();
		}
		
		return recibido;
	}
	public int [] [] rotaArray(int [] [] recibido){
		int j;
		for (int i=0;i<recibido.length;i++) {
			for ( j=recibido[i].length-1;j>0;j--) {
				//rellena el array ultima columna
				if (j==recibido[i].length-1) {
				 fin[i] =recibido [i][recibido[i].length-1];
				}//rota el array a la derecha
				recibido[i][j]=recibido[i][j-1];
			}
		} //rota hacia abajo la ultima columna
		for (int i=1;i<recibido.length;i++) {
			int ultipos=recibido[i].length-1;
				recibido[i][ultipos]=fin[i-1];
		}//rota las ultimas fila a la izq
		int filasfinales=recibido.length/2;
		for(int i=filasfinales;i<recibido.length;i++) {
			for(j=0; j<recibido[i].length-1;j++) {
				recibido[i][j]=recibido[i][j+1];
			}
		}
		
		
		//rellena array columna primera
		for (int i=0;i<recibido.length;i++) {
			 j=0;
				if(j==0) {
					prim[i]=recibido[i][0];
				}
			}
		//sube 1 la columna izquierda
		for( int i=0;i<recibido.length-1;i++) {
			recibido[i][0]=prim[i+1];
		}
		
		
		return recibido;
	}
	
	
	
	
	
	
	public int [] [] rotaUltimaCol(int [] [] recibido){
		for (int i=0;i<recibido.length;i++) {
			for (int j=recibido[i].length-1;j>0;j--) {
			
			
			}
		}
			
		
		
		
		
		return recibido;
	}
	
	
}
