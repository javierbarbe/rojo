package heroquest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Personaje {
	final String[] razas = { "Humano", "Enano", "Hobbit", "Elfo" };
	// List<String> razas = new ArrayList<String>();

	final String[] oficios = { "Bárbaro", "Bailarín guerrero", "Tanque", "Mago", "Ladrón" };
	private String raza;
	private boolean oficioExiste = false, razaExiste = false;
	private String oficio;
	private String nombre;
	private int daño, vida, magia,resistencia;

	public Personaje(String nombre, String raza, String oficio) {
		this.nombre = nombre;
		this.oficio = oficio;
		this.raza = raza;
		razaEsta();
		oficioEsta();
		inicializar();
	
	}

	public boolean razaEsta() {
		do {
			for (String i : razas) {
				if (this.raza.equalsIgnoreCase(i)) {
					razaExiste = true;
					break;
				}
			}
			if (!razaExiste) {
				String razaNueva = JOptionPane.showInputDialog("Introduce una raza válida");
				this.setRaza(razaNueva);
			}
		} while (!razaExiste);
		return razaExiste;
	}

	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean oficioEsta() {
		do {
			for (String i : oficios) {
				if (this.oficio.equalsIgnoreCase(i)) {
					oficioExiste = true;
					break;
				}
			}
			if (!oficioExiste) {
				String oficioNuevo = JOptionPane.showInputDialog("Introduce un oficio valido");
				this.setOficio(oficioNuevo);
			}
		} while (!oficioExiste);
		return oficioExiste;
	}

	protected String getOficio() {
		return oficio;
	}

	protected void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String toString() {
		return "El personaje "+this.nombre+" es de raza " + this.raza + " y de oficio " + this.oficio+"\n"
				+ "Vida: "+this.vida+ " Resistencia: "+this.resistencia+ " Daño: "+ this.daño+ " Magia: "
				+this.magia;
	}
	
	public void inicializar() {
//		switch (raza) {
//		case "humano" : this.resistencia=2;
//						this.setVida(4);
//						daño=2;
//						magia=0;
//		}
		if(this.raza.equalsIgnoreCase("humano")) {
			resistencia=4;
			vida=4;
			daño=2;
			magia=0;
		}
		if (this.raza.equalsIgnoreCase("Enano")) {
			resistencia=5;
			vida=3;
			daño=2;
			magia=0;
		}
		if (this.raza.equalsIgnoreCase("hobbit")) {
			resistencia=2;
			vida=6;
			daño=1;
			magia=1;
		}
		if (this.raza.equalsIgnoreCase("elfo")) {
			resistencia=2;
			vida=4;
			daño=2;
			magia=2;
		}
		 if (this.oficio.equalsIgnoreCase("Bárbaro")) {
			resistencia+=3;
			vida+=4;
			daño+=5;
			magia-=2;
		}	
		 if (this.oficio.equalsIgnoreCase("Ladrón")) { //10 puntos 
			resistencia+=2;
			vida+=4;
			daño+=3;
			magia+=1;
		}
		 if (this.oficio.equalsIgnoreCase("Bailarín guerrero")) { //10 puntos 
			resistencia+=3;
			vida+=3;
			daño+=4;
			magia+=0;
		}
		 if (this.oficio.equalsIgnoreCase("Tanque")) { //10 puntos 
			resistencia+=5;
			vida+=4;
			daño+=3;
			magia-=2;
		}
		 if (this.oficio.equalsIgnoreCase("Mago")) { //10 puntos 
			resistencia+=2;
			vida+=2;
			daño-=2;
			magia+=8;
		}
	}
	
	protected int getDaño() {
		return daño;
	}

	protected void setDaño(int daño) {
		this.daño = daño;
	}

	protected int getVida() {
		return vida;
	}

	protected void setVida(int vida) {
		this.vida = vida;
	}

	protected int getMagia() {
		return magia;
	}

	protected void setMagia(int magia) {
		this.magia = magia;
	}

	protected int getResistencia() {
		return resistencia;
	}

	protected void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public void recibeHeridas(int heridas) {
		this.vida+=heridas;
	}

	
	public void atacar(Habitacion habitacion) {
		LinkedList<Enemigo> enemigosHabitacion=habitacion.habitacion;
		if(enemigosHabitacion.isEmpty()) {
			System.out.println("No quedan enemigos en esta habitacion");
		}else {
			habitacion.numEnemigosRestantes();
			System.out.println(" hay "+enemigosHabitacion.size()+ " enemigos");
			int ataque= this.getDaño();
			System.out.println(ataque+ " ataque base");
			int defensa= enemigosHabitacion.get(0).getResistencia();
			int dado = 6;//(int)(Math.random()*4)+1;
			ataque*=0.3 ;
			System.out.println(ataque+" ataque reducido factor");
			ataque+=dado;
			System.out.println(dado+ " resultado dado");
			System.out.println(defensa+ " defensa");
			System.out.println(ataque+ "tirdad mas atributos");
			System.out.println(enemigosHabitacion.get(0).getVida()+ " vida "+ enemigosHabitacion.get(0).getRaza());
			int resultado = defensa - ataque;
			System.out.println(resultado+ " resultado defensa - ataque");
			if(resultado<=0) {
				//enemigosHabitacion.remove(0);
				habitacion.enemigo();
				habitacion.setCantidadEnemigos(habitacion.numEnemigosRestantes()-1);
				System.out.println(enemigosHabitacion.size()+ " enemigos quedan");
				//enemigosHabitacion.get(0).setVida(enemigosHabitacion.get(0).getVida()-1);
			}
		//System.out.println(enemigosHabitacion.get(0).getVida()+ " vida "+ enemigosHabitacion.get(0).getRaza());
		
	}}

//	
	public static void main(String[] args) {
//		String nombrePj= JOptionPane.showInputDialog("Dime tu nombre");
//		String raza = JOptionPane.showInputDialog("Que raza eres");
//		String oficio= JOptionPane.showInputDialog("Dime tu oficio");
		//Personaje mio = new Personaje(nombrePj ,raza, oficio);
		Personaje barbar = new Personaje("Borrego" ,"Humano", "bárbaro");
		//mio.inicializar();
		ArrayList <Personaje> lista = new ArrayList<Personaje>();
	//	lista.add(mio);
		lista.add(barbar);
		for (Personaje e : lista) {
			
			System.out.println(e);
			System.out.println();
		}
		Habitacion roja = new Habitacion();
		roja.abrirPuerta(barbar);
	//	System.out.println(roja.getCantidadEnemigos()+" cantidad enemigos");
		barbar.atacar(roja);
		roja.getCantidadEnemigos();
		
		//System.out.println(roja.getCantidadEnemigos());
	}

}
