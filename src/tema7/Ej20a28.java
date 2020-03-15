package tema7;
import java.util.*;
public class Ej20a28 {
	Scanner e= new Scanner(System.in);
	private int [] arrayInt ; 
	private int [] volteado;
	private int longarray,tmaximo,tminimo,minimo,maximo,buscado;
	private int ultimapos,primpos;
	
	public Ej20a28() {
		
	}
	public int[] generaArrayInt(int longarray, int maximo, int minimo) {
		this.longarray=longarray;
		this.tmaximo=maximo;
		this.tminimo=minimo;
		arrayInt = new int [longarray];
		rellenaArray(arrayInt);
		return arrayInt;
	}

	public void imprimeArray(int [] recibido) {
		for (int i=0; i<recibido.length;i++) {
			System.out.print(recibido[i]+" ");
		}System.out.println();
	}
	
	public int [] rellenaArray(int [] recibido) {
		for( int i=0;i<arrayInt.length;i++) {
			arrayInt[i]=(int)(Math.random()*(tmaximo-tminimo)+tminimo);
		}
		
		return arrayInt;
	}
	
	public int minimodelArrayIn(int [ ] recibido) {
		minimo=recibido[0];
		for (int i=0; i < recibido.length; i++) {
			if(minimo>recibido [i]) {
				minimo=recibido[i];
			}
		}
		return minimo;
	}
	
	public int maximodelArrayInt(int [ ] recibido) {
		maximo=recibido[0];
		for (int i=0; i < recibido.length; i++) {
			if(maximo<recibido [i]) {
				maximo=recibido[i];
			}
		}
		return maximo;
	}
	
	public int mediaArrayInt(int []recibido) {
		int media=0;
		for ( int i=0;i<recibido.length;i++) {
			media+=recibido[i];
		}
		media/=recibido.length;
		
		return media;
	}
	public boolean estaenArrayInt(int [] recibido) {
		boolean presente=false;
		System.out.println("Que numero buscas en el array");
		 buscado=e.nextInt();
		for (int i=0;i<recibido.length;i++) {
			if (recibido[i]==buscado) {
				presente=true;
			}
		}return presente;
	
	}
	public int posicionArrayInt(int []recibido) {
		int posicion=0;
		if (estaenArrayInt(recibido)== true) {
			for (int i= 0 ; i<recibido.length;i++) {
				 if(recibido[i]==buscado) {
					 posicion=i;
				 }
			}
		}
		return posicion;
	}
	
	public int [] volteaArrayInt(int [] recibido) {
		volteado= new int [recibido.length];
//		System.arraycopy(recibido, 0, volteado, 0, recibido.length);
		volteado=recibido.clone();
		int j=recibido.length-1;
		for (int i = 0 ; i<volteado.length;i++,j--) {
			volteado[i]=recibido[j];
		}
		return volteado;
	}
	
	public int [] rotaDerechaInt(int [] recibido,int posiciones) {
		do {
			ultimapos=recibido[recibido.length-1];
			for (int i=recibido.length-1;i>0;i--) {
				
				recibido[i]=recibido[i-1];
			}recibido[0]=ultimapos;
			
			posiciones--;
		}while (posiciones>0);	
		return recibido;
	}
	public int [] rotaIzdaInt(int [] recibido,int posiciones) {
		do {
			primpos=recibido[0];
			for (int i=0;i<recibido.length-1;i++) {
				
				recibido[i]=recibido[i+1];
			}recibido[recibido.length-1]=primpos;
			
			posiciones--;
		}while (posiciones>0);	
		return recibido;
	}
	
	
	
}
