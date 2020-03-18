package herencia;

import java.util.*;


public class Empleado implements Trabajadores, Comparable{
	private final String nombre;
	private double sueldo;
	private String seccion;
	private  int id;
	private static int idSiguiente=0;
	private Date altaContrato;
	//private  ;
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		this.nombre=nom;
		this.sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato= calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
	}

	public Empleado(String nombre) {
		
		this.nombre=nombre;
		sueldo=3000;
		GregorianCalendar calendario= new GregorianCalendar(2020,06,14);
		altaContrato= calendario.getTime();
		seccion="admin";
		id=idSiguiente;
		idSiguiente++;
	}
	
	public Empleado(String nom, double sue) { //, ) {
		//this.id=Id;
		this.nombre=nom;
		this.sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(2020,06,14);
		altaContrato= calendario.getTime();
		//Class<Calendar> nw= Calendar.class;
		seccion="Administración";
		id=idSiguiente;
		idSiguiente++;
	}
	public Empleado (Empleado ab) { //constructor copia
		
		//Empleado pe=new Empleado(ab.nombre);
		this.nombre=ab.getNombre()+"copia";
		this.sueldo=ab.getSueldo();
		this.seccion=ab.getSeccion();
		this.altaContrato=ab.getAltaContrato();
		this.id=ab.id; //al ser static pe genera un nuevo id, si pongo ab, copiara bien
	
	}
	public String dameDatos() {
		
		return "El nombre del empleado es: " + nombre+ " su seccion es: " + seccion
				+" y el id es "+ this.getId();
	}
	
		public void subeSueldo(double porciento) {
			this.sueldo+=( sueldo*(porciento)/100);
		}
		
		public double getSueldo() {
			return sueldo;
		}
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
		public String getSeccion() {
			return seccion;
		}
		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}
		public String getNombre() {
			return nombre;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	
		
		

		public Date getAltaContrato() {
			return altaContrato;
		}

		public void setAltaContrato(Date altaContrato) {
			this.altaContrato = altaContrato;
		}

		

		@Override
		public int compareTo(Object o ) {
			Empleado nuevoemp= (Empleado) o;
			if(this.getSueldo()>nuevoemp.getSueldo()) {
				return 1;
			}
			if (this.getSueldo()<nuevoemp.getSueldo()) {
				return -1;
			}
			// TODO Apéndice de método generado automáticamente
			else{return 0;}
		}

		@Override
		public double establece_bonus(double gratificacion) {
			
			return Trabajadores.bonus_base+gratificacion;
		}

		
		
}
