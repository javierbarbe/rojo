package tema7.POO;

import java.util.*;

public class GETESIMAL {

	public static void main(String[] args) {
		Articulo[] catalogo = new Articulo[5];
		int[] contador = new int[catalogo.length];
		String descr;
		int opcion=0;
		boolean salir=false;
		Scanner e = new Scanner(System.in);
		
		for (int i=0;i<catalogo.length;i++) {
			catalogo[i]=new Articulo();
		}
		catalogo[0]=new Articulo("BOTAS",111,12.3,13.41);
		while (opcion<7) {
		System.out.println("1. Lista de articulos");
		System.out.println("2. Alta de articulos");
		System.out.println("3. Baja de articulos");
		System.out.println("4. Modificacion de articulos");
		System.out.println("5. Entrada de mercancias");
		System.out.println("6. Salida de mercancias");
		
		
		opcion = e.nextInt();
	
		switch (opcion) {
		case 1:  salir=false;
			for (int i = 0; i < catalogo.length; i++) {
				
				if (salir==false) {
			
					if	 (!catalogo[i].getDescripcion().equals("")) {
						System.out.println(catalogo[i].getDescripcion()+" nº "+ catalogo[i].getStock() );
					}
					else{
					
						salir=true;
					}
				}
			}
			break;
		case 2: boolean salta=false;
			for (int i = 0; i < catalogo.length; i++) {
				if (catalogo[i].getDescripcion().equals("")) {
					if (salta==false) {
					catalogo[i] = new Articulo();
					System.out.println("introduzca codigo articulo");
					int codigo = e.nextInt();
					for (int k=0;k<catalogo.length;k++) {
						if (codigo==catalogo[k].getCodigo()) {
							System.out.println("el articulo con ese codigo ya existe, no puedes darlo de alta");
							salta=true;
						}
					}if (salta==false) {
					System.out.println("introduzca descripcion");
					String desc = e.nextLine();
					 String tocapollas=e.nextLine();
					System.out.println("introduzca precio compra");
					double pcompra = e.nextDouble();
					System.out.println("introduce precioventa");
					double pventa = e.nextDouble();
					catalogo[i].setDescripcion(tocapollas);
					catalogo[i].setPcompra(pcompra);
					catalogo[i].setPventa(pventa);
					catalogo[i].setCodigo(codigo);
					for (int j = 0; j < catalogo.length; j++) {
						if (catalogo[i].getCodigo() == catalogo[j].getCodigo()) {
							contador[i]++;
						}
					}
					break;
				}}
				}
			}break;
			
		case 3: System.out.println("Introduzca el codigo del articulo a dar de baja de la bbdd");
				int codigo=e.nextInt();
			
				for (int i=0;i<catalogo.length;i++) {
					if (codigo==catalogo[i].getCodigo()) {
						
						contador[i]=0;
						System.out.println("el articulo "+ catalogo[i].getDescripcion()+" ha sido dado"
								+ " de baja");
						catalogo[i].setDescripcion("");
						
					
//						catalogo[i].cantidad--;
					}
				
					else {
						System.out.println("El articulo ya esta dado de baja");
						break; 
					}
				}break; 
				
				
		case 4: System.out.println("Introduzca el codigo del articulo a modificar de la bbdd");
				 codigo=e.nextInt();
				 boolean existe=false;
				 int g=0;
				for (int i=0;i<catalogo.length;i++) {
					if (codigo==catalogo[i].getCodigo()) {
						existe=true;
						g=i;
						}
					}
						if (existe==true) {
						System.out.println("Descripcion de articulo");
						String toca=e.nextLine();
						 String descripcion= e.nextLine();
						System.out.println("Codigo de articulo");
						codigo=e.nextInt();
						System.out.println("Introduzca nuevo precio de venta");
						int pventa=e.nextInt();
						System.out.println("Introduce nuevo precio de compra");
						int pcompra=e.nextInt();
						System.out.println("Introduce cantidad de stock");
						int stock=e.nextInt();
						catalogo[g].setStock(stock);
						catalogo[g].setPcompra(pcompra);
						catalogo[g].setPventa(pventa);
						catalogo[g].setCodigo(codigo);
						catalogo[g].setDescripcion(descripcion);
						
					}else {
						existe=false;
						
						System.out.println("el articulo con ese codigo no existe en la bbdd");
						
					
				}break;
		case 5: System.out.println("De qué articulo quieres añadir existencias, dime el codigo");
		int codigo3=e.nextInt();
		boolean hay=false;
		for (int p=0;p<catalogo.length;p++) {
			if (codigo3==catalogo[p].getCodigo()) {
				hay=true;
				contador[p]++;
				catalogo[p].aumentaStock(1);
				System.out.println("el articulo "+ catalogo[p].getDescripcion()+" ha sido añadido"
						+ " al almacen");
				
				
			
//				catalogo[i].cantidad--;
			}
		}
		if (hay!=true) {
			System.out.println("el codigo al que hace referencia no tiene ningun articulo asociado");
		}break;
		case 6: System.out.println("De qué articulo quieres vender, dime el codigo");
		int codigo5=e.nextInt();
		boolean hayv=false;
		boolean noquedan=false;
		for (int p=0;p<catalogo.length;p++) {
			if (codigo5==catalogo[p].getCodigo()) {
				if(catalogo[p].getStock()==0) {
					System.out.println("no quedan ejemplares de ese articulo");
					noquedan=true;
					hayv=true;
				}if (noquedan!=true) {
				hayv=true;
				contador[p]--;
				catalogo[p].reduceStock(1);
				System.out.println("el articulo "+ catalogo[p].getDescripcion()+" ha sido vendido"
						+ " satisfactoriamente");
				
				}
			
//				catalogo[i].cantidad--;
			}
		}
		if (hayv!=true) {
			System.out.println("el codigo al que hace referencia no tiene ningun articulo asociado");
		}
		
		} //FIN SWITCH
	}
	}
}