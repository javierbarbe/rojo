package tema6;
 //ej18 t6
//import tema6.ArraySinElementosRepetidos;
public class Ej18SalteaNumeros {
	int [] generado= new int [11];
	int [] posiciones=new int [11];
	int [] fina=new int [generado.length];
	int [] menores=new int[generado.length];
	int [] mayores= new int [generado.length];
	int k=0,q=0;
	public Ej18SalteaNumeros() {
		
	}
	public int [] generaNumeros() {
		for (int i=0;i<generado.length;i++) {
			generado[i]=(int)(Math.random()*201+1);
			if(generado[i]<=100) {
				menores[k]=generado[i];
				k++;
			}else {
				mayores[q]=generado[i];
				q++;
			}
		}
		return generado ;
	}
	
	public int [] saltea() {
		q=0;k=0;
		for (int i=0;i<fina.length;i++) {
			if(i%2==0) {
				fina[i]=menores[q];
				q++;
			}else {
				fina[i]=mayores[k];
				k++;
			}
		}imprimeArr(fina);
		
		return fina;
	}
	public int[] imprimeArr(int [] recibido) {
		for (int i=0;i<posiciones.length;i++) {
			
			if( i==0) {
				System.out.printf("%6s","indice ");
			}
			System.out.printf("%6d",i);
		}System.out.println();
		for (int i=0;i<recibido.length;i++) {
			if (i==0) {
				System.out.printf("%6s", "valores");
			}
			System.out.printf("%6d",recibido[i]);
		}System.out.println();
		return recibido;
	}
	
}
