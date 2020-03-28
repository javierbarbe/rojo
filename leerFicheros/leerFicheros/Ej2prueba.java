package leerFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ej2prueba {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		// TODO Apéndice de método generado automáticamente
		System.out.print("Introduce el nombre del archivo: ");
		String nombrefich=s.next();
		try{
			BufferedReader buf= new BufferedReader(new FileReader(nombrefich));
			
			String linea="0";
			int i=0;
			double suma=0;
			while (linea != null) { 
				i++;
				suma += Double.parseDouble(linea);
				linea = buf.readLine();
				} 
			
			
			buf.close();
			System.out.printf("La media es %.2f",suma/i);
			
		}
		catch (IOException e) {
			System.out.println("Hubo un error");
		}
		
		
		
		
	}

}
