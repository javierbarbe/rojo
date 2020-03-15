package tema6BIS;
import java.util.*;
public class Ej7 {
	Scanner e=new Scanner(System.in);
	private int intentos=0;
	int ejeX,ejeY;
	private int coordenadaX, coordenadaY;
	int tesoroX, tesoroY;
	int X,Y;
	final int MINA=1;
	final int TESORO=2;
	final int VACIO=3;
	final int INTENTO=0;
	int [] [] mapa= new int [5][5];
	public Ej7() {
		
	}
	
	
	public int [] [] rellenador(){
		//rellenando el mapa con elementos VACIOS
		for (int i=0;i<mapa.length;i++) {
			for(int j=0;j<mapa[i].length;j++) {
				mapa[i][j]=VACIO;
			}
		}
				return mapa;
	}
 	public int [] [] colocaMapa(){
		
		
		//rellenando el mapa con elementos VACIOS
		for (int i=0;i<mapa.length;i++) {
			for(int j=0;j<mapa[i].length;j++) {
				mapa[i][j]=VACIO;
			}
		}
		//colocando la mina
		 ejeX=(int)(Math.random()*5);
		 ejeY=(int)(Math.random()*5);
		mapa[ejeY][ejeX]=MINA;
		
		//colocando el tesoro
		do {
			 tesoroX=(int)(Math.random()*5);
			 tesoroY=(int)(Math.random()*5);
		}while(tesoroX==ejeX  && tesoroY==ejeY);
		mapa[tesoroY][tesoroX]=TESORO;
		
		
		return mapa;
	}
	public int [] [] imprimeMapa(){
		for ( int i=mapa.length-1;i>=0;i--) {
			for(int j=0;j<mapa[i].length;j++) {
				if(j==0) {
					System.out.printf("%4d",i);
				}
				System.out.printf("%4s", "|");
			}System.out.println();
			
		}for(int i=0;i<mapa[0].length;i++) {
			if(i==0) {
				System.out.printf(" %5d",i);
			}else {
			System.out.printf("%4d",i);
			}
		}
		return mapa; 
	}
	
	public int [] [] pideCoordenadas(){
		
		boolean salir=false;
		String c="";
		colocaMapa();
		while (intentos<=6 || salir==true) {
			for (int i=mapa.length-1;i>=0;i--) {
				for (int j=0;j<mapa[i].length;j++) {
					if(j==0) {
						System.out.printf("%4d",i);
					}
					if (mapa[j][i]==INTENTO) {
						System.out.printf("%4s","X |");
					}else {
						System.out.printf("%4s","|");
					}
				}System.out.println();
			}for(int i=0;i<mapa[0].length;i++) {
				if(i==0) {
					System.out.printf(" %5d",i);
				}else {
				System.out.printf("%4d",i);
				}
			}System.out.println();
			System.out.println("Introduce la coordenada Y");
			X=e.nextInt();
			//intentos++;
			System.out.println("Introduce la coordenada X");
			Y=e.nextInt();
			switch (mapa[coordenadaY][coordenadaX]) {
			case VACIO:
				mapa[Y][X]=INTENTO;
				if ((Math.abs(X - ejeX) < 2) && (Math.abs(Y-ejeY) < 2)) {
					System.out.println("Cuidado, hay una mina cerca.");
					}
					break;
			case MINA:
				System.out.println("Has muerto");
				salir=true;
				break;
			case TESORO:
				System.out.println("Lo conseguiste!! Enhorabuena");
				salir=true;
				break;
			}
		}
		
		
		
		return mapa;
	}
}
