


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5EliminaComentarios2version {

	private static boolean salir;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la ruta al archivo a usar.\n");
		String ruta = s.next();
		boolean encontrado = true;
		if (ruta == "0") {
			System.exit(0);
			salir = true;
		}
		do {
			try {

				int guionposicion = ruta.lastIndexOf("/");
				int punto = ruta.indexOf(".");
				String nuevonombre = ruta.substring(guionposicion + 1, punto);
				String extension = ruta.substring(punto);
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("leerFicheros/" + nuevonombre + "2version" + extension));
				BufferedReader br = new BufferedReader(new FileReader("leerFicheros/ejercicios/" + ruta));
				String linea = "";
				while (linea != null) {
						System.out.println(linea);
						bw.write(linea + "\n");
					}

					linea = br.readLine();
				
				encontrado = true;
				bw.close();
				br.close();

			} catch (FileNotFoundException e) {
				e.getMessage();
				encontrado = false;
				System.out
						.println("No Se encontro tu archivo, vuelve a mirar\nIntroduzca 0 si desea salir del programa");
				ruta = s.next();
				if (ruta.equals("0")) {
					salir = true;
					encontrado = true;
				}
			} catch (IOException e) {
				e.getMessage();
				encontrado = false;

			}

		} while (!encontrado && !salir);
		if (salir == true) {
			System.out.println("Salida de programa");
		} else {
			System.out.println("Copia hecha satisfactoriamente");
		}
	}

}
