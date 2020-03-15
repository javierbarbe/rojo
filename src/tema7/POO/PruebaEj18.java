package tema7.POO;

public class PruebaEj18 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Ej18Incidencias una = new Ej18Incidencias(11, "No arranca");
		System.out.println(una);
		System.out.println(Ej18Incidencias.getCasossinresolver());
		Ej18Incidencias dos = new Ej18Incidencias(12, "No internet");
		System.out.println(dos);
		System.out.println(Ej18Incidencias.getCasosresueltos());
		System.out.println(Ej18Incidencias.getCasossinresolver());
		dos.resuelve("Ponle pilas");
		System.out.println(dos);
		System.out.println(Ej18Incidencias.getCasosresueltos());
		System.out.println(Ej18Incidencias.getCasossinresolver());
	}

}
