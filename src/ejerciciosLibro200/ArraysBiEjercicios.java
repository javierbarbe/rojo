package ejerciciosLibro200;
import java.util.*;
public class ArraysBiEjercicios {
Scanner e=new Scanner(System.in);
	
	public void ej1() {
		/*Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura.*/
		
		int [] [] cuadro= new int[3][6];
		cuadro[0][0]=0;
		cuadro[0][1]=30;
		cuadro[0][2]=2;
		cuadro[0][5]=5;
		cuadro[1][0]=75;
		cuadro[2][2]=-2;
		cuadro[2][3]=9;
		cuadro[2][5]=11;
		System.out.print("\t\t Columna 0 \t Columna 1\t Columna 2\t Columna 3\t Columna 4\t Columna 5\t");
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		
		System.out.println();
		System.out.print("Fila 0:");
		
		for (int i=0; i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==0) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
		}//fin del for primera linea
		
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		System.out.println();
		System.out.print("Fila 1:");
		for (int i=0;i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==1) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
			
		}//fin de for fila 1
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		System.out.println();
		System.out.print("Fila 2:");
		for (int i=0; i<cuadro.length;i++) {
			for(int j=0; j<cuadro[0].length;j++) {
				if(i==2) {
				System.out.printf("%15d ",cuadro[i][j]);
				}
			}
		}// fin del for fila 2
		System.out.println();
		System.out.println("\t\t_____________|______________|_______________|_______________|_______________|_______________|");
		
	}//fin ejercicio 1

	
	
	
	
public void ej2() {
	/*Escribe un programa que pida 20 números enteros. Estos números se deben
	introducir en un array de 4 filas por 5 columnas. El programa mostrará las
	sumas parciales de filas y columnas igual que si de una hoja de cálculo se
	tratara. La suma total debe aparecer en la esquina inferior derecha.*/
	System.out.println("ola");
	int po,i=0,j=0, sumaderecha=0,sumaColumna=0, sumaColumnasTotal=0;
	int [] [] sumatorio = new int[5][6];
	//while(i<5)
			   
	for ( i=0;i<sumatorio.length;i++) {
		sumaderecha=0;
			for( j=0;j<sumatorio[0].length;j++) {
				if(j<sumatorio[0].length-1) {
					sumatorio[i][j]=(int)(Math.random()*5+1);
					 sumaderecha+=sumatorio[i][j];
					// sumaderechaFINAL+=sumatorio[i][j];
				}else {
					sumatorio[i][j]=sumaderecha;
				}
			}//fin de for j=0
				 
	}//fin de for i=0
		for( j=0;j<sumatorio[0].length;j++) {
			sumaColumna=0;
			for(i=0;i<sumatorio.length;i++) {
				if(i<sumatorio.length-1) {
					sumaColumna+=sumatorio[i][j];
					sumaColumnasTotal+=sumatorio[i][j];
				}else {
					sumatorio[i][j]= sumaColumna;
				}
			}
		}
	
	
	for ( i=0;i<sumatorio.length;i++) {
		for( j=0; j<sumatorio[0].length;j++) {
			 {
			if(i==sumatorio.length-1 && j==sumatorio[0].length-1) {
				System.out.printf("%7d ",sumaColumnasTotal);
			}else {
			System.out.printf("%7d ",sumatorio[i][j]);
			}
			}
		}System.out.println();
		
	
	
		
	}//fin imprimir fila 2(3);
	//fin imprimir fila 1(2);
	
	//System.out.println();
	//System.out.println();
	//fin imprimir fila 3(4);
	
}// fin EJERCICIO 2
	
	

			   
public void ej2Bis() {
	int sumaFila=0,sumaColumna=0; // sumaTotal=0; esta variable no la resuelvo bien
	int [] [] matriz= new int [4][5];
	for (int fila=0; fila<matriz.length;fila++) {
		sumaFila=0;
		for (int columna=0;columna < matriz[0].length; columna++) {
			if (columna==matriz[0].length-1) {
				matriz[fila][columna]=sumaFila;
			}else{
				
				matriz[fila][columna]=(int)(Math.random()*4);
				sumaFila+=matriz[fila][columna];
				//sumaTotal+=matriz[fila][columna]; esto no lo coge bien
			}
		}
	}// fin del recorrido para rellenar la matriz
	for (int columna=0;columna<matriz[0].length;columna++) {
		sumaColumna=0;
		for (int fila=0; fila<matriz.length;fila++) {
			if(fila==matriz.length-1) {
				matriz[fila][columna]=(sumaColumna);
				if(columna==matriz[0].length-1) {
					matriz[fila][columna]=(sumaColumna*2); // aqui si pongo sumaFila o columna *2 da bien, si por el contrario, 
															// las sumo da error
				}
			}else {
				sumaColumna+=matriz[fila][columna];
			}
		}
	}
	
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0;j<matriz[0].length;j++) {
			System.out.printf("%7d", matriz[i][j]);
		}System.out.println();
	}// fin de imprimir matriz
} // fin del ejercicio 2 Bis

public void ej4()	
		throws InterruptedException  {
	
/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.*/
	
	
	int [] [] matriz4= new int [4] [5];
	int sumaDerecha=0, sumaColumna=0, sumaTotal=0;
	for (int fila=0; fila<matriz4.length;fila++) {
		sumaDerecha=0;
		for (int columna=0;columna<matriz4[0].length;columna++) {
			if(columna<matriz4[0].length-1) {
				matriz4[fila][columna]=(int)(Math.random()*4);
				sumaDerecha+=matriz4[fila][columna];
				sumaTotal+=matriz4[fila][columna];
			}else {
				matriz4[fila][columna]=sumaDerecha;
				//sumaTotal+=matriz4[fila][columna];
			} //fin else 
		}//fin del for columnas dentro de filas
	}// fin del for filas para rellenar la matriz
	for( int columna=0;columna<matriz4[0].length;columna++) {
		sumaColumna=0;
		for(int fila=0;fila<matriz4.length;fila++) {
			if(fila<matriz4.length-1) {
				sumaColumna+=matriz4[fila][columna];
				sumaTotal+=matriz4[fila][columna];
			}else {
				if(columna==matriz4[0].length-1) {
					matriz4[fila][columna]=sumaColumna*2;
				}else {
				matriz4[fila][columna]=sumaColumna;
				}
			}
		}// fin condicion para sumar solo la columna correspondiente
			 //
				
			//}
				
			
		//fin for fila 2 buccle anidado
	}//fin for columna 2 bucle anidado
	
	for (int fila=0; fila<matriz4.length;fila++) {
		
		for (int columna=0;columna<matriz4[0].length;columna++) {
			System.out.printf("%7d", matriz4[fila][columna]);
			Thread.sleep(200);
		}System.out.println();
		Thread.sleep(500);
	}
	
}// fin del ejercicio 4

public void ej5() {
	/*Ejercicio 5
	Realiza un programa que rellene un array de 6 filas por 10 columnas con
	números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
	A continuación, el programa deberá dar la posición tanto del máximo como
	del mínimo.*/
	
	int [] [] matriz = new int [6][10];
	int maximo=0, min=1000,posicionMax=0, posicionMin=0,posicionMinFin=0,posicionFinMax=0;
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			matriz[fila][columna]=(int)(Math.random()*1001);
			if(matriz[fila][columna]>maximo) {
				maximo=matriz[fila][columna];
				
			}
			if(matriz[fila][columna]<min) {
				min=matriz[fila][columna];
				
			}
		}
		
	} // fin del for para rellenar y saber max y minimo
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			System.out.printf("%5d" ,matriz[fila][columna]);
			if(matriz[fila][columna]!=maximo) {
				posicionMax++;
			}else {
				 posicionFinMax=posicionMax;
			}
			if(matriz[fila][columna]!=min) {
				posicionMin++;
			}else {
				 posicionMinFin=posicionMin;
			}
		}System.out.println();
	}
	System.out.println(min+" Posicion del minimo "+(posicionMinFin+1));
	System.out.println(maximo+" Posicion del maximo "+(posicionFinMax+1 ));
	
}// fin ejercicio 5

public void ej6() {
	/*Modifica el programa anterior de tal forma que no se repita ningún número en
	el array.*/
	boolean repetido;
	int [] [] matriz = new int [2][3];
	int maximo=0, min=1000,posicionMax=0, posicionMin=0,posicionMinFin=0,posicionFinMax=0;
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			matriz[fila][columna]=(int)	(Math.random()*15)+1;
			repetido=false;
		
	
		}
	} 
	for(int[] arr2: matriz)
	{
	    for(int val: arr2) {
	    	System.out.printf("%5d",val);
	    }System.out.println();
	        
	}
	
	// fin del for para rellenar y saber max y minimo
	for (int fila=0; fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[0].length;columna++) {
			System.out.printf("%5d" ,matriz[fila][columna]);
			if(matriz[fila][columna]>maximo) {
				maximo=matriz[fila][columna];
				
			}
			if(matriz[fila][columna]<min) {
				min=matriz[fila][columna];
				
			}
			if(matriz[fila][columna]!=maximo) {
				posicionMax++;
			}else {
				 posicionFinMax=posicionMax;
			}
			if(matriz[fila][columna]!=min) {
				posicionMin++;
			}else {
				 posicionMinFin=posicionMin;
			}
		}System.out.println();
	}
	System.out.println(min+" Posicion del minimo "+(posicionMinFin+1));
	System.out.println(maximo+" Posicion del maximo "+(posicionFinMax+1 ));
	
}// fin ej6

public void ej7() {
	/* Mejora el ejercicio de la busqeda del tesoro de tal manera que si el tesoro esta a una casilla de distancia
	 * 	te lo diga un aviso "CUIDADO EL TESORO ESTA CERCA"
	 */
		
	 final int VACIO = 0;
	 final int MINA = 1;
	 final int TESORO = 2;
	 final int INTENTO = 3;
	 boolean salir=false;
	
	int [][] cuadrante= new int [5][5];
	int x=0, y=0;
	for (int i=0; i<cuadrante.length;i++){
		for (int j=0; j<cuadrante[0].length;j++) {
			cuadrante[i][j]=VACIO;
		}
	}
	// COLOCANDO LA MINA
			int minaX=2;//(int)(Math.random()*cuadrante.length);
			int minaY=2;//2(int)(Math.random()*cuadrante[0].length);
			cuadrante [minaX][minaY]=MINA;
			
	//COLOCANDO EL TESORO (NO PUEDE COINCIDIR CON LA MINA!!)
			int tesoroX, tesoroY;
			do {
				tesoroX=1;//(int)(Math.random()*cuadrante.length);
				tesoroY=1;//(int)(Math.random()*cuadrante[0].length);
			}while(tesoroX==minaX && tesoroY==minaY);
			cuadrante[tesoroX][tesoroY]=TESORO;
			
			
		//comienza el juego
		System.out.println("Que empiece la busqueda");
		int oportunidades=6;
		do {
		for(y = cuadrante.length-1; y >= 0; y--) {
			System.out.println();
			System.out.print(y + " |");
			
			for(x = 0; x < cuadrante[0].length; x++) {
				if (cuadrante[y][x] == INTENTO) {
					System.out.print("X  ");
				}
				else {
					System.out.print(" ");
				}
					
				}
					
		}	System.out.println();
		System.out.println(" ----------------\n   0  1  2  3  4\n");
		//PIDE COORDENADAS
		System.out.println("donde buscamos?");
		int columna=e.nextInt();
		int altura=e.nextInt();
		//COMPRUEBA LO INTRODUCIDO
		switch(cuadrante[columna][altura]) {
		case VACIO:
			cuadrante[altura][columna]=INTENTO;
			break;
		case MINA:
			System.out.println("lo siento perdiste");
			salir = true;
			break;
		case TESORO:
			System.out.println("Has ganado el tesoro");
			salir = true;
			break;
			default:
		}
		}while(!salir);
		String c="";
		for (int fila=cuadrante.length-1; fila>=0;fila--) {
			System.out.print(fila+" ");
			for(int columna=0;columna<cuadrante[0].length;columna++) {
				switch(cuadrante[fila][columna]) {
				case VACIO:
					c=" ";
					break;
				case MINA:
					c="*";
					break;
				case TESORO:
					c="$$";
					break;
				default:
				}
				System.out.print(c);
			}System.out.println();
			
		}System.out.println(" ----------------\n   0  1  2  3  4\n");
}// fin ejercicio7



}// fin de la clase
