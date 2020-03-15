package tema7;

public class Ej29a34 extends Ej20a28{
	int m, n;
	int [] [] obe;
	int [] fila;
	public Ej29a34() {
		
	}
	public int [][] generaArrayBilInt(int n , int m,int max,int min) {
		this.n=n;
		this.m=m;
		obe= new int [n][m];
		for (int i=0;i<obe.length;i++) {
			for (int j=0;j<obe[i].length;j++) {
				obe[i][j]=(int)(Math.random()*(max-min)+min);
			}
		}
		return obe;
	}
	
	public int [] filaBilInt( int fila, int [] [] recibido) {
		this.fila=new int [recibido.length];
		for(int j=0;j<recibido[fila].length;j++) {
			this.fila[j]= recibido[fila][j];
//			System.out.println(recibido[fila][j]);
		}
	System.out.println();
		return this.fila;
		
	}
	public int [] columnaBilInt( int colum, int [] [] recibido) {
		int [] columna= new int [recibido[0].length];
		for (int i =0; i<recibido.length;i++) {
			columna [i]= recibido[i][colum];
		}
		System.out.println();
		return columna;
	}
	
	public int [] coordenadasArrayBil(int buscado, int [] [] recibido) {
		String solucion="";
		boolean salir=false;
		int [] nocoincide= new int [2];
		boolean coincide=false;
		for (int i = 0; i<recibido.length;i++) {
			for (int j=0; j < recibido[i].length;j++) {
				if (salir==false) {
				if(buscado== recibido[i][j]) {
					solucion= "La fila es "+ i+"\nLa columna es: "+j;
					nocoincide[0]=i;
					nocoincide[1]=j;
					coincide=true;
					salir=true;
				}
				}
			}
		}if (coincide==false) {
			int i=-1;
			int j=-1;
			nocoincide[0]=i;
			nocoincide[1]=j;
		}
		System.out.println(solucion);
		
		return nocoincide ;
	}
	public void imprimeDOble (int [] [] recibido) {
		for(int i=0;i<recibido.length;i++) {
			for(int j=0; j< recibido[i].length;j++) {
				System.out.printf("%4d", recibido[i][j]);
			}System.out.println();
		}
	}
	public String puntoDesilla(int [] [] recibido,int buscado) {
		boolean menor=false,salir=false,mayor=false;
		String respuesta;
		int [] coordena= coordenadasArrayBil(buscado,recibido);
		if (coordena [0]!=-1) {
			int i= coordena[0];
				for (int j= 0; j<recibido[i].length;j++) {
					if (salir==false) {
						if(buscado<=recibido[i][j]) {
							 menor=true;
						}else {
							menor=false;
							salir=true;
						}
					}
				}
			int j= coordena[1];
			for ( i= 0; i<recibido.length;i++) {
				if (salir==false) {
					if (buscado>=recibido[i][j]) {
						mayor=true;
					}else {
						mayor=false;
						salir=true;
					}
				}
			}
		
		}else{
			System.out.println("el numero no esta");
			}
		if(menor==true && mayor==true) {
			 respuesta ="El numero es punto de silla";
		}else {
			respuesta="El numero no es punto de silla";
		}
		
		return respuesta;
	}
			
}
