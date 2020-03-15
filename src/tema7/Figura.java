package tema7;

public abstract class Figura {
	
	//// ATRIBUTOS
	private double base,altura;
	private String nombre="";
	
	//CONSTRUCTOR POR DEFECTO
	public Figura() {
		// TODO Apéndice de constructor generado automáticamente
	}
	//CONSTRUCTOR CON PARAMETROS
	public Figura(double base,double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	//CONSTRUCTOR COPIA
	public Figura(Figura una) {
		this.altura=una.getAltura();
		this.base=una.getBase();
	
	}
	
	//METODO ABSTRACTO 
	public abstract double getArea();
	public abstract String dimeNombre() ;
	
	//////GETTERS Y SETTERS
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
		
	
}
