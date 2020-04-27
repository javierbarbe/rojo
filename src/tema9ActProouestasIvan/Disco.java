package tema9ActProouestasIvan;

class Disco extends almacenables{
	
	 private int numCanciones;
	
	 public Disco (String titulo, String autor, int numCanciones) {
		 super.setTitulo(titulo);
		 super.setAutor(autor);
		 super.setNumCanciones(numCanciones);
		 this.numCanciones=numCanciones;
	 }
	 public Disco() {
		 
	 }

	protected int getNumCanciones2() {
		return numCanciones;
	}
	protected void setNumCanciones2(int numCanciones) {
		this.numCanciones = numCanciones;
	}
}
