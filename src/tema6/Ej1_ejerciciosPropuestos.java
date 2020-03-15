package tema6;

public class Ej1_ejerciciosPropuestos {
	/*crea una clase que cuente el numero de vocales introducidas en una cadena de textoç
	 * por teclado, independientemente de que sean mayusculas, minusculas o tengan acento
	 */
 //atributos
	String palabra;
	char letra;
	int numVocales=0;
	char vocales []= new char []{'a','e','i','o','u','A','E','I','O','U','Á','É','Í','Ó','Ú','á','é','í','ó','ú'};
	
	public Ej1_ejerciciosPropuestos(String palabra) {
		this.palabra=palabra;
		for(int i=0;i<palabra.length();i++) {
			letra=palabra.charAt(i);
			for(int j=0;j<vocales.length;j++) {
				if(letra==vocales[j]) {
					numVocales++;
				}
			}
			
		} System.out.println("Tu palabra tiene "+ numVocales+ " vocales" );
	}
	
	
	public void abecedario(String pala) {
		/*metodo que te diga cuantas veces se repite cada
		 * letra en tu String
		 */
		
		char almacen[]=new char[15];
		char abecedario []= new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	//int letrasFinales=0;
	pala.toLowerCase();
	for (int i=0;i<pala.length();i++) {
		//int cuentaLetra=0;
		letra=pala.charAt(i);
		for(int j=0;j<abecedario.length;j++) {
			if(abecedario[j]==pala.charAt(i)) {
				//int cambio=0;
				
				for (int p=0;p<almacen.length;p++) {
					almacen[i]=letra;				
			  }
				
			}
		}
		
	}
	
	for(int i=0;i<almacen.length;i++) {
		int cambio;
		int cuentaLetra=0;
		for(int j=0; j<almacen.length;j++) {
			cambio=0;
				if (cambio==0){
					 
					if(almacen[i]==almacen[j]) {
						cuentaLetra++;
						//letrasFinales++;
						cambio=1;
					}else {
						//almacen[i]=letra;
						//cuentaLetra++;
						cambio=1;
						//letrasFinales+=cuentaLetra;
					}
				}
		} System.out.println("de la letra " +almacen[i]+ " hay "+ cuentaLetra);
	}
	
	
	}// fin abecedario
	
	static void ordenaArrays() {
		
	} // fin de ordena Arrays
	
	
	
	
	
}