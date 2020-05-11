
public class Libro implements Ordenable {
	// ATRIBUTOS
	private String titulo;
	private String descripcion;
	private boolean prestado = false;
	public static final int tipo_novela = 1;
	public static final int tipo_relatos = 2;
	public static final int tipo_poesia = 3;
	public int tipoLibro;
	public static int contador=0;
	public static int identificador2 = 100;
	public int identificador;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<constructores->>>>>>>>>>>>>>>>>>>>--------------------------------------------------

	public Libro(String titulo, String descripcion, int tipoLibro) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.prestado = false;
		this.tipoLibro = tipoLibro;
		this.identificador = identificador2;
		identificador2++;
		contador++;
	}

	public Libro(String titulo, String descripcion) {

		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tipoLibro = 3;
		this.identificador = identificador2;
		identificador2++;
		contador++;
	}
	// **************************************-------------------------------------------------

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<metodos GETTER Y SETTERS
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isPrestado() {
		if (prestado == true) {
			System.out.println("El libro " + this.titulo + " se encuentra prestado ");
		}
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void cambiaEstado(boolean prestadoSiPrestadoNo) {
		this.prestado = prestadoSiPrestadoNo;
	}
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Override
	public int getOrden() {
		// TODO Auto-generated method stub
		return this.identificador;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro esdla = new Libro("El señor de los anillos", "aventuras magicas en la tierra media", Libro.tipo_novela);
		System.out.println(esdla.titulo + " \n" + esdla.descripcion);
		System.out.println(esdla.identificador);
		Libro esdla2 = new Libro("El señor de los anillos2", "aventuras magicas en la tierra media", Libro.tipo_novela);
		System.out.println(esdla2.identificador);
		Libro poesia = new Libro("amantes", "bandidos");
//			System.out.println(poesia.descripcion+ "\n" + poesia.tipoLibro );
//			System.out.println(poesia.getTitulo()+" "+poesia.isPrestado());
//			System.out.println(esdla.getTitulo()+" " + esdla.isPrestado());
//			System.out.println(esdla2.getTitulo()+" " + esdla2.isPrestado());
//			 
//			poesia.cambiaEstado(true);
//			
//			System.out.println(poesia.getTitulo()+" "+poesia.isPrestado());
//			System.out.println(esdla.getTitulo()+" " + esdla.isPrestado());
//			System.out.println(esdla2.getTitulo()+" " + esdla2.isPrestado());
		System.out.println(esdla.getOrden());

	}

}
