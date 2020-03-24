package rehechosListasDiccionarios;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej6Acceso {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		HashMap <String, String> acceso= new HashMap<String,String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido al programa de acceso AreaRestringida\n"
				+ "\tPor favor introduzca usuario y contraseña");
		int intentos=0;
		boolean dentro=false;
		Pattern p= Pattern.compile("[0-9]*");
		String usuario="", contrasenia="";
		acceso.put("Javier","contraseña");
		acceso.put("profesor", "claveprofe");
		do{
			System.out.println("Introduce tus datos ");
			System.out.println("======================");
			intentos++;System.out.println("Nombre usuario: ");
			
			usuario=s.next();
			Matcher m= p.matcher(usuario);
			if( m.find()) {
				System.out.println("Nombres sin numeros, por favor");
			}else {
			if( acceso.containsKey(usuario)) {
//				System.out.println("el usuario existe");
//				System.out.println("la clave de acceso es " +acceso.get(usuario));
				System.out.println("Password: ");
				contrasenia=s.next();
				if ( acceso.get(usuario).equalsIgnoreCase(contrasenia)) {
					System.out.println("La contraseña es correcta");
					dentro=true;
				}else {
					System.out.println("Contraseña incorrecta\n");
				}
			}else {
				System.out.println("El usuario no existe\n");
			}}
		}while(intentos<3 && !dentro);
		
		if( dentro) {
		System.out.println("Bienvenido al AreaRestringida");
		}else {
		
			System.out.println("No tiene acceso al AreaRestringida");
		}
		
	}

}
