package tema9ActProouestasIvan;

import java.util.Comparator;

public class Alumno2 extends Alumno implements Comparable, Comparator<Alumno2>{
	private int id;
	public Alumno2(String nombre, int nota, int id) {
		super(nombre, nota);
		this.id=id;
		// TODO Auto-generated constructor stub
	}
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<GETTERS Y SETTERS >>>>>>>>>>>>>>>>>>>>>>>>>
	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}
	//************************************************************************
	
	
	// ******************** METODOS DISTINTOS COMPARE TO***************************
	
	// <<<<<<<<<<<<<<Compareto Ordenalfabetix>>>>>>>>>>>>>>>>>>>>>>>
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Alumno2 aux = (Alumno2) o;
//		
//		return this.getNombre().compareTo(aux.getNombre());
//	}
	
	// <<<<<<<<<<<<<<<<<<compareto  ordenAlfabetix inverso--------------------------------------
	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Alumno2 aux = (Alumno2) o;
//		
//		return aux.getNombre().compareTo(this.getNombre());
//		
//	}
	
//	/// COMPARE TO NOTACRECIENTE-------------------------------------------------------------------
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Alumno2 aux = (Alumno2) o;
//		
//		return this.getNota()-aux.getNota();
//	}
	// compareto notadecrecient-----------------------------------
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Alumno2 aux = (Alumno2) o;
		
		return aux.getNota()-this.getNota();
	}

	

// <>>>>>>>>>>>>>>>>>>>>>>>> FIN METODOS COMPARETO--------------------------------------------------
	@Override
	public int compare(Alumno2 o1, Alumno2 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
}
