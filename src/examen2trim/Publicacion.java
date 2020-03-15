package examen2trim;

public abstract class Publicacion {
// ATRIBUTOS
protected String isbn;
protected String titulo;
protected int anio;

// METODOS
 public Publicacion (String isbn, String titulo, int anio) {
	 this.isbn=isbn;
	 this.titulo=titulo;
	 this.anio=anio;
//	 this.numero=numero;
 }
 @Override
 public String toString() {
	 return "Isbn: "+this.isbn+"\nTitulo: "+this.titulo+"\nAño: "+this.anio;
 }
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}

}
