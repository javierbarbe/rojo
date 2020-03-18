package herencia;

public class Jefatura extends Empleado implements Jefes,Trabajadores{

	public Jefatura(String nombre,double sueldo, int agno, int mes, int dia ) {
		super(nombre, sueldo, agno,mes,dia);
		departamento="DireccionPor defecto";
	}
	public Jefatura(String nombre, String departamento) {
		super(nombre);
		this.departamento=departamento;
	}
	public Jefatura(String nombre, double sueldo) {
		super(nombre,sueldo);
		this.departamento="pordefecto";
	}
	public Jefatura (String nombre , String departamento, double sueldo) {
		super(nombre,sueldo);
		this.departamento=departamento;
	}
	
	public void estableceIncentivo(double b) {
		this.incentivo=b;
		super.setSueldo(this.getSueldo()+this.incentivo);
	}
	
	public double getSueldo(){
		double sueldoJefe=super.getSueldo();
		return sueldoJefe;
//				+this.incentivo;
	}
	public String toString() {
		return "Este empleado "+this.getNombre()+" es un jefe del departamento "+ this.departamento;
	}
	private double incentivo;
	private String departamento;
	@Override
	public String toma_decisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: "+decision;
	}
	public double establece_bonus(double gratificacion) {
//		double salarioPrevio=this.getSueldo();
//		System.out.println("este es el salario previo "+salarioPrevio);
//		System.out.println("esta es la gratificacion "+gratificacion);
//		System.out.println("este es el incentivo que tenia el jefe previo "+this.getIncentivo());
//		super.setSueldo(salarioPrevio+gratificacion);
		double despuesdeBonus=this.getSueldo()+Trabajadores.bonus_base+gratificacion;
		super.setSueldo(despuesdeBonus);
		return Trabajadores.bonus_base+gratificacion;
	}
	protected double getIncentivo() {
		return incentivo;
	}
	
	protected String getDepartamento() {
		return departamento;
	}
	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
