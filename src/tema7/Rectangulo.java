package tema7;

public class Rectangulo extends Figura {
	private String nombre="rectangulo";
	public Rectangulo(double base,double altura) {
		super(base,altura);
	}
	public double getArea() {
		return getBase()*getAltura();
	}
	@Override
	public String dimeNombre() {
		// TODO Apéndice de método generado automáticamente
		return nombre;
	}
}
