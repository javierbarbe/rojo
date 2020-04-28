package tema9ActProouestasIvan;

public class Almacenables{
	private String titulo,autor;
	private int numPag, numCanciones;
	protected int getNumPag() {
		return numPag;
	}
	protected void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	protected int getNumCanciones() {
		return numCanciones;
	}
	protected void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Almacenables other = (Almacenables) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	protected String getTitulo() {
		return titulo;
	}
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
}
