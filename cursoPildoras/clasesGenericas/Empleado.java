package clasesGenericas;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// para evitar que si hay cambios en la clase el archivo no pueda ser leido, hay que eliminar el 
	//warning que nos da eclipse sobre la clase serializable. Esto se logra generando un serialVersionUID
	//puede generarse por defecto o puedes poner el que genera la maquina de java
	String nombre;
	private double salarios;
	private int  edad;
	Date fecha_contrato;
	public Empleado (String nombre, int edad, int salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salarios=salario;
	}
	public Empleado (String nombre, double salarioss, int dia, int mes, int agno) {
		this.nombre=nombre;
		salarios=salarioss;
		GregorianCalendar fecha_alta= new GregorianCalendar(agno, mes-1, dia);
		fecha_contrato=fecha_alta.getTime();
//		this.dia=dia;
//		this.mes=mes-1;
//		this.agno=agno;
	}
	public String toString() {
		return "El salario es " + salarios+ "; el nombre es "+ nombre+ "; la fecha de alta es "+
				fecha_contrato+ "; La edad es "+edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalarios() {
		return salarios;
	}
	public void setSalarios(double salarios) {
		this.salarios = salarios;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}