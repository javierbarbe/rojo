package tema7;

public class PruebaVehiculo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Coche renault = new Coche(4,300);
		renault.setNumeroPasajeros(5);
		renault.verDatos();
		System.out.println(renault.getNumeroPasajeros());
		Camion vol = new Camion (8,500);
		vol.setCapacidadCarga(552);
	vol.verDatos();
	vol.getCapacidadCarga();
	}

}
