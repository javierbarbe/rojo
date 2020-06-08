package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;


public class PrimeraSerializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado [] trabajadores = new Empleado [3];
		trabajadores[1]= new  Jefe("Javier", 22000, 14, 5, 2021,800);
		trabajadores [0]= new Empleado ("JoseLuis", 27000, 16, 10, 2017);
		trabajadores [2]= new Empleado ("Marta", 20000, 1, 2, 2015);
		
		try {
			//salida del objeto//--------------------------
//			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("imagenes/empleados_lista.dat"));
//			salida.writeObject(trabajadores);
//			salida.close();
			//------------------------------------------------
			// entrada del objeto-----------
			ObjectInputStream recuperando_fichero= new ObjectInputStream(new FileInputStream("imagenes/empleados_lista.dat"));
			// hay que hacer casteo del Objeto a lo que vamos a recibir... como enviamos un
			// array de Empleados, habra que transformar lo recibido en un array De empleados
			Empleado [] personal_recuperado= (Empleado[]) recuperando_fichero.readObject();
			recuperando_fichero.close();
			for ( Empleado e: personal_recuperado) {
				System.out.println(e);
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el archivo");
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getCause());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// para evitar que si hay cambios en la clase el archivo no pueda ser leido, hay que eliminar el 
	//warning que nos da eclipse sobre la clase serializable. Esto se logra generando un serialVersionUID
	//puede generarse por defecto o puedes poner el que genera la maquina de java
	String nombre;
	double salarios;
	int dia, mes , agno;
	Date fecha_contrato;
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
				fecha_contrato+ " ";
	}
}

class Jefe  extends Empleado{
	
	private static final long serialVersionUID = -5547092162634594744L;
	double comision;
	public Jefe(String nombre, double salario, int dia, int mes, int agno, double comision) {
		super(nombre, salario, dia, mes, agno);
		this.comision=comision;
		// TODO Auto-generated constructor stub
	}
	public String toString () {
		return super.toString()+ " la comision es "+ comision;
	}
}