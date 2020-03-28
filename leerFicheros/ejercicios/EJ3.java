package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EJ3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		try {
		BufferedWriter bw1 = new BufferedWriter (new FileWriter("leerFicheros/frutas.txt"));
		bw1.write("Pomelo\n");
		bw1.write("Manzana\n");
		bw1.write("Uvas\n");
		bw1.close();}
		catch(FileNotFoundException e) {
			System.out.println("SIGUE SIN APARECER");
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		try {
			BufferedReader br1 = new BufferedReader (new FileReader("leerFicheros/primos.txt"));
			
			BufferedWriter bw2 = new BufferedWriter (new FileWriter("leerFicheros/mezcla2.txt"));
		
			BufferedReader br2 = new BufferedReader (new FileReader("leerFicheros/frutas.txt"));
			String linea="";
			String linea2="";
			while (linea!=null || linea2!=null ) {
				linea=br1.readLine();
				linea2=br2.readLine();
				if (linea!=null) {
					System.out.println(linea);
					bw2.write(linea+"\n");
				}
				if(linea2!=null) {
					System.out.println(linea2);
					bw2.write(linea2+"\n");
				}
				
				
			}
			bw2.close();
			br1.close();
			br2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Bloque catch generado automáticamente
			System.out.println("No se encuentra el archivo");
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		
		
		
	}

}
