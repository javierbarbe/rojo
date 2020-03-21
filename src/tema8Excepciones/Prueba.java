package tema8Excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner e= new Scanner(System.in);
		System.out.println(" introduce un numero");
		BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
		try {
			String numero= teclado.readLine();
			int pasado= Integer.parseInt(numero);
			double minumero= e.nextDouble();
		} catch (IOException er) {
			// TODO Bloque catch generado automáticamente
			
			System.out.println("Error al leer del teclado");
		}catch (NumberFormatException e2) {
			System.out.println("numero entre 0 y 100");
		}catch (InputMismatchException e2) {
			System.out.println("por favor numeros solo");
		}
System.out.println("seguimos con el programa");
System.out.println("introduce dos numeros");
System.out.println("Este programa calcula la media de dos números");
try {
	int primero= e.nextInt();
}
catch (Exception es){
	System.out.println("un numero maricona");
}
try {
	System.out.println("segundo numero");
	int num2=e.nextInt();
}catch (Exception es){
	System.out.println("un numero hosmosexual");
}
boolean datoValido = false;

double numero1 = 0;

//do {
  try {
    System.out.print("Introduzca el primer número: ");
    numero1 = Double.parseDouble(e.nextLine());
    datoValido = true;
  } catch (Exception es) {
    System.out.print("El dato introducido no es correcto, debe ser un número.");
    System.out.println(" Por favor, inténtelo de nuevo.");
  }
//} while (!datoValido);

double numero2 = 0;

//do {
  try {
    datoValido = false;
    System.out.print("Introduzca el segundo número: ");
    numero2 = Double.parseDouble(e.nextLine());
    datoValido = true;
  } catch (Exception es) {
    System.out.print("El dato introducido no es correcto, debe ser un número.");
    System.out.println(" Por favor, inténtelo de nuevo.");
  }
//} while (!datoValido);

System.out.println("La media es " + (numero1 + numero2) / 2);

	}

}
