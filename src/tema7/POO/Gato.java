package tema7.POO;

public class Gato implements Comparable{
	private String color="",sexo="",nombre="";
	public Gato(String color, String sexo,String nombre) {
		this.color=color;
		this.sexo=sexo;
		this.nombre=nombre;
	}
	public Gato() {
		
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected String getSexo() {
		return sexo;
	}
	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return "el gato se llama "+this.getNombre()+ " es de color "+this.getColor(); 
	}
	@Override
	public int compareTo(Object o) {
		Gato otrogato= (Gato) o;
		if(this.nombre.compareToIgnoreCase(otrogato.nombre)>0){
				return 1;
			}
		if (this.nombre.compareToIgnoreCase(otrogato.nombre)<0) {
		// TODO Apéndice de método generado automáticamente
		return -1;}
		else {
			return 0;
		}
	}
}
