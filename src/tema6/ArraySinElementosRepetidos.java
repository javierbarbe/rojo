package tema6;

import java.util.Arrays;

public class ArraySinElementosRepetidos {

	public ArraySinElementosRepetidos() {

	}

	public int[] generaNumeros() {
		boolean distinto=true;
		int [] numeros= new int [50];
		int [] contador=new int [numeros.length];
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*10);
			for(int j=0;j<contador.length;j++) {
				if(numeros[i]==numeros[j]) {
					contador[j]++;
					//break;
				}
				while(contador[j]>1) {
					numeros[i]=(int)(Math.random()*50);
					for (int k=0;k<numeros.length;k++) {
						if(i!=k) {
							if(numeros[i]!=numeros[k]) {
							 distinto=true;
							}else {
								
								distinto=false;
								break;
								
							}
						} 
					}if (distinto==true) {
							contador[j]--;
					}
			   }
			}
		} 
		for (int i=0;i<numeros.length;i++) {
			if (contador[i]>0) {
				System.out.println(" del numero "+ numeros[i] + " hay " + contador[i]);
			}
		} return numeros;
	}
	public int[]imprimeArray(int [] recibido){
		for (int i=0;i<recibido.length;i++) {
			System.out.printf("%4d" ,recibido[i]);
			if(i%10==0 && i!=0) {
				System.out.println();
			}
		}return recibido;
	}
	
	
	public static void main(String[] args) {
		ArraySinElementosRepetidos neo= new ArraySinElementosRepetidos();
		//neo.generaNumeros();
		
				int [] creado =neo.generaNumeros();
				Arrays.sort(creado);
				neo.imprimeArray(creado);
	}

}
