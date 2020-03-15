package tema7;

public abstract class Vehiculo {
	protected int ruedas;
	protected double autonomia;
	//constructor por defecto 
	public Vehiculo(int ruedas, double autonomia) {
		this.ruedas=ruedas;
		this.autonomia=autonomia;
	}
	public void verDatos() {
		System.out.println("El vehiculo tiene " +ruedas+ " ruedas, y una autonomia de "+ autonomia);
	}
	
	protected int getRuedas() {
		return ruedas;
	}
	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	protected double getAutonomia() {
		return autonomia;
	}
	protected void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
}
