package tema7;

public class Camion extends Vehiculo{
	 double capacidadCarga;
	public Camion(int ruedas, double autonomia) {
		super(ruedas, autonomia);
		// TODO Apéndice de constructor generado automáticamente
	}
	protected double getCapacidadCarga() {
		return capacidadCarga;
	}
	protected void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public void verDatos() {
		System.out.println("Los datos del camion son: ");
		super.verDatos();
		System.out.println("El camion tiene una capacidad de carga = "+capacidadCarga);
	}
}
