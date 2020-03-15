package tema7.POO;

public class Ej18Incidencias {
	private int puesto;
	private  static int casosresueltos;
	private static int casossinresolver;
	
	protected int getPuesto() {
		return puesto;
	}

	protected void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	private String problema, estado;
	private static int codigo=0;

	public Ej18Incidencias(int puesto, String problema) {
		casossinresolver++;
		codigo++;
		estado="pendiente";
		this.puesto=puesto;
		this.problema=problema;
	}
//	public 

	protected static int getCodigo() {
		return codigo;
	}

	protected static void setCodigo(int codigo) {
		Ej18Incidencias.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Incidencia "+ Ej18Incidencias.codigo+ "- Puesto : "+ getPuesto()+ " - "
				+getProblema()+ " - "+ getEstado();
	}

	protected String getProblema() {
		return problema;
	}

	protected void setProblema(String problema) {
		this.problema = problema;
	}

	protected String getEstado() {
		return estado;
	}

	protected void resuelve(String solucion) {
		this.estado = "resuelto";
		casosresueltos++;
		casossinresolver--;
		estado=" Resuelto - "+solucion;
	}

	protected static int getCasosresueltos() {
		return casosresueltos;
	}

	protected static void setCasosresueltos(int casosresueltos) {
		Ej18Incidencias.casosresueltos = casosresueltos;
	}

	protected static int getCasossinresolver() {
		return casossinresolver;
	}

	protected static void setCasossinresolver(int casossinresolver) {
		Ej18Incidencias.casossinresolver = casossinresolver;
	}

	
	
}
