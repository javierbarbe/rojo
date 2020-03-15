package ejerciciosLibro200;
import java.util.Scanner;
public class CuentaNumeros {

	private String numero;
	Scanner e=new Scanner(System.in);
	public CuentaNumeros() {}
	
	public void cuentaDigitos() {
		
		System.out.println("Introduce numero ");
		numero=e.nextLine();
		int coma=numero.indexOf('.');
		while (coma!=-1) {
			System.out.println("Introduzca formato numero incorrecto. Use coma para decimales");
			numero=e.nextLine();
			 coma=numero.indexOf('.');
		}
		int decimal=numero.indexOf(',');
		int longitud=numero.length();
		if (decimal<0) {
			System.out.println("el numero de digitos es "+ (longitud));
		}	else {
			 System.out.println("la longitud de digitos es "+ (longitud-1));
		}
		
		
	}
	public void pasaANumero() {
		System.out.println("Introduce cadena de numeros");
		String cadena;
		cadena=e.next();
		int numero=Integer.parseInt(cadena);
		System.out.println(numero + 45);
		System.out.println(cadena+45);
	}
}
