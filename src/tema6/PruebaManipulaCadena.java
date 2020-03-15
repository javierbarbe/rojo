package tema6;

public class PruebaManipulaCadena {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		ManipularCadena cad= new ManipularCadena();
		char [] culo=cad.creaCadena(6);
		culo[1]='p';
		culo[3]=')';
		System.out.println(cad.longitud(culo)+ "esto es la longitud la primera vez");
		//System.out.print(cad.leerCadena(culo)) ;
		System.out.print( " aqui escribo la cadena y añado al final el 0");
		cad.escribirCadena(culo);
		//System.out.println();
		//char [] nuevo=cad.copiaCadena(culo);
		//cad.leerCadena();
		//System.out.println(cad.longitud(culo));
		//System.out.println(cad.leerCadena(culo));
		//String ol="ola";
		//System.out.println(ol.length());
		System.out.println(cad.escribirCadena(culo));
		culo[4]='@';
		//cad.escribirCadena(nuevo);
		//cad.escribirCadena(culo);
		//cad.esVocal(cad.leerCadena());
		//cad.eliminarVocales(cad.leerCadena());
		//cad.leerCadena();
		//cad.contieneCadena(cad.leerCadena2());
		cad.esPalindromo(cad.leerCadena2());
	}

}
