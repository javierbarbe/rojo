package funcionesLibro200;
import java.util.*;
 public class Ejercicio1a14 {
	 static String  volteadoFinal="";
		private int num1, num2;
		 Scanner e=new Scanner(System.in);
	
		public static void juntaNumeros(int num1, int num2) {
		
				String num1s=Integer.toString(num1);
				String num2s=Integer.toString(num2);
				String numFinal=num1s+num2s;
				int numF=Integer.valueOf(numFinal);
				System.out.println(numF);
				}
	
	public static long volteaNumero(long numero) {
			//System.out.println("Intruce numero");
			//long num=e.nextLong();
			 volteadoFinal="";
			String numS=Long.toString(numero);
			for(int i=numS.length()-1;i>=0;i--) {
				String volteado=Character.toString(numS.charAt(i));
				 volteadoFinal+=volteado;
			}    long volteado3=Long.parseLong(volteadoFinal);
			//System.out.println(volteado3+" esto esta volteado");
			return volteado3;
			
		} //fin voltea
	
	public static boolean esCapicua(long numero2) {
		boolean capicua=true;
			
			long volteado4=volteaNumero(numero2);
			
			if(volteado4==numero2) {
				System.out.println("el numero " +numero2 +" es capicua");
			}else {
				System.out.println("el numero "+ numero2 + " no es capicua");
				capicua=false;
			}return capicua;
	}// fin esCapicua
	
	
	public static boolean esPrimo(int num1) {
			boolean primo=true;
			int acumulador=0;
			for(int i=2; i<num1; i++) {
				if(num1%i==0) {
					 acumulador=1;
					
					primo=false;
				}
			} if(acumulador!=0) {
				System.out.println("el numero no es primo");
			}else {
				System.out.println("el numero es primo");
				}
			
			return primo;
	} //fin de esPrimo
	
	
	public  char digitoR(long numero) {
		String numeroS=Long.toString(numero);
		System.out.println("elige la posicion que quieras extraer un digito");
		int posDigito=e.nextInt();
		 char digito=numeroS.charAt(posDigito);
		// int numero5=(int) digito;
		 //System.out.println(digito +" esto es el digito buscado");
		// System.out.println(numeroS.charAt(posDigito));
		 return digito;
	}
	
	public int posDigito(long numero) {
		String numeroS=Long.toString(numero);
		System.out.println("de tu numero "+numero+" di digito que deseas buscar en el numero");
		String numeroBuscado=e.next();
		int posicion= numeroS.indexOf(numeroBuscado)+1; 
		if(posicion<1) {
			System.out.println("no se encuentra");
		}
		return posicion;
	}
	
	public static int cuentaDigitos(int numero) {
		int numeroDividido=numero;
		int contador=0;
		while ( numeroDividido>0) {
			numeroDividido=numeroDividido/10;
			contador++;
		}System.out.println(contador+ " tu numero "+numero+" tiene esos digitos");
		return contador;
	}
	
}// fin del ejercicio1a14
