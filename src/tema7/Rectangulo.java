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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return nombre;
	}
}
