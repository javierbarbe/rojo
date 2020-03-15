package tema7;

public class Prueba20a28 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Ej20a28 po = new Ej20a28();
		int [] creado=po.generaArrayInt(8, 15, 2);
		po.imprimeArray(creado);
		System.out.println();
//		System.out.println(po.minimodelArrayIn(creado));
//		System.out.println(po.maximodelArrayInt(creado));
//		System.out.println(po.mediaArrayInt(creado));
//		System.out.println(po.estaenArrayInt(creado));
//		System.out.println(po.posicionArrayInt(creado));
		
		
//		int [] volteado= (po.volteaArrayInt(creado));
	
	
		po.imprimeArray(po.volteaArrayInt(creado));
		
		System.out.println();
		po.imprimeArray(creado);
		System.out.println();
		po.imprimeArray(po.rotaDerechaInt(creado, 3));
		System.out.println();
		po.imprimeArray(creado);
		System.out.println();
		po.imprimeArray(po.rotaIzdaInt(creado, 2));
	}

}
