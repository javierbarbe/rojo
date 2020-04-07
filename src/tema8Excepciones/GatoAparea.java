package tema8Excepciones;

public class GatoAparea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Gato g1 = new Gato ("garfield", "macho" , 12);
		Gato g2 = new Gato ("silvestre", "macho" , 2);
		Gato g4= new Gato ("Dulce", Gato.sexos[1], 8);
		Gato g3;
		try {
			g3 = g1.aparear(g4);
			System.out.println(g3);
			System.out.println(g3.getSexo());
		} catch (ExcepcionApareamientoImposible e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
class Gato {
	private String nombre,sexo;
	private int edad;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getSexo() {
		return sexo;
	}
	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	public static final String [] sexos = {"macho","hembra"};
	
	public Gato (String nombre, String sexo, int edad) {
		this.nombre=nombre;
		this.sexo=sexo;
		this.edad=edad;
	}
	public Gato aparear(Gato otro) throws ExcepcionApareamientoImposible {
		if (this.sexo.equals(otro.getSexo())) {
			System.out.println("estos gatos son del mismo sexo");
			throw new  ExcepcionApareamientoImposible(); 
			
		}else {
			return new Gato("bebe", sexos[(int)(Math.random()*2)], 0);
		}
		
		
	}
	public String toString() {
		return this.nombre;
	}
	
}