package tema7;

public  class Vehiculo implements Comparable <Vehiculo>{
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
//	@Override
//	public int compareTo(Vehiculo o) {
////		Vehiculo otrove= (Vehiculo) o;
//		if(this.ruedas>o.ruedas) {
//			return 1;
//		}
//		if(this.ruedas<o.ruedas) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
	public int compareTo (Vehiculo o) {
		Vehiculo otro= (Vehiculo) o;
		if (this.getAutonomia()>otro.getAutonomia()) {
			return 1;
		}
		if(this.getAutonomia()<otro.getAutonomia()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	public String toString() {
		return "El vehiculo tiene "+ this.getRuedas() + " ruedas y una autonomia de "+ this.getAutonomia()+"km\n";
	}
}
