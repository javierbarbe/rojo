package diccionarios;
import java.util.*;
import java.util.HashMap;

public class Ej10_diccionarioIngles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir=false;
		int opcion=0;
		String palabra="";
		Scanner e = new Scanner(System.in);
		HashMap <String,String> larousse = new HashMap<String,String>();
 		larousse.put("juego","boardgame");
 		larousse.put("mamada", "blowjob");
 		larousse.put("fiebre", "fever");
 		larousse.put("frontera", "boundary");
 		larousse.put("papel_higienico","toilet_paper");
 		larousse.put("prohibir","forbid");
 		
 		System.out.println("Bienvenido al diccionario Larousse Edicion CoVid19");
 		do{System.out.println("Por favor, introduce el término en Castellano que desee consultar para ver su"
 				+ " homólogo en lengua inglesa");
 		
 		palabra=e.next();
 		if( larousse.containsKey(palabra)) {
 			System.out.println("El significado de '"+ palabra +"' en la lengua de Shakespeare es : "+ larousse.get(palabra));
 			System.out.println("Si desea salir pulse 0;\nSi desea realizar otra consulta pulse 1");
 			opcion=e.nextInt();
 			switch (opcion) {
 			case 0: salir=true;
 			System.out.println("Hasta pronto");
 			break;
 			case 1: salir=false;
 			break;
 			default: System.exit(0);
 			break;
 			}
 		
 		
 		}else {
 			System.out.println("La palabra buscada no se encuentra aún en nuestro diccionario."
 					+ "\nGracias!!");
 			System.out.println("Si desea salir pulse 0;\nSi desea realizar otra consulta pulse 1");
 			opcion=e.nextInt();
 			switch (opcion) {
 			case 0: salir=true;
 			System.out.println("Hasta pronto");
 			break;
 			case 1: salir=false;
 			break;
 			default: System.exit(0);
 			break;
 			}
 		}
 		}while (salir == false);
	}

}
