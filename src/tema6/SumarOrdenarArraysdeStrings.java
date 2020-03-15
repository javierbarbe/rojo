package tema6;

public class SumarOrdenarArraysdeStrings {
	public  static String[] primero=new String[3];
	public  static String[] segundo=new String[3];
	
	
	public static String[] tercero=new String[primero.length+segundo.length];
	static String temp="";
	
	//inicializando Arrays
	 static StringBuilder cad1[]=new StringBuilder [3];
	 static StringBuilder cad2[]=new StringBuilder [3];
	 static StringBuilder cad3[]=new StringBuilder [3];
	static void creaCadenas() {
		cad1[0]=new StringBuilder("marta");
		cad1[1]=new StringBuilder("paula");
		cad1[2]=new StringBuilder("Carlos");
		cad2[0]=new StringBuilder("Cristina");
		cad2[1]=new StringBuilder("Veronica");
		cad2[2]=new StringBuilder("Estefania");
	
	}
	
	
	
		
		
		
		public void inicializaArrays(){
				primero[0]="Zarlos";
				primero[1]="Pepe";
				primero[2]="Ana";
				//return primero;
				segundo[0]="Monica";
				segundo[1]="Cristina";
				segundo[2]="Jose";
				
				
		}
		public  String[] ordenaArray(String[] array) {
			for(int j=0;j<array.length;j++) {
				for(int i=0;i<array.length-1;i++) {
					for (int k=0;k<array[i].length()-1;k++) { //quitable intento de que sea por todas las letras
															// no solo por la primera 
						if(array[i].charAt(k)>array[i+1].charAt(k)) {
							
							temp=array[i];
							array[i]=array[i+1];
							array[i+1]=temp;
						}
					} // quitable referencia al for k=0
				}
			}
			
			return array;
		}
		
		public  String[] imprimeArray(String[] primero) {
			
			for (int i=0;i<primero.length;i++) {
				System.out.print(primero[i]+ " ");
			}return primero;
		}
		
		
		
		public  String[] sumaArrays() {
			for(int i=0;i<primero.length;i++) {
				
					tercero[i]=primero[i];
				
			}int p=3;	
			while (p<tercero.length) {
					for(int q=0;q<segundo.length;q++) {
						
							tercero[p]=segundo[q];
							p++;
				//
					}
			}
			return tercero;
		
		
	}//fin de ordenaCadenas
	
	
	
} // fin array cadenas
