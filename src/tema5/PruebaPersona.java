package tema5;
import java.util.*;
import  funcionesLibro200.*;

public class PruebaPersona {
	private static int mayoresEdad=0;
	private static int cuentaMayores(Persona a) {
		
		if (a.getEdad()>17) {
			mayoresEdad++;
		}else {
			return mayoresEdad;
		}
		return mayoresEdad;
	}
 
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner e= new Scanner(System.in);
		Persona a1 =new Persona();
		System.out.println("dime tu edad");
		char sexo;double peso;
		String sexo2;
		int edad; double altura; String dni="";String nombre="";
		/*edad=e.nextInt();
		a1.setEdad(edad);
		System.out.println("dime tu nombre");
		nombre=e.next();
		a1.setNombre(nombre);
		; 
		System.out.println("dime que altura tienes");
		altura=e.nextDouble();
		a1.setAltura(altura);
		System.out.println("Dime tu dni");
		dni=e.next();
		a1.setDni(dni);
		
		System.out.println("Dime tu sexo");
		sexo2=e.next();
		sexo=sexo2.charAt(0);
		a1.setSexo(sexo);
		System.out.println("dime tu peso");
		peso=e.nextDouble();
		a1.setPeso(peso);*/
		Persona a2=new Persona( "javier","09069554X",27,'P',100,1.98);
		System.out.println(a2.calculaMasa());
		System.out.println(a2.valoracion());
		//System.out.println(a2.getValoracion());
		//a2.sexo();
		//System.out.println(a2.getSexo());
		System.out.println(cuentaMayores(a2));
		System.out.println(cuentaMayores(a1));
		System.out.println(a2.toString());
	}

}
