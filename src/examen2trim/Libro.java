package examen2trim;

public class Libro extends Publicacion implements Prestable {
	// ATRIBUTOS
	boolean prestado = false;

	public Libro(String isbn, String titulo, int anio) {
		super(isbn, titulo, anio);

	}

	@Override
	public void presta() {
		if (prestado == false) {
			System.out.println("Te presto este maravilloso libro: " + this.titulo);
			prestado = true;
		} else {
			System.out.println("Lo siento, el libro '" + this.getTitulo() + "' se encuentra prestado actualmente");
		}

	}

	@Override
	public void devuelve() {
		if (prestado == true) {
			prestado = false;
			System.out.println("Muchas gracias por devolver el libro " + this.titulo);
		} else {
			System.out.println("Ese libro se encuentra actualmente en la biblioteca");
		}

	}

	public String estado() {
		String respuesta = "";
		if (prestado == true) {
			respuesta = "El libro " + this.getTitulo() + "ya esta prestado actualmente";

		} else {
			respuesta = "El libro " + this.titulo + " se encuentra disponible";

		}
		return respuesta;
	}

	@Override
	public boolean estaPrestado() {
		if (prestado == true) {
			System.out.println("El libro "+this.titulo+ " ya esta prestado actualmente");
		} else {
			System.out.println("El libro '"+this.titulo+"' se encuentra disponible");
		}
		return prestado;
	}

	public String toString() {
		return "Libro '" + this.titulo + "', con isbn " + this.isbn + ", año de publicacion: " + this.anio + "; "
				+ this.estado();
	}
}
