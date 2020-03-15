package tema6;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManipularCadena {

	Scanner e=new Scanner(System.in);
	//atributos 
	private int tamanio; 
	private String cadeno="";
	char[] cadena;
	
	public char[]  creaCadena(int tamanio) {
		this.tamanio=tamanio+1;
		char[] cadena= new char [this.tamanio];
		return cadena;
	}
	public void constructorCopia( ManipularCadena un) {
		this.tamanio=un.tamanio;
		
	}
public char [] leerCadena2() {
		
		System.out.println("Introduce la cadena de texto");
		String cad= e.nextLine();
		//System.out.println(cad);
		char []cade= new char [cad.length()];
		for (int i=0;i<cade.length;i++) {
			
			cade[i]=cad.charAt(i);
			
		}		
		
			System.out.println(cade);		
		return cade;
	}
	
	public char [] leerCadena() {
		
		System.out.println("Introduce la cadena de texto");
		String cad= e.nextLine();
		//System.out.println(cad);
		char []cade= new char [cad.length()+1];
		for (int i=0;i<cade.length;i++) {
			if(i<cade.length-1) {
			cade[i]=cad.charAt(i);
			}/*else {
				cade[i]='P';
			}*/
		}		
		cade [cade.length-1]=('\0');
			System.out.println(cade);		
		return cade;
	}
	public char [] escribirCadena(char[] cad) {
		//System.out.println(sb);
		for(int i=0;i<cad.length;i++) {
			System.out.print(cad[i]);
		}
		return cad;
	}
	
	public int longitud(char[]  sb) {
		int cantidad=0;
		cantidad=sb.length;
		
		return cantidad;
	}
	
	public char [] copiaCadena(char [] cad) {
		char [] nueva= new char [cad.length] ;
		System.arraycopy(cad, 0, nueva, 0, cad.length);	
		
		return nueva;
	}
	
	public boolean esVocal (char [] cad) {
		String n="";
		
		for (int i=0;i<cad.length;i++) {
			 n += String.valueOf(cad[i]);
		}
	boolean voc=false;
	System.out.println("indica la posicion de la cadena que quieres comprobar como vocal");
	int num=e.nextInt();
	while (num>=n.length()) {
		System.out.println("Por favor, se ha salido del rango. Vuelva a probar");
		 num=e.nextInt();
	}
	
	Pattern vocales= Pattern.compile("[aeiou]");
	Matcher m=vocales.matcher(String.valueOf(n.charAt(num)));
	
	if (m.find()) {
		voc=true;
	}
	System.out.println(voc);
	return voc;
	}
	
	public char[] eliminarVocales(char [] cadena) {
		Pattern vocales= Pattern.compile("[aeiou]");
		String nuevo=cadenaAString(cadena);
		Matcher m=vocales.matcher(nuevo);
		String resultado=m.replaceAll("");
		char[] sin=stringACadena(resultado);
		System.out.println(sin);
		return sin;
	}
	
	public boolean contieneCadena(char [] recibida) {
		boolean cad=false;
		System.out.println("introduce para ver si contiene a " +cadenaAString(recibida));
		String metidaString=cadenaAString(recibida);
		char[] teclado=leerCadena();
		Pattern pasada=Pattern.compile(metidaString);
		String tecladoString=cadenaAString(teclado);
		Matcher m=pasada.matcher(tecladoString);
		if(m.find()==true) {
			cad=true;
		}
		System.out.println(cad);
		return cad;
	}

	public char[] stringACadena(String string) {
		char [] cambio=new char [string.length()];
		for (int i=0;i<string.length();i++) {
			cambio[i]=string.charAt(i);
		}
		return cambio;
	}
	
	public String cadenaAString(char [] cad) {
			String n="";
		
		for (int i=0;i<cad.length;i++) {
			 n += String.valueOf(cad[i]);
		} return n;
	}
	
	public char [] convertirAMayus(char[] entrada) {
		String linea=cadenaAString(entrada);
		String mayusc=linea.toUpperCase();
		char [] mayusculas= stringACadena(mayusc);
		System.out.println(mayusculas);
		return mayusculas;
	}
	
	public boolean esPalindromo(char[] entrada) {
		boolean palindromo=false;
		String convertido=	cadenaAString(entrada);
				
			StringBuilder invertido=new StringBuilder();
			for (int i=entrada.length-1;i>=0;i--) {
				invertido.append(entrada[i]);
			}
			String inver=invertido.toString();
				
			/*	invertido=conversion.reverse();
			conversion.reverse();*/
			if(inver.equals(convertido)) {
				palindromo=true;
			}
				System.out.println(palindromo);
		return palindromo;
	}
}


