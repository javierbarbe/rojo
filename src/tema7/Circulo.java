package tema7;

public class Circulo extends Figura {
	 private double radio;
	 private String nombre="Circulo";
	@Override
	public double getArea() {
		
		// TODO Apéndice de método generado automáticamente
		return Math.PI*radio*radio;
	}
	
	public Circulo () {
		
	}
	public Circulo (double radio) {
		this.radio=radio;
	}

	protected double getRadio() {
		return radio;
	}

	protected void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String dimeNombre() {
		// TODO Apéndice de método generado automáticamente
		return nombre;
	}

}
