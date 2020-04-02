package diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		String nombre;
		int telefono;
		HashMap<String, Integer> agenda = new HashMap<String, Integer>();
		// TODO Auto-generated method stub
		do {

			System.out.println("Esta es tu agenda, elige lo que hacer hoy:");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Modifica contacto");
			System.out.println("5. Eliminar contacto");
			System.out.println("6. Salir");

			try {
				System.out.println("Opcion_");
				opcion = s.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Introduce el nombre");
					nombre = s.next();
					System.out.println("Introduce telefono");
					telefono = s.nextInt();
					if (!agenda.containsKey(nombre)) {
						agenda.put(nombre, telefono);
					} else {
						System.out.println("Ya existe un contacto con ese nombre");
					}
					break;
				case 2:
					if (!agenda.entrySet().isEmpty()) {
						for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
							System.out.println("Nombre: " + entry.getKey() + " Telefono: " + entry.getValue());
						}
					} else {
						System.out.println("La agenda esta vacia");
					}

					break;
				case 3: System.out.println("Introduce nombre a buscar");
					nombre=s.next();
					if(agenda.containsKey(nombre)) {
						System.out.println("El telefono es: "+agenda.get(nombre));
					}else {
						System.out.println("El contacto no existe");
					}
					
					break;
				case 4: System.out.println("Introduce el nombre que quieres modificar");
					nombre=s.next();
					if (agenda.containsKey(nombre)) {
						System.out.println("El contacto "+nombre +" tiene por telefono "+agenda.get(nombre));
						System.out.println("Introduce el nuevo numero");
						telefono=s.nextInt();
						agenda.put(nombre, telefono);
					}else {
						System.out.println("No existe ese contacto");
					}
				
					break;
				case 5: System.out.println("Nombre de contacto a eliminar");
						nombre=s.next();
						if(agenda.containsKey(nombre)) {
							agenda.remove(nombre);
							System.out.println("Elimninando a " +nombre);
						}else {
							System.out.println("Nombre incorrecto");
						}
				
					break;
				case 6:
					salir = true;
					break;
				default:
					break;
				}

			} catch (Exception e) {
				e.getCause();
				System.out.println(e.getCause());
				s.next();
			}
		} while (!salir);
	}

}
