package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ej6CuentaOcurrencias {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Apéndice de método generado automáticamente
		System.out.println("Introduce en nombre del archivo");
		String nombre=s.next();
		System.out.println("Introduce palabra a buscar");
		String palabra=s.next();
		int contador=0;
		ArrayList <String> palabras= new ArrayList<String>();
		String [] lista ;
	
		try {
			BufferedReader br= new BufferedReader(new FileReader("leerFicheros/ejercicios/"+nombre));
			String linea="";
			while(linea!=null) {
				Pattern pat= Pattern.compile(palabra);
				
				 lista=(linea.split(" "));
				
				
				 for(int i=0; i<lista.length;i++) {
					 Matcher mat = pat.matcher(lista[i]);
					 if(mat.find()) {
//					
						 contador++;
					 }
				 }

				 System.out.println(linea);

				linea=br.readLine();
			}
			System.out.println(contador);
			
			
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("me come un huevo");
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println(e.getCause());
		}
		
		
		
		
		
	}

}
