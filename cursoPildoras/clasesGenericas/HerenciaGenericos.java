package clasesGenericas;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado administrativa = new Empleado ( "elena", 45, 1500);
		Jefe directoraComercial= new Jefe ("ana", 42,1300);
		// al ser  un empleado es posible almacenar un jefe dentro de un objeto tipo empleado
		Empleado nuevoEmpleado1 = directoraComercial;
//-------------------- manejando clases genericas
		ParejaHerenciaRara<Empleado> administrativo = new ParejaHerenciaRara<Empleado>();
		ParejaHerenciaRara <Jefe> directorcomercial = new ParejaHerenciaRara<Jefe>();
		// no es posible aunque jefe hereda de empleado, no puedo hacer que una clase generica 
		// Pareja<Jefe> sea un objeto Pareja<Empleado> , no funciona el principio de sustitucion (es un)
		//Pareja <Jefe> nuevoEmpleado = administrativo;
		ParejaHerenciaRara.imprimirTrabajador(directorcomercial);
	}

}
