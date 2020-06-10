package clasesGenericas;



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
	public Jefe (String nombre, int edad, int salario) {
		super(nombre,edad,salario);
	}
}