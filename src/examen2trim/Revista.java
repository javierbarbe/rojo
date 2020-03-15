package examen2trim;

public class Revista extends Publicacion {
	protected int numero;

	public Revista(String isbn, String titulo, int anio, int numero) {
		super(isbn, titulo, anio);
		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista '" + this.titulo + "'; con isbn " + this.isbn + ", del año" + this.anio + "; numero de "
				+ "publicacion: " + this.numero;
	}

}
