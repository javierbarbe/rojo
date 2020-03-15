package tema5;
import java.util.*;
public class Persona {
	Scanner e= new Scanner(System.in);
//atributos
	private String nombre="",dni="", valoracion="";
	private char sexo;
	private int edad,masaEntera;
	private double peso, altura,masa;
	
	
	public Persona(){
		
	}
	public Persona(String nombre, String dni, int edad, char sexo) {
		this.nombre=nombre;this.dni=dni;this.edad=edad;this.sexo=sexo;
	}
	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		this.nombre=nombre;this.dni=dni;this.edad=edad;this.sexo=sexo;this.peso=peso;this.altura=altura;
	}
	
	public  double calculaMasa() {
		while(altura>2.5) {
			//System.out.println("Introduce altura en metros");
			//altura=e.nextDouble();
		}
		while(masa>1000) {
			//System.out.println("Por favor, introduce el peso en kg");
			//masa=e.nextDouble();
		}
		calculaMasa2();
		return masa;
	}
	private void calculaMasa2() {
		masa=peso/Math.pow(altura,2);
		masaEntera=(int)masa;
	}
	
	public String valoracion() {
		if(masa<20) {
			valoracion="Está por debajo del peso normal";
		}
		else if(masa<25) {
			valoracion="Está usted estupendo";
		}
		else {
			valoracion="Es usted un zampabollos";
		}
				
		return valoracion;
	}
	
	public boolean mayorEdad() {
		boolean esMayor=true;
		if (edad<18) {
			esMayor=false;
		}
		return esMayor;
	}
	
	 void sexo() {
		switch (sexo) {
		case ('H'): System.out.println("Eres varon");
					break;
		case('M'): System.out.println("Eres una mujer");
					break;
		default: sexo='H';
		
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	/*public String getValoracion() {
		return valoracion;
	}*/
	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}
	public char getSexo() {
		switch (sexo) {
		case ('H'): System.out.println("Eres varon");
					break;
		case('M'): System.out.println("Eres una mujer");
					break;
		default: sexo='H';
		
		}
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getMasaEntera() {
		return masaEntera;
	}
	public void setMasaEntera(int masaEntera) {
		this.masaEntera = masaEntera;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void estableceAltura() {
		altura=e.nextDouble();
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	@Override
	public String toString() {
		return "Persona [ nombre=" + this.nombre + ", dni=" + dni + ", valoracion=" + valoracion + ", sexo="
				+ sexo + ", edad=" + edad + ", masaEntera=" + masaEntera + ", peso=" + peso + ", altura=" + altura
				+ ", masa=" + masa + ", calculaMasa()=" + calculaMasa() + ", valoracion()="  + valoracion()
				+ ", mayorEdad()=" + mayorEdad() + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				/*+ ", getValoracion()=" + getValoracion() */+ ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad()
				+ ", getMasaEntera()=" + getMasaEntera() + ", getPeso()=" + getPeso() + ", getAltura()=" + getAltura()
				+ ", getMasa()=" + getMasa() + "]";
	}
}
