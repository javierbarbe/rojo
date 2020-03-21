package lista;

import java.util.*;
import java.util.InputMismatchException;

public class Ej13_GestesimalMejorado_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int opcion = 0;
		String codigo = "";
		int cantidadStock;
		boolean modificable = false;
		boolean salir = false;
		boolean errores = false;
		ArrayList<Articulo> almacen = new ArrayList<Articulo>();
		almacen.add(new Articulo("3335E", "Chubasquero", 36.5, 66, 1));
		almacen.add(new Articulo("3325E", "Mascarillas", 12.5, 32, 3));
		almacen.add(new Articulo("33", "Pantalones color beige", 14.5, 16, 5));
		HashMap<String, Integer> despensa = new HashMap<String, Integer>();
		despensa.put("zapatillas", 1);
		int incorrecto = 0;
		despensa.put("zapatillas negras", 1);
		boolean eliminado = false;
		do {
			System.out.println("Bienvenido a Gestesimal");
			System.out.println("=========================");
			System.out.println("1. Lista de articulos");
			System.out.println("2. Alta de articulos");
			System.out.println("3. Baja de articulos");
			System.out.println("4. Modificacion de articulos");
			System.out.println("5. Entrada de mercancias");
			System.out.println("6. Salida de mercancias");
			System.out.println("7. Salir");
//System.out.println(almacen.get(1));
			System.out.println("Qué opción eliges: ");
			opcion = e.nextInt();
			switch (opcion) {
			case 1:// System.out.println(almacen);
				for (Articulo u : almacen) {
					System.out.println(u);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Bloque catch generado automáticamente
						e1.printStackTrace();
					}
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Bloque catch generado automáticamente
					e1.printStackTrace();
				}
				break;

			case 2:
				Articulo nuevo = new Articulo();
				Menu mimenu= new Menu();
				System.out.println("Introduce el codigo de articulo");
				codigo = e.nextLine();
				codigo = e.nextLine();

				for (int i = 0; i < almacen.size(); i++) { // codigo de articulo repetido en
					// un arraylist
					Articulo comp = almacen.get(i);
					do {
						if (comp.getCodigo().equals(codigo)) {
							System.out.println(
									"Por favar el codigo ya existe\nIntrodue " + "un código ditinto a estos: ");
							for (int j = 0; j < almacen.size(); j++) {
								System.out.print(almacen.get(j).getCodigo() + " - ");
							}
							codigo = e.next();
						}
					} while (comp.getCodigo().equals(codigo));
				}
				nuevo.setCodigo(codigo);
				System.out.println("Introduce descripcion");
				nuevo.setDescripcion(e.nextLine());
				nuevo.setPrecioCompra(mimenu.establecePrecio());
				nuevo.setPrecioVenta(mimenu.establecePrecioVenta());
				nuevo.setStock(mimenu.estableceStock());
				// INTENTANDO SIMPLIFICAR CODIGO
				// METIENDOLO CON FUNCIONES DE OTRA CLASE
//			System.out.println("Introduce precio Compra");
//			do {
//			try {
//			nuevo.setPrecioCompra(e.nextDouble());
//			incorrecto=0;
//			
//			}catch (InputMismatchException e3) {
//				System.out.println("Por favor, introduce un numero");
//				e.nextLine();
//				incorrecto=1;
//			}}while (incorrecto==1);

//			double precioV=e.nextDouble();
				
				almacen.add(nuevo);

				break;
			case 3:
				System.out.println("Introduce el codigo del articulo a dar de baja del sistema");

				codigo = e.next();
				for (int i = 0; i < almacen.size(); i++) {
					Articulo aux = almacen.get(i);
					if (aux.getCodigo().equals(codigo)) {
						System.out.println("Eliminando articulo");
						almacen.remove(i);
						eliminado = true;
					}
				}
				if (eliminado == false) {
					System.out.println("El codigo no se encuentra");
				}
				break;
			case 4:
				System.out.println("Introduce el código del articulo a modificar");
				for (int i =0; i<almacen.size();i++) {
					System.out.print(almacen.get(i).getCodigo()+"--");
				}
				codigo = e.next();
				Menu mimenu2= new Menu();
				for (int i = 0; i < almacen.size(); i++) {
					Articulo aux = almacen.get(i);
					if (aux.getCodigo().equals(codigo)) {
						System.out.println("Qué deseas modificar:");
						System.out.println("1. Precio Venta");
						System.out.println("2. Precio Compra");
						System.out.println("3. Descripcion");
						System.out.println("4. Stock");
						System.out.println("5. Código");
						opcion = e.nextInt();
						switch (opcion) {
						case 1: aux.setPrecioVenta(mimenu2.establecePrecioVenta());
//							System.out.println("Nuevo precio venta");
//							aux.setPrecioVenta(e.nextDouble());
							break;
						case 2:
							System.out.println("Nuevo precio compra");
							aux.setPrecioCompra(mimenu2.establecePrecio());
							break;
						case 3:
							System.out.println("Descripcion");
							aux.setDescripcion(e.nextLine());
							break;
						case 4:
							System.out.println("Stock ACTUAL " + aux.getStock());
							aux.setStock(mimenu2.estableceStock());
							break;
						case 5:
							System.out.println("Codigo");
							codigo = e.next();
							for (int q= 0; q < almacen.size(); q++) {
								Articulo aux3 = almacen.get(q);
								while (aux3.getCodigo().equals(codigo)) {
									
									System.out.println("el codigo no puede coincidir con el de otro articulo"
											+ "\nIntroduce otro por favor");
									codigo=e.next();
									}
								}
							aux.setCodigo(codigo);
							break;
						}
						modificable = true;
					}
				}
				if (modificable == false) {
					System.out.println("le codigo no era correcto");
				}
				break;

			case 5: boolean codigo2= false;
				System.out.println("Introduce el codigo del articulo que quieras aumentar stock");
				codigo = e.next();
				for (int i = 0; i < almacen.size(); i++) {
					Articulo aux = almacen.get(i);
					if (aux.getCodigo().equals(codigo)) {
						System.out.println("Actualmente hay " + aux.getStock() + " unidades\nDi "
								+ "la cantidad a aumentar del stock");
						aux.aumentaStock(e.nextInt());
						codigo2=false;
						System.out.println("La cantidad de este articulo ahora es de " + aux.getStock());
					} else {
						codigo2=true;
						
					}
				}if(codigo2) {
					System.out.println("Lo lamento el codigo introducido es erróneo");
				}
				break;

			case 6:
				System.out.println("Qué articulo venderemos hoy??\nDime el codigo");
				codigo = e.next();
				for (int i = 0; i < almacen.size(); i++) {
					Articulo aux = almacen.get(i);
					if (aux.getCodigo().equals(codigo)) {
						System.out.println("actualmente hay " + aux.getStock());
						if (aux.getStock() < 1) {
							System.out.println("Lo siento no hay unidades disponibles" + "de ese articulo");
							salir = true;
						}
						if (!salir) {
							System.out.println("Cuantas unidades desea vender?");
							int venta= e.nextInt();
							if(aux.getStock()-venta>-1) {
							aux.vendeStock(venta);
							System.out.println("Quedan en stock : " + aux.getStock());
						}else {
							System.out.println("Lo siento no hay suficientes unidades\n"
									+ "Usted queria "+ venta+ " y quedan "+ aux.getStock());
						}
						}
					}
				}
				break;

			}// fin de switch

		} while (opcion != 7);
	}

}

 class  Menu {
	Articulo nuevo = new Articulo();
	Scanner e = new Scanner(System.in);
	int incorrecto;
	int cantidadStock; 
	public  double establecePrecio() {
		do {
			try {
				do {
				System.out.println("Introduce precio Compra valido");
				nuevo.setPrecioCompra(e.nextDouble());
				}
				while(nuevo.getPrecioCompra()<0);
				incorrecto = 0;

			} catch (Exception e3) {
				System.out.println("Por favor, introduce un numero");

				e.nextLine();
				incorrecto = 1;
			}
		} while (incorrecto == 1);
	return nuevo.getPrecioCompra();
	}

	public  double establecePrecioVenta() {
		
		do {
			try {
				do {System.out.println("Introduce ahora precio venta al publico");
				nuevo.setPrecioVenta(e.nextDouble());
				}while(nuevo.getPrecioVenta()<0);
				incorrecto = 0;
			} catch (Exception es) {
				System.out.println("No has dado un valor de precio valido");
				e.nextLine();
				incorrecto = 2;
			}
		} while (incorrecto != 0);
		return nuevo.getPrecioVenta();
	}

	public int estableceStock() {
		do {
			try {
				System.out.println("Introduce el Stock en el almacen");
				cantidadStock = e.nextInt();
				while (cantidadStock < 1) {
					System.out.println("introduce una cantidad de stock valida");
					cantidadStock = e.nextInt();
					incorrecto = 0;
				}
				nuevo.setStock(cantidadStock);
				incorrecto = 0;
			} catch (Exception es) {
				e.nextLine();
				System.out.println("No has introducido un número entero");
				incorrecto = 3;
			}
		} while (incorrecto != 0);
		return nuevo.getStock();
	}
}
