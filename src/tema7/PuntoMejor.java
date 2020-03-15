package tema7;

public class PuntoMejor extends Punto {
 static double distancia;
 static double distX,distY;
	public PuntoMejor() {
		
	}
	public static String distancia(Punto uno, Punto dos) {
		distX=dos.getPosx()-uno.getPosx();
		distY=dos.getPosy()-uno.getPosy();
		return "La distancia entre los puntos X es: " + distX+ " y entre las Y: "+ distY;
	}
	
}
