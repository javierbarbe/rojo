package heroquest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Personaje {
	Scanner sc = new Scanner(System.in);
	final String[] razas = { "Humano", "Enano", "Hobbit", "Elfo" };
	// List<String> razas = new ArrayList<String>();

	final String[] oficios = { "Bárbaro", "Bailarín guerrero", "Tanque", "Mago", "Ladrón" };
	private String raza;
	private boolean oficioExiste = false, razaExiste = false,atacado=false;
	private String oficio;
	private String nombre;
	private int daño, vida, magia,acciones=2,resistencia,experiencia=0,Cartastesoro=0,saludExtra=0,oro=0;
//	private LinkedList <CartaTesoros> mazo= new LinkedList<>();
	 static MazoTesoros mazo = new MazoTesoros();

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
	public int vidaOriginal() {
		final int vidaO= new Personaje (this.nombre, this.raza, this.oficio).getVida();
		return vidaO;
	}
	public void tomarPocion() {
		int vidaMaxima= vidaOriginal();
		if(saludExtra>0) {
			Dado d4 = new Dado(4);
			this.vida+=(d4.getValor());
			if(vida>vidaMaxima) {
				vida=vidaOriginal();
				System.out.println("La salud del heroe ha sido reestablecida al maximo");
			}
		}
	}
	public int eligeAccion(Habitacion habitacion) {
		int accionElegida=0;
		while (acciones>0) {
			System.out.println("Te quedan en este turno "+ acciones+ " acciones");
			System.out.println("1. Abrir puerta");
			System.out.println("2. Atacar");
			System.out.println("3. Consultar enemigos en la habitacion");
			System.out.println("4. Buscar Tesoros");
			System.out.println("5. Tomar Pocion");
			System.out.println("6. Consultar salud del heroe");
			System.out.println("7. Gastar una accion haciendo nada");
			System.out.println("Introduce opcion elegida");
			int opcionElegida=sc.nextInt();
			//accionElegida= Integer.parseInt(JOptionPane.showInputDialog("Introduce opcion"));
			
		switch (opcionElegida) {
		case 1: if(!habitacion.isAbierta()) {
			habitacion.abrirPuerta(this);
			acciones--;
		}else {
			System.out.println("Esa habitacion ya ha sido abierta");
		}
		
		break;
		case 2: atacar(habitacion);
		
		break;
		case 3:	if(!habitacion.isAbierta()) {
					System.out.println("La habitacion aun continua cerrada");
					}else {
						if(!habitacion.listaEnemigos().isEmpty()) {
							System.out.println("En esta habitacion hay "+habitacion.numEnemigosRestantes()+" de raza " +habitacion.listaMonstruosHabitacion.getFirst().getRaza());
							habitacion.enemigoAtributos();
						}else {
						System.out.println("En esta habitacion no quedan enemigos");
						}
					}
		break;
		case 4: robarCarta();
		acciones--;
		break;
		case 5: tomarPocion();
		break;
		case 6 : System.out.println("La vida del heroe es "+ this.vida);
		break;
		case 7 : acciones--;
		}
		}this.acciones=2;
		this.atacado=false;
		return accionElegida;
	}
	
	public CartaTesoros robarCarta() {
		CartaTesoros robada= mazo.robarCarta();
		if(robada.getValor().equalsIgnoreCase("pocion curativa")) {
			this.saludExtra+=4;
			Cartastesoro++;
		} 
		if(robada.getValor().equalsIgnoreCase("oro")) {
			Dado d62 = new Dado(6);
			Cartastesoro++;
			this.oro += d62.getValor()*10 ;
		}
		return robada;
	}
//	public void cogerTesoro() {
//		//if(this.)
//		Iterator<CartaTesoros> iteCartas = mazo.iterator();
//		
//		for (int i=0; i< 3;i++) {
//			
//			mazo.add( new CartaTesoros());
//		} Collections.shuffle(mazo);
//		System.out.println(iteCartas.next());
//		//String valor = iteCartas.next().getValor();
//		iteCartas.remove();
//	//	System.out.println("Has consegudido "+valor);
//		//System.out.println( mazo.get(0).getValor());
//	}
	
	public void atacar(Habitacion habitacion) {
		if(acciones>0 && atacado==false) {
			atacado=true;
			acciones--;
			
		LinkedList<Enemigo> enemigosHabitacion=habitacion.listaMonstruosHabitacion;
		if(enemigosHabitacion.isEmpty()) {
			System.out.println("No quedan enemigos en esta habitacion");
			acciones++;
		}else {
			habitacion.numEnemigosRestantes();
			System.out.println(" hay "+enemigosHabitacion.size()+ " enemigos");
			int ataque= this.getDaño();
			System.out.println(ataque+ " ataque base");
			int defensa= enemigosHabitacion.get(0).getResistencia();
			int dado = new Dado (4).getValor();
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
				experiencia++;
				//enemigosHabitacion.remove(0);
				habitacion.matarEnemigo();
				habitacion.setCantidadEnemigos(habitacion.numEnemigosRestantes()-1);
				System.out.println(enemigosHabitacion.size()+ " enemigos quedan");
				//enemigosHabitacion.get(0).setVida(enemigosHabitacion.get(0).getVida()-1);
			}
			System.out.println();
		//System.out.println(enemigosHabitacion.get(0).getVida()+ " vida "+ enemigosHabitacion.get(0).getRaza());
		//System.out.println();
	}}else{
		System.out.println("no puedes atacar, no tienes acciones o bien ya has atacado este turno");}
	}

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
	//	roja.abrirPuerta(personaje);
for ( CartaTesoros c : mazo.mazo) {
	System.out.println(c);
}
		
	//	System.out.println(roja.getCantidadEnemigos()+" cantidad enemigos");
		System.out.println("=========================");

		System.out.println("===========================");
		//roja.listadoEnemigos();
		
		while(roja.numEnemigosRestantes()>=1 || !roja.isAbierta()) { // esto no da error... sin embargo si el for lo hago con
				//roja.listaEnemigos(); casca por todos lados
			barbar.eligeAccion(roja);
			for (Enemigo e : roja.listaEnemigos()) {
				e.enemigosAtacan(barbar);
			}
			
		}System.out.println("Has matado "+barbar.experiencia + " enemigos");
		System.out.println(barbar.saludExtra+ " estos son los puntos de salud extra conseguidos");
		System.out.println(barbar.oro+ " este es el oro conseguido");
		System.out.println(barbar.Cartastesoro+ " el numero de tesoros conseguidos");
		barbar.eligeAccion(roja);
		//System.out.println(roja.getCantidadEnemigos());
	}

}
