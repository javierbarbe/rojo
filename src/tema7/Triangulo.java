package tema7;

public class Triangulo extends Figura{
	private  String nombre="Triangulo";
	public Triangulo() {
		super();
	}
	//CONSTRUCTOR COPIA 
	public Triangulo (Triangulo original) {
		this.nombre=original.dimeNombre();
	}
	public Triangulo(double base, double altura) {
		super(base,altura);
	} 
	public double getArea() {
		return (getAltura()*getBase())/2;
	}
	public String daNombre() {
		return dimeNombre();
	}
	@Override
	public String dimeNombre() {
		
		return nombre;
	}
}
