package tema6BIS;
import java.util.*;
public class Ej8Ajedrez {
	private int letras,numeros;
	int [] [] ajedrez= new int[8][8];
	boolean valida=false;
	int num, i,j;
	String [] letros= {"a","b","c","d","e","f","g","h"};
	Scanner e =new Scanner(System.in);
	
	public Ej8Ajedrez() {
		
	}
	public Ej8Ajedrez (Ej8Ajedrez co) {
		Ej8Ajedrez un= new Ej8Ajedrez();
		un=co;
	}
	
	public void establecePos() {
		System.out.println("En qué letra del tablero esta?");
		String letra=e.next();
		char car=letra.charAt(0);
		num=letra.charAt(1);
		String carS=String.valueOf(car);
		while(valida==false) {
			for ( i=0;i<letros.length;i++) {
				if(carS.equalsIgnoreCase(letros[i])) {
					valida=true;
					break;
					
				}
			
			}
			if (valida==true) {
				System.out.println("letra correcta");
			}else {
				System.out.println("introduzca una letra correcta A-H");
				String care=e.next();
				char arre= care.charAt(0);
				carS=String.valueOf(arre);
			}
			
		}System.out.println("tu posicion en el array letros es "+i);
		num-=48;
		int comodin=num;
		//diagonal superior derecha
		for ( j=i;j<ajedrez.length;j++) {
			if(j==i) {
				num++;
				}else {
				if(num<9) {
					System.out.print(letros[j]+" "+num);
					System.out.println();
					num++;
					}
			}
			
			
		
		} int comodin2=comodin;//diagonal superior izquierda
		for (j=i;j<letros.length;j++) {
			if(j==i) {
				comodin2--;
			}else {
				if(comodin2>=0) {
					System.out.print(letros[j]+""+comodin2+ "   ");
					comodin2--;
				}
			}
		}
		System.out.println("fin de superior izquierda");
		//diagonal inferior derecha
		int comodinnumeros=comodin;
		for (int k=i;k>=0;k--) {
			if(k==i) {
				comodinnumeros++;
			}
				else {
				if (comodinnumeros<=8) {
					System.out.print(letros[k]+" "+ comodinnumeros+"  ");
					comodinnumeros++;
				}
			}
		}
		System.out.println();
		//diagonal inferior izquierda
		for (int k=i;k>=0;k--) {
			if(k==i) {
				comodin--;
			}else {
				if(comodin>=0) {
					if(k>=0) {
//						System.out.println("esto no lo pinta");
					System.out.print(letros[k]+"" +comodin+" ");
					comodin--;
					
					}
				}
			}
		}
		
//		if (num==0) {
//			letros []
//		}
	}
}

