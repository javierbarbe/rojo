package tema9ActProouestasIvan;

public class Libro2 extends Almacenables{
	
	private int numPaginas;
	public Libro2(String titulo, String autor, int numPaginas) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setNumPag(numPaginas);
		this.numPaginas=numPaginas;
		//this.setNumPaginas(numPaginas);
	}
	public Libro2() {
		
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
}
