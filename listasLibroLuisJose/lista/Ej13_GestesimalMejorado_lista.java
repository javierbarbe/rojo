package lista;

import java.util.*;

public class Ej13_GestesimalMejorado_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int opcion = 0;
		String codigo = "";
		boolean modificable=false;
		ArrayList<Articulo> almacen = new ArrayList<Articulo>();
		almacen.add(new Articulo("3335E", "Chubasquero", 36.5, 66, 1));
		almacen.add(new Articulo("3325E", "Mascarillas", 12.5, 32, 3));
		almacen.add(new Articulo("33", "Pantalones color beige", 14.5, 16, 5));
		HashMap<String, Integer> despensa = new HashMap<String, Integer>();
		despensa.put("zapatillas", 1);
		despensa.put("zapatillas negras", 1);
		boolean eliminado=false;
		do {
		System.out.println("Bienvenido a Gestesimal");
		System.out.println("=========================");
		System.out.println("1. Lista de articulos");
		System.out.println("2. Alta de articulos");
		System.out.println("3. Baja de articulos");
		System.out.println("4. Modificacion de articulos");
		System.out.println("5. Entrada de mercancias");
		System.out.println("6. Salida de mercancias");

		System.out.println("Qué opción eliges: ");
		opcion = e.nextInt();
		switch (opcion) {
		case 1:// System.out.println(almacen);
			for (Articulo u : almacen) {
				System.out.println(u);
			}
			break;

		case 2:Articulo nuevo= new Articulo();
			System.out.println("Introduce el codigo de articulo");
			codigo = e.nextLine();
			codigo = e.nextLine();
 
			for (int i = 0; i < almacen.size(); i++) { //codigo de articulo repetido en
				//un arraylist
				Articulo comp = almacen.get(i);
			do {	
				if (comp.getCodigo().equals(codigo)) {
					System.out.println("Por favar el codigo ya existe\nIntrodue "
							+ "un código ditinto a estos: ");
					for(int j=0; j<almacen.size();j++) {
						System.out.print( almacen.get(j).getCodigo()+" - ");
					}
					codigo=e.next();
				}
			}while (comp.getCodigo().equals(codigo));
			}
			nuevo.setCodigo(codigo);
			System.out.println("Introduce descripcion");
			nuevo.setDescripcion(e.nextLine());
			System.out.println("Introduce precio Compra");
			nuevo.setPrecioCompra(e.nextDouble());
			System.out.println("Introduce ahora precio venta al publico");
			nuevo.setPrecioVenta(e.nextDouble());
			System.out.println("Introduce el Stock en el almacen");
			nuevo.setStock(e.nextInt());
			
			almacen.add(nuevo);
			
			
			break;
		case 3: System.out.println("Introduce el codigo del articulo a dar de baja del sistema");
		 
			codigo=e.next();
			for(int i=0; i<almacen.size();i++) {
				Articulo aux= almacen.get(i);
				if(aux.getCodigo().equals(codigo)) {
					System.out.println("Eliminando articulo");
					almacen.remove(i);
					eliminado=true;
				}
			}if(eliminado==false) {
				System.out.println("El codigo no se encuentra");
			
		}  break;   
		case 4: 
			System.out.println("Introduce el código del articulo a modificar");
		codigo=e.next();
		for( int i =0; i<almacen.size();i++) {
			Articulo aux= almacen.get(i);
			if(aux.getCodigo().equals(codigo)) {
				System.out.println("Qué deseas modificar:");
				System.out.println("1. Precio Venta");
				System.out.println("2. Precio Compra");
				System.out.println("3. Descripcion");
				System.out.println("4. Stock");
				System.out.println("5. Código");
				opcion=e.nextInt();
				switch (opcion) {
				case 1: System.out.println("Nuevo precio venta");
				aux.setPrecioVenta(e.nextDouble());
				break;
				case 2 : System.out.println("Nuevo precio compra");
				aux.setPrecioCompra(e.nextDouble());
				break;
				case 3: System.out.println("Descripcion");
				aux.setDescripcion(e.nextLine());
				break;
				case 4 : System.out.println("Stock ACTUAL "+ aux.getStock());
				aux.setStock(e.nextInt());
				break;
				case 5: System.out.println("Codigo");
				aux.setCodigo(e.next());
				break;
				}
				modificable=true;
			}
		}if ( modificable==false) {
			System.out.println("le codigo no era correcto");
		}
		}// fin de switch

		}while (opcion !=7);
	}

}
