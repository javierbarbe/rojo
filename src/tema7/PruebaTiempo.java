package tema7;

public class PruebaTiempo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Tiempo pri= new Tiempo (1, 152,55);
		Tiempo dos= new Tiempo (1,158,10);
		pri.resta(pri, dos);
		System.out.println(pri.toString());
		pri.suma(pri,dos);
		System.out.println(pri.toString());
	}

}
