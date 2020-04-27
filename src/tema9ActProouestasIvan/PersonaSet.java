package tema9ActProouestasIvan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonaSet implements Comparable{
	// <<<<<<<<<<<<<<<<<<<<	ATRIBUTOS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	private int id,altura;
	private String nombre;
	
	//************************************************************************
	
	// CONSTRUCTORES--------------------------------------------------------------
	public PersonaSet(String nombre, int id, int altura) {
		this.nombre=nombre;
		this.id=id;
		this.altura=altura;
	}
	
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  GETTERS Y SETTERS>>>>>>>>>>>>>>>>>>>>>>>
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected int getAltura() {
		return altura;
	}

	protected void setAltura(int altura) {
		this.altura = altura;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//*********************************************************************
	
	

	/// <<<<<<<<<<<<<<<<<<<COMIENZO METODOS COMPARE TO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ORDENALFABETIX>>>>>>>>>>>>>>>>>>>>>
	//	@Override
//		public int compareTo(Object o) {
//			// TODO Auto-generated method stub
//			PersonaSet nue= (PersonaSet) o;
//			return this.nombre.compareTo(nue.nombre);
//		}
		
		//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ORDEN altura>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	@Override  // PARA LOS NUMEROS SE HACE EL COMPARE MEDIANTE UNA RESTA ( si quiero de mayor a menor 
//	// o viceversa basta con cambiar el orden de los operandos en la resta del return
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		PersonaSet p = (PersonaSet)o;
//		return p.altura-this.altura;
//	}
	
	//	--------<<<<<<<<<<<<<<<<<<<<ORDEN ID>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		PersonaSet p = (PersonaSet)o;
//		return p.id-this.id;
//	}
		
	//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<ORDENALFABETIX INVERSO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Override  			//igual que los numeros, si lo quiero a la inversa invertir el orden de los operandos en el return
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PersonaSet p = (PersonaSet)o;
		return p.nombre.compareTo(this.nombre);
	}
			

	///////////*********************FIN METODOS COMPARE TO>>>>>>>>>>>>>>>>>>>>>>>
	public String toString() {
		return this.nombre+ " "+ this.id+ " "+ this.altura;
	}
	
	
	//// <<<<<<<<<<<<<<<<<<<<<<< METODO MAIN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public static void main (String [] args) {
		Set <PersonaSet>miset =new HashSet<>();
		SortedSet <PersonaSet> misorted= new TreeSet<>();
		PersonaSet persSet = new PersonaSet("javier", 123, 198);
		misorted.add(persSet);
		misorted.add(new PersonaSet("malio",4253,175));
		misorted.add(new PersonaSet("santiago", 325, 172));
		misorted.add(new PersonaSet("josue",75445, 183));
		misorted.add(new PersonaSet("amalia", 335, 166));
		
	
		System.out.println(misorted);
	}

	
}
