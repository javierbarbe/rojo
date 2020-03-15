package tema7;

public class PruebaoPunto {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		//PuntoMejor ol=new PuntoMejor();
		Punto uno=new Punto();
		Punto dos=new Punto();
		dos.setPosx(2);
		dos.setPosy(4);
		uno.setPosx(4);
		uno.setPosy(10);
		System.out.println(PuntoMejor.distancia(uno, dos));
			
	}

}
