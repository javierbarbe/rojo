package herencia;

import java.util.Arrays;

public class UsoEmpleado {

	public static void main (String [] args) {
		
		
			Empleado [] misEmpleados= new Empleado[4];
			misEmpleados[0] =new Empleado("JavierArray", 1350);
			misEmpleados[1] =new Empleado(misEmpleados[0]);
			misEmpleados[2] =new Empleado("Jose", 3000);
			misEmpleados[3] =new Empleado("Juana");
			Jefatura jef= new Jefatura("Presidente", 30000, 2015,10,27);
			System.out.println(jef.getId()+ " id de jef salario de JEF"+ jef.getSueldo());
//			System.out.println(jef.getSueldo());
			jef.estableceIncentivo(35.6);
			System.out.println(jef.getSueldo()+" INCREMENTO A JEF 35.6 CON ESTABLECEINCENTIVO.");
//			Empleado emp1 = new Empleado("Javier", 1350);
//			Empleado emp2 = new Empleado("Marina", 1420);
//			Empleado emp3 = new Empleado ("Jose", 300);
//			emp2.setSeccion("Diseño");
//			emp1.setSueldo(3200);
//			System.out.println(emp1.dameDatos());
//			System.out.println(emp2.dameDatos());
//			System.out.println(emp3.dameDatos());
//			Empleado copia = new Empleado(emp1);
//			System.out.println(copia.dameDatos());
//			Empleado emp4 = new Empleado ("Juana", 300);
//			System.out.println(emp4.dameDatos());
//			for (Empleado e: misEmpleados) {
//				System.out.println("Nombre: "+ e.getNombre()+ " Salario: "+e.getSueldo()+ " y el ID: "+e.getId()
//								+" su seccion es "+e.getSeccion()+ "\tfecha de alta: "+ e.getAltaContrato());
//			}
			System.out.println(misEmpleados[2].getSueldo());
			misEmpleados[2].subeSueldo(50);
			System.out.println(misEmpleados[2].getSueldo()+" AUMENTADO EL SALARIO EN UN 50%");
		
		
		
		Empleado [] arrayempleados= new Empleado [4];
		arrayempleados[0]= new Empleado("javier barbero",6000);
		System.out.println(arrayempleados[0].dameDatos());
		arrayempleados[2]= new Empleado("jesus barbero",4500);
		arrayempleados[3]= new Empleado("daniel barbero",35000);
		arrayempleados[1]= new Jefatura("daniel barbero jefe", "ventas",35000);
		Jefatura jefe=(Jefatura) arrayempleados[1];
		System.out.println(jefe.getSueldo()+" salario del jefe");
		jefe.estableceIncentivo(300);
		System.out.println(jefe.toma_decisiones("Abrir un local en Madrid"));
		System.out.println(jefe.getSueldo()+" salario del jefe");
	System.out.println(arrayempleados[1].getSueldo());
	System.out.println(arrayempleados[1].dameDatos());
	
//System.out.println("///////////////IMPRIME ARRAY SIN ORDENAR POR SALARIO////////");
//	for (Empleado a : arrayempleados) {
//		System.out.println(a.getSueldo()+ " "+ a.getNombre()+" id "+ a.getId());
//	}
//	System.out.println("/////////ORDENACION EMPLEADOS POR SALARIO/////////");
//	Arrays.sort(arrayempleados);
//	for (Empleado a : arrayempleados) {
//		System.out.println(a.getSueldo()+ " "+ a.getNombre()+" id "+ a.getId());
//	}
//		
	
	System.out.println(arrayempleados[1].establece_bonus(1000)+jefe.dameDatos());
	System.out.println(jefe.getSueldo()+ " despues de subirle 6000 que son 1000 de bonus y cincomil de base");
	System.out.println(jefe.establece_bonus(300));
	System.out.println(jefe.dameDatos()+ " tiene un sueldo de " +jefe.getSueldo()+ " \ny un bonus de "+ jefe.establece_bonus(50));

	}
}
