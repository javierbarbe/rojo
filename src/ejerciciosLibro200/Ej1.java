package ejerciciosLibro200;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej1 {
	
	Scanner e  = new Scanner(System.in);
		 int p;
		 
		 
	public void array11() {
	int [] num= new int [12];
	
	num[0]=39;
	num[1]=-2;
	num[6]=14;
	num[8]=5;
	num[9]=120;
	
	for (int n: num) {
		System.out.print(n+" ");
	}
	
	}
public void  arrayCaract() {
	char [] simbolos= new char [19];
	simbolos[0]=')';
	simbolos[1]='x';
	simbolos[4]='@';
	simbolos[6]=' ';
	simbolos[8]='+';
	simbolos[9]='Q';
	
	
	for (char p : simbolos) {
			System.out.print(p+ " ");
}
	
}	


public void albertito() {
	int i;
	int [] alberto = new int [9];
	
	for( i=8; i>=0; i--) {
		System.out.println("Introduce un nmero");
		alberto [i]= e.nextInt();
		
		System.out.println(alberto[i]);
	}
	 for( int n: alberto) {
		 System.out.print(n+" ");
	 }
	/*System.out.print(alberto[2]);
	
	System.out.print(alberto[1]);
	System.out.print(alberto[0]);*/
	 
	 
		 
	 }

public void ej4() {
	
	int[] numero= new int [20];
	double[] cuadrado= new double [20];
	double [] cubo= new double [20];
	
	for (int i=0; i<numero.length; i++) {
		numero[i]= (int) (Math.random()*101);
		cuadrado[i]= Math.pow(numero[i], 2);
		cubo[i]=Math.pow(numero[i], 3);
		
		
	}	 for (int t=0;t<numero.length;t++) {
		 System.out.printf("%4d   %.0f  %6.0f \n", numero[t],cuadrado[t], cubo[t]);
	/*for (int n:numero) {
		System.out.print(n+" ");
	}*/


		}
	}
	 
 public void ej5() {
	 
	int max, min;
	 
	 int[] cinco= new int[3];
	  
	  
	 System.out.println("Introduce diez numeros");
	 
	 for(int a=0; a<cinco.length; a++) {
		 do {
		
			 System.out.println("posicion " +(a+1));
			 cinco[a]=e.nextInt();
			 a++;
		 }while (a<cinco.length);
			 }
	 max= min= cinco[0];
  for( int w=0; w<cinco.length;w++) {
	  
	  if(max< cinco[w]) {
		  max=cinco[w];
	  }
	  
	  if (min>cinco[w]) {
		  min = cinco[w];
	  }
	  
  } 
  System.out.println("El maximo valor es: "+ max+ "\nEl minimo valor es: "+min);
 
 	}
	 
public void rota() {
		 
		 int [] rotador = new int [10]; 
		 
		 for ( int n=0; n< rotador.length;n++) {
			 System.out.println("Introduce un numero");
			rotador[n]= e.nextInt();
			 }
		 
		 for (int n: rotador) {
		 System.out.print(n+ " ");
		 
	
		
	 }System.out.println();
		 int [] rotado= new int[rotador.length];
		 int ultimo= rotador[rotador.length-1];
 	
		 for( int q=rotador.length-1; q>0; --q) {
 		
 		rotado[q]= rotador[q-1];
		 }
		 rotado[0]= ultimo;
		 for (int t: rotado) {
			 System.out.print(t+ " ");
		 		}
		}

public void ej7() {
	
	int [] ej7= new int[20]; 
	
	for ( int a=0; a<ej7.length; a++) {
		
		ej7[a]= (int) (Math.random()*11);
	}
	for( int n :ej7) {
	System.out.print(n+" ");
	} System.out.println();
	System.out.println("Introduce ahora el valor que deseas cambiar");
	int valor= e.nextInt();
	System.out.println("Introduce ahora el valor por el cual lo quieres sustituir");
	int susti= e.nextInt();
	
	for ( int n= 0; n<ej7.length;n++) {
		//System.out.print(ej7[n]+ " ");
		if (ej7[n]==valor) {
			ej7[n]=susti;
			System.out.print( "\""+ ej7[n]+ "\" ");
		} else {
			System.out.print(ej7[n]+ " ");
			}
		} 
	}


public void ej8() {
	
	/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
	de un determinado año y que muestre a continuación un diagrama de barras
	horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
	de asteriscos o cualquier otro carácter.*/
	
	int [] temp= new int[2];
	
	
	 for ( int n=0; n<temp.length;n++) {
		 
		 System.out.println("introduce la temperatura del mes "+ (n+1));
		 temp[n]=e.nextInt();
	 }
	 
	for(int n=0; n<temp.length;n++) {
		System.out.print("s");
		for(int q=0; q<temp[n];q++) {
			System.out.println("*");
			System.out.print("s");
		}
		
	}
	
	
}


public void fibonacci() {
	int fibonacci;
	int n=0;
	
	
	
	
	System.out.println("introduce un numero ");
	n=e.nextInt();
	/*fibonacci= (n+(n-1));
	for(int q=0; q<fibonacci; q++) {
		System.out.println(q +(q+1));
		q+=q;
	}*/
	 int f1=0, f2=1,aux;
	while(n > 2) {
		aux = f1;
		f1 = f2;
		f2 = aux + f2;
		System.out.print(" " + f2);
		n--;
		}
	
	//System.out.println("la posicion " +n+" en la serie fibonacci es "+ fibonacci);
}


/*Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.*/


public void ej18() {
	int num1, num2;
	do {
		System.out.println("Introduce 2 numeros enteros distintos");
		num1=e.nextInt();
		num2=e.nextInt();
	}while(num1==num2);
	
	if(num1<num2) 
	{
		while(num1<num2) 
		{
		System.out.print(num1+" ");
		num1+=7;
		}
	}else 
		{
		 while(num1>num2)
		 	{
			 System.out.print(num2+" ");
			 num2+=7;
		 	}
		}
	
}

/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/

public void ej19() {
	System.out.println("Vamos a dibujar una piramide\n¿Como va a ser de alta?");
	int alturaDada=e.nextInt();
	int alturaActual=0;
		
	while( alturaActual<alturaDada) {
		System.out.print("* ");
		alturaActual++;
	}
	alturaActual++;
	
	
	/*while(alturaDada>alturaActual) {
		int espaciosBlancos=0;
		while (espaciosBlancos<alturaDada-1) {
			System.out.print(" ");
			espaciosBlancos++;
			//alturaActual++;
		}
		
		//System.out.print(" ");
		System.out.print("* ");
		System.out.println();
		alturaActual++;
	}*/
	
	
	
}

/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.
Por ejemplo:*/

public void ej11() {
	int contador=0;
	int h=0;
	
	int [] original=new int [10];
	int [] copia=new int [original.length];
	int fin=(original.length-1);
	System.out.println("Introduce 3 numeros");
	for ( int i=0; i<original.length;i++) 
	{
		original[i]=e.nextInt();
	}
	for (int n: original)
	{
		System.out.print(n+ " ");
	}
	System.out.println();
	for( int q=0; q<original.length; q++) 
	{  		
		
			for(int n=1; n<original[q]; n++) 
			{
				if(original[q]%n==0) 
				{
					contador++;
				}
			}
				
				if (contador<=2) 
				{
					//System.out.println("El numero "+original[q]+"  es primo");
					
						
					copia[h]= original[q];
					h++;
					
						
				}else {
					//System.out.println("El numero " +original[q] + " no es primo");
						contador=0;			
				
						copia[fin]= original[q];
						fin--;
				contador=0;
		}
				
			}for ( int n: copia) {
				System.out.print(n+ " ");
				
		}
	
	
	
	
}

/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
ambos números están entre 0 y 9. El programa deberá colocar el número de
la posición inicial en la posición final, rotando el resto de números para que no
se pierda ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:*/

public void ej12() {
	int [] hul= new int[10]; 
	int [] copia= new int [hul.length-1]; 
	int numero; 
	System.out.println("introduce 10 numeros");
	
	for ( int i=0; i<hul.length;i++) {
		 	hul[i]=(int) (Math.random()*10);
	 		}
	for( int h : hul) {
		System.out.print(h +" ");
	}
	System.out.println();
	
	int ultimo=hul[hul.length-1]; 
	
	for ( int j=copia.length-1;j>0; j--)
	{
	copia[j]= hul[j-1];
	}
	copia[0]=ultimo;
	for ( int n: copia)
	{
		System.out.print(n+" ");
	}
	//System.out.println(ultimo);
	
} // fin ejercicio 12


public void ej13() {
	
	
	/*Escribe un programa que rellene un array de 100 elementos con números enteros
	aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
	el programa mostrará el array y preguntará si el usuario quiere destacar el
	máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
	el número destacado entre dobles asteriscos.*/
	
	int [] cien = new int [100];
	
	for ( int i=0;i<cien.length; i++) {
		cien[i]=(int)(Math.random()*501);
	} 
	for( int j=0; j<cien.length;j++) {
		System.out.print(cien[j] +" ");
		if (j==24) {
			System.out.println();
		}
		if (j==49) {
			System.out.println();
		}
		if (j==74) {
			System.out.println();
		}
	}
	System.out.println();
	System.out.println("¿que elemento quieres destacar, el maximo(1) o el minimo(0)");
	
	int eleccion= e.nextInt();
	int min= cien[0];
	int max=cien[0];
	switch (eleccion) {
		
	case 0:	
			for( int h =0; h<cien.length;h++) {
					if(cien[h]<=min) {
						min=cien[h];
					} 
					
				}
			for (int h=0; h<cien.length;h++) {
				if(h==24) {
					System.out.println();
				}
				if(h==49) {
					System.out.println();
				}
				if(h==74) {
					System.out.println();
				}
				if(cien[h]==min) {
			
					System.out.print("**"+cien[h]+"** ");
				}else {
				System.out.print(cien[h]+" ");
					}
			}
			
			//System.out.println(" este es el minimo "+ min);
			break;
			
			
	case 1: for( int k=0;k< cien.length;k++) {
				if (cien[k]>=max) {
					max=cien[k];
				}
			}
			for(int g=0; g<cien.length;g++) {
				if(g==24) {
					System.out.println();
				}
				if(g==49) {
					System.out.println();
				}
				if(g==74) {
					System.out.println();
				}
				if(cien[g]==max) {
					System.out.print("**"+cien[g]+"** ");
				}else {
					System.out.print(cien[g]+" ");
				}
			}
			//System.out.println(" este es el maximo "+ max);
		break;
		
	}
	
	
	
} //fin ejercicio 13
 



/*Ejercicio 14
Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/
 public void ej14() {
	 String [] escrito= new String [8];
	
	 String[] copia=new String[8];
	// System.arraycopy(escrito, 0, copia, 0, 5);
	
	
	int primero=0;
	//int prim=0;
	int ultimo=escrito.length-1;
	 String []color= {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco","morado"};
	
	// List lista = new ArrayList();
	// lista=Arrays.asList(color);
	 
	 
 for( int i=0; i<escrito.length;i++) {
	 System.out.println("introduce palabra");
	 escrito[i]=e.nextLine();
	 boolean esColor=false; //variable para determinar si meto la palabra al final del array copia
	 for (String k : color) {
		 if (k.equals(escrito[i])) {
			 System.out.println("Milagro coincide");
			 copia[primero]=escrito[i];
			 primero++;
			 esColor=true;
			 break;
	 	}
	 } // pasa por las posiciones del array color, si no coincide la primera, pasa a la segunda, hasta acabar con todas
	 // las posiciones del array color. Cerrar el bucle for y no poner un else es la clave para que lo recorra hasta que se canse
	 
		 if(esColor!=true) {
			 copia[ultimo]=escrito[i];
			 ultimo--;
					 
		 }
	 
	/* noComun[prim]=escrito[i];
	 prim++;*/
	 
 } for(String k: copia) {
	 System.out.print(k +" ");
 	}System.out.println();

	 
 } // fin ejercicio14 




 /*Ejercicio 15
 Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 personas como máximo e intente de nuevo”. Para el grupo que llega,
 se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
 funcionamiento del programa se ilustra a continuación:
*/


public void ej15() {
	int clientela=0;
	int igualAcero=0;
	int sumaTotal=1;
	int [] mesas= new int[10];
	
	for (int j=0;j< mesas.length;j++) {
		mesas[j]=(int)(Math.random()*5);
	}
	
		for(int t=0;t<mesas.length;t++) {
		System.out.print(" Mesa " +(t+1)+ " |");
	}System.out.println();
	for(int k: mesas) {
		System.out.printf("%5d    ",k);
	}
		
	System.out.println();
	do {
	System.out.println("Bienvenidos, ¿Cuantos son?");
	int respuesta=e.nextInt();
	if (respuesta<1 || respuesta>4) {
		System.out.println("Lo siento, no admitimos grupos de "+respuesta);
	}else {
		sumaTotal=0;
		System.out.println();
		System.out.println();
		System.out.println("Las mesas en este momento estan asi");
		for(int t=0;t<mesas.length;t++) {
			System.out.print(" Mesa " +(t+1)+ " |");
		}System.out.println();
		for(int k: mesas) {
			System.out.printf("%5d    ",k);
		}
		for (int s=0;s<mesas.length;s++) {
			if(mesas[s]==0) {
				mesas[s]=respuesta;
				igualAcero=1;
				sumaTotal=0;
				System.out.println();
				System.out.println("Su mesa es la numero "+ (s+1));
				break;
			}igualAcero=0;
		}for (int s=0;s<mesas.length;s++) {
			if(igualAcero==0) {
				if( mesas[s]+respuesta<=4 ) {
					mesas[s]=mesas[s]+respuesta;
					System.out.println();
					System.out.println("Su MESA es la "+(s+1));
					sumaTotal=0;
					break;
				}else {
					//System.out.println("Lo siento, no hay mesas para su grupo");
					sumaTotal=1;
				}
		   }
		}
	}
			
	 if(sumaTotal==1) {
		System.out.println();
		System.out.println("Lo siento, no hay mesas para su grupo");
	}else {		
	System.out.println();
	System.out.println("Las mesas tras estos comensales estan asi");
		for(int t=0;t<mesas.length;t++) {
			System.out.print(" Mesa " +(t+1)+ " |");
		}System.out.println();
		for(int k: mesas) {
			System.out.printf("%5d    ",k);
		}
	}System.out.println(); //fin del else
	//for(int l: mesas) {
		//System.out.print(l+ " ");
		
	
	}while(clientela<=3); //fin del do 
	
	
	
} //fin ejercicio15


public void ej16() {
	/*Escribe un programa que rellene un array de 20 elementos con números enteros
	aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
	el programa mostrará el array y preguntará si el usuario quiere resaltar los
	múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
	array escribiendo los números que se quieren resaltar entre corchetes.*/
	int [] resalto= new int[20];
	int respuesta;
	for (int q=0; q<resalto.length;q++) {
		resalto[q]=(int)(Math.random()*401);
	}
	for (int p : resalto) {
		System.out.print(p+" ");
	}
	System.out.println();
	System.out.println("Quieres resaltar los multiplos de 5, \n o los multiplos de 7?");
	respuesta=e.nextInt();
	switch(respuesta) {
		case 5: for (int j=0;j<resalto.length;j++) {
						if ( resalto[j]%5==0) {
							System.out.print(" ["+ resalto[j]+ "] ");
						}else {
							System.out.print(resalto[j]+ " ");
						}
						
				}break;
		case 7: for(int j=0;j<resalto.length;j++) {
					if ( resalto[j]%7==0) {
					System.out.print(" ["+ resalto[j]+ "] ");
					}else {
						System.out.print(resalto[j]+ " ");
					}
				}break;
		default: System.out.println("Por favor introduce un numero, o 5 ó 7");
	}
} //fin ejercicio16


public void ej17() {
	/*Escribe un programa que muestre por pantalla un array de 10 números enteros
	generados al azar entre 0 y 100. A continuación, el programa debe pedir
	un número al usuario. Se debe comprobar que el número introducido por
	teclado se encuentra dentro del array, en caso contrario se mostrará un
	mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario
	introduzca uno correctamente. A continuación, el programa rotará el array
	hacia la derecha las veces que haga falta hasta que el número introducido
	quede situado en la posición 0 del array. Por último, se mostrará el array rotado
	por pantalla*/
	
	int [] aleatorio= new int[10];
	int respuesta; 
	int dentro=0; 
	for (int a=0;a< aleatorio.length;a++) {
		aleatorio[a]=(int)(Math.random()*101);
	}
	for (int a: aleatorio) {
		System.out.print(a+" ");
	}System.out.println();
	do {
	System.out.println("Introduce un numero mostrado en la coleccion");
	respuesta=e.nextInt();
	for ( int q=0;q<aleatorio.length;q++) {
		if (aleatorio[q]==respuesta) {
			System.out.println("esta dentro del array... muy bien");
			dentro=1; 
			break; 
		}
	}
		if(dentro==0) {
			System.out.print("No me seas zoquete e ");
			
		}
	
	}while(dentro==0);
	if (dentro==1) {
	int inicial=aleatorio[0];
	
	
	//int [] rotado= new int [10];
	//System.arraycopy(aleatorio, 0, rotado, 0, aleatorio.length-1);
	while(aleatorio[0]!=respuesta) {
		int fin= aleatorio[aleatorio.length-1];
		
		for(int i=(aleatorio.length-1);i>0;i--) {
			aleatorio[i]=aleatorio[i-1];
		}aleatorio[0]=fin;
	}
	for(int i: aleatorio) {
		System.out.print(i+" ");
	}
	//desde aqui segunda parte quitable
	
	/*if ( respuesta==inicial) {
		System.out.println("era el primeroooo");
	}else {
		for( int q=1; q<aleatorio.length;q++) {
			if(aleatorio[q]==respuesta) {
				System.out.println("la posicion es "+q);
			}
		}
				int [] rotador= new int [10];
				System.arraycopy(aleatorio, 0, rotador, 0, aleatorio.length-1);
				//System.out.println("PINTAME CABRON");
				do{
					int t=1;
					while  ( t<rotador.length-1) {
						rotador[t-1]= rotador[(t)];
						t++;
					// System.out.print(aleatorio[t+1]);
					}
				}while(respuesta!=rotador[0]);
				for (int k: rotador) {
					System.out.print(k+" ");
				}
			
		
	//} while (respuesta!=rotado[0]);
				}*/
	
	
}// fin ejercicio17
}

 
}


