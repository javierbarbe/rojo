package tema7;

public class Coche extends Vehiculo {
	int numeroPasajeros;
	public Coche(int ruedas, double autonomia) {
		super(ruedas,autonomia);
	}
	protected int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	protected void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	
	public void verDatos() {
		System.out.println("Datos del coche");
		super.verDatos();//abstracto en clase padre?? 
		System.out.println( " El numero de pasajeros es " +numeroPasajeros);
				
	}
}
