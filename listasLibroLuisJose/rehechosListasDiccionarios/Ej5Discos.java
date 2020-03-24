package rehechosListasDiccionarios;

import java.util.ArrayList;

public class Ej5Discos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArrayList <Disco> albumgrafia= new ArrayList<Disco>();
		albumgrafia.add(new Disco("John Lennon & Paul McCartney",1965, "The Beatles", "A Hard Days Night", 8 ));
		albumgrafia.add(new Disco("JailHouse Rock", "Elvis Presley", 1962));
	}

}
class Disco {
	String cantante; 
	int anio; 
	String grupo; 
	String album; 
	int numero_canciones;
	public Disco(String cantante, int anio, String grupo, String album,int numero_canciones) {
		this.cantante=cantante;
		this.anio=anio;
		this.grupo=grupo;
		this.album=album;
		this.numero_canciones=numero_canciones;
		
	}
	public Disco (String album, String grupo, int anio) {
		this.album=album;
		this.grupo=grupo;
		this.anio=anio;
	}
	public Disco() {
		
	}
	protected String getCantante() {
		return cantante;
	}
	protected void setCantante(String cantante) {
		this.cantante = cantante;
	}
	protected int getAnio() {
		return anio;
	}
	protected void setAnio(int anio) {
		this.anio = anio;
	}
	protected String getGrupo() {
		return grupo;
	}
	protected void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	protected String getAlbum() {
		return album;
	}
	protected void setAlbum(String album) {
		this.album = album;
	}
	protected int getNumero_canciones() {
		return numero_canciones;
	}
	protected void setNumero_canciones(int numero_canciones) {
		this.numero_canciones = numero_canciones;
	}
	
	public String toString() {
		return "El cantante del grupo es: " +this.getCantante()+ "\nEl grupo: "+ this.getGrupo()+ ""
				+ "\nEl nombre del album es: "+ this.getAlbum()+ "\nEl numero de canciones"
						+ " es: "+  this.getNumero_canciones();
				
				
	}
	
}
