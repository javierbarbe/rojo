package lista;

import java.util.*;
import java.util.HashMap;

/*
 * pedir un nombre de usuario y una contrase�a. Si el usuario introduce los
datos correctamente, el programa dir� �Ha accedido al �rea restringida�. El
usuario tendr� un m�ximo de 3 oportunidades. Si se agotan las oportunidades
el programa dir� �Lo siento, no tiene acceso al �rea restringida�. Los nombres
de usuario con sus correspondientes contrase�as deben estar almacenados
en una estructura de la clase HashMap.
 */
public class Ej6_AreaRestringida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner (System.in);
boolean acceso=false;
int intentos=0; 
		HashMap <String,String> usuarios = new HashMap <String,String>();
		usuarios.put("javier", "123contra");
		usuarios.put("alex","456contra");
		System.out.println("Bienvenido al programa de acceso AreaRestringida\n"
				+ "\tPor favor introduzca usuario y contrase�a");
	do {
		
		System.out.println("Usuario: ");
		String usuario= e.next();
		System.out.println("Contrase�a: ");
		String contrasenia= e.next();
		intentos ++;
//		System.out.println(usuarios.get(contrasenia)); //el valor de la clave 123
		
		
		if (usuarios.containsKey(usuario)) { // el usuario existe
			if (usuarios.get(usuario).equals(contrasenia)) { 
				//compara del mapa usuarios 
				//el value de la clave usuario con la contrase�a
			System.out.println("Ha accedido al �rea restringida");
			acceso=true;
			
			} else {
			System.out.println("Contrase�a incorrecta");
			}
			} else { // el usuario no existe
			System.out.println("El usuario introducido no existe");
			}
		
		
		if(usuarios.containsKey(contrasenia)) {
			System.out.println(usuarios.get(contrasenia));
		}
				
		
		if(usuarios.containsKey(usuario) ) {// && usuarios.containsValue(contrasenia)) {
		if (usuarios.get(usuario).contentEquals(contrasenia)) {
			
			System.out.println("Access granted");
		}
		else {
			System.out.println("Access denied");
			System.out.println("Contrase�a incorrecta mia");
//			System.out.println(usuarios.get(usuario)+ " es la correspondiente a "+ usuarios.keySet());
		}
//		System.out.println(usuarios);
	}else {
		System.out.println("nombre no encontrado");
	}
		}while(intentos<3 && !acceso);
	}
}
