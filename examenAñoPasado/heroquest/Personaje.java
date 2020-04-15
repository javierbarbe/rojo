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
	private int movimiento=0, distancia=0;
	private boolean moverse=false;
	private boolean monstruoErrante=false;
	private int daño, vida, magia,acciones=2,resistencia,experiencia=0,Cartastesoro=0,saludExtra=0,oro=0,habitacionesVisitadas=0;
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
	
	public void moverse(Habitacion habitacion) {
		if(acciones>0 && !moverse) {
		moverse=true;
		Dado d61= new Dado(6);
		Dado d62 = new Dado(6);
		movimiento = d61.getValor()+d62.getValor();
		distancia=movimiento;
	
		if(habitacion.listaMonstruosHabitacion.size()>0) {
			System.out.println("Hay monstruos en la habitacion");
			System.out.println("Te has alejado de ellos "+movimiento+ " casillas");
		}
		//return movimiento;
		acciones--;
		}else {
			System.out.println("Ya te has movido");
		}
	}
	
	protected int getDistancia() {
		return distancia;
	}

	protected void setDistancia(int distancia) {
		this.distancia = distancia;
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
			Cartastesoro--;
			Dado d4 = new Dado(4);
			this.vida+=(d4.getValor());
			if(vida>vidaMaxima) {
				vida=vidaOriginal();
				System.out.println("La salud del heroe ha sido reestablecida al maximo");
			}
		}else {
			System.out.println("No tienes cartas de poción en tu haber");
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
			System.out.println("6. Consultar stats del heroe");
			System.out.println("7. Gastar una accion haciendo nada");
			System.out.println("8. Mirar monedas conseguidas");
			System.out.println("9. Mirar stats de las razas de monstruos");
			System.out.println("10. Alejarse de monstruos");
			System.out.println("Introduce opcion elegida");
			int opcionElegida=sc.nextInt();
			//accionElegida= Integer.parseInt(JOptionPane.showInputDialog("Introduce opcion"));
			
		switch (opcionElegida) {
		case 1: if(!habitacion.isAbierta()) {
			habitacion.abrirPuerta(this);
			acciones--;
			habitacionesVisitadas++;
			
		}else {
			System.out.println("Esa habitacion ya ha sido abierta");
		}
		
		break;
		case 2: atacar(habitacion);
		
		break;
		case 3: mirar(habitacion);	
		break;
		case 4: robarCarta(habitacion);
	
		break;
		case 5: tomarPocion();
		break;
		case 6 : System.out.println(consultarStats());
		break;
		case 7 : acciones--;
		break;
		case 8: consultarRiquezas();
		break;
		case 9: Enemigo.consultarTodasRazas();
		break;
		case 0://if(habitacion.getCantidadEnemigos()>0) {
			if(!habitacion.listaEnemigos().isEmpty()) {
				ataque(habitacion.listaEnemigos().getFirst(),habitacion);
				}else {
					System.out.println("restan "+habitacion.listaEnemigos().size()+" enemigos");
				}
			//}
		break;
		case 10: moverse(habitacion);
		}
		}this.acciones=2;
		this.atacado=false;
		this.moverse=false;
		return accionElegida;
	}
	
	public void mirar(Habitacion habitacion) {
		if(!habitacion.isAbierta()) {
			System.out.println("La habitacion aun continua cerrada");
			}else {
				if(!habitacion.listaMonstruosHabitacion.isEmpty()) {
					System.out.println("En esta habitacion hay "+habitacion.listaMonstruosHabitacion.size()+" monstruos: "
							);// +Habitacion.listaMonstruosHabitacion.getFirst().getRaza());
					muestraEnemigos(habitacion);
					habitacion.enemigoAtributos();
				}else {
				System.out.println("En esta habitacion no quedan enemigos");
				}
			}
		
	}
	
	public void muestraEnemigos(Habitacion habitacion) {
		for (Enemigo e :habitacion.listaMonstruosHabitacion) {
			System.out.println(e.getRaza());
		}
	}
	
	public String consultarStats() {
		return "Experiencia: "+this.experiencia+ "; Vida: "+this.vida+ "/"+this.vidaOriginal()+"; Oro : "+this.oro;
	}
	
	public CartaTesoros robarCarta(Habitacion habitacion) {
		CartaTesoros robada= mazo.robarCarta(habitacion);
		if(habitacion.isAbierta() && habitacion.listaMonstruosHabitacion.isEmpty()) {
			acciones--;
		if(robada.getValor().equalsIgnoreCase("pocion curativa")) {
			this.saludExtra+=4;
			Cartastesoro++;
		} 
		if(robada.getValor().equalsIgnoreCase("oro")) {
			Dado d62 = new Dado(6);
			//Cartastesoro++;
			this.oro += d62.getValor()*10 ;
		}
		if(robada.getValor().equals("monstruo errante")) {
			//monstruoErrante=true;
			añadirErrante(habitacion);
			
//			Enemigo errante = new Enemigo("goblin");
//			habitacion.añadirMonstruo(errante);
//			while(errante.getVida()>0) {
//				errante.enemigosAtacan(this);
//				this.eligeAccion(habitacion);
//				if(errante.getVida()<1) {
//					habitacion.matarEnemigo();
//				}
//			}
		}
		if(robada.getValor().equals("trampa")) {
			this.recibeHeridas(-1);
		}
		return robada;
		}else {
			System.out.println("Esta habitacion aun no se ha abierto, no puedes buscar en ella "
					+ "o aun no has acabado con todos los monstruos");
			robada= new CartaTesoros().cartaVacia();
			return robada;
		}
	}
	
	public void añadirErrante(Habitacion habit) {
		Dado d5 = new Dado(5);
		Enemigo errante= new Enemigo (Enemigo.razasEnemigos[d5.getValor()-1]);
		habit.listaMonstruosHabitacion.add(errante);
	}
	
	public void consultarRiquezas() {
		System.out.println("Estas son tus monedas :"+ this.oro);
	}

	public void ataque (Enemigo e, Habitacion hab) {
		System.out.println(hab.listaMonstruosHabitacion.size());
		e.morir(hab);
	}
	
	
	public int atacar(Habitacion habitacion) {
		int muerto=0;
		if(acciones>0 && atacado==false) {
			//atacado=true;
			acciones--;
			LinkedList<Enemigo> enemigosHabitacion=habitacion.listaMonstruosHabitacion;	
		
		if(monstruoErrante) {
			Enemigo errante = new Enemigo("goblin");
			monstruoErrante=false;
		//enemigosHabitacion.add
		habitacion.añadirMonstruo(errante,habitacion);
		} //fin if(monstruoErrante)
		if(enemigosHabitacion.isEmpty()) {
			System.out.println("No quedan enemigos en esta habitacion");
			acciones++;
		}//fin if(enemigosHabitacion.isEmpty())
		else {
			if(distancia<1) {
			habitacion.numEnemigosRestantes();
			muestraEnemigos(habitacion);
			int enemigoAtacado= Integer.valueOf(JOptionPane.showInputDialog("A qué enemigo atacas"));
			System.out.println(" hay "+habitacion.listaMonstruosHabitacion.size()+ " enemigos");
			int ataque= this.getDaño();
			//System.out.println(ataque+ " ataque base");
			int defensa= enemigosHabitacion.get(enemigoAtacado-1).getResistencia();
			int dado = new Dado (4).getValor();
			ataque*=0.5 ;
			//System.out.println(ataque+" ataque reducido factor");
			ataque+=dado;
//			System.out.println(dado+ " resultado dado");
//			System.out.println(defensa+ " defensa");
//			System.out.println(ataque+ "tirdad mas atributos");
			System.out.println(enemigosHabitacion.get(0).getVida()+ " vida "+ enemigosHabitacion.get(0).getRaza());
			int resultado = defensa - ataque;
//			System.out.println(resultado+ " resultado defensa - ataque");
			if(resultado<=0) {
				muerto=1;
				experiencia++;
				//enemigosHabitacion.remove(0);
				
				habitacion.setCantidadEnemigos(habitacion.numEnemigosRestantes()-1);
				System.out.println("enemigo muerto "+ habitacion.listaMonstruosHabitacion.get(0).getRaza());
				habitacion.matarEnemigo();
				System.out.println(habitacion.listaMonstruosHabitacion.size()+ " enemigos quedan");
				return muerto;
				//enemigosHabitacion.get(0).setVida(enemigosHabitacion.get(0).getVida()-1);
			} //fin if(resultado<=0)
			System.out.println();
		//System.out.println(enemigosHabitacion.get(0).getVida()+ " vida "+ enemigosHabitacion.get(0).getRaza());
		//System.out.println();
	}//fin if(distancia<1);
			return muerto;
		}//fin else (habitacion.isEmpty())
		}//fin if acciones>0 && !atacado
		else{
			
		System.out.println("no puedes atacar, no tienes acciones o bien ya has atacado este turno");}
			return muerto;
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
		Dado d5 = new Dado(5);
		Habitacion [] roja = new Habitacion[d5.getValor()];
	//	roja.abrirPuerta(personaje);
for ( CartaTesoros c : mazo.mazo) {
	System.out.println(c);
}
		System.out.println("La mazmorra tiene "+d5.getValor()+ " habitaciones");
	
		//System.out.println(roja.getCantidadEnemigos());
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getExperiencia() {
		return experiencia;
	}

	protected void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	protected int getCartastesoro() {
		return Cartastesoro;
	}

	protected void setCartastesoro(int cartastesoro) {
		Cartastesoro = cartastesoro;
	}

	protected int getSaludExtra() {
		return saludExtra;
	}

	protected void setSaludExtra(int saludExtra) {
		this.saludExtra = saludExtra;
	}

	protected int getOro() {
		return oro;
	}

	protected void setOro(int oro) {
		this.oro = oro;
	}

	protected int getHabitacionesVisitadas() {
		return habitacionesVisitadas;
	}

	protected void setHabitacionesVisitadas(int habitacionesVisitadas) {
		this.habitacionesVisitadas = habitacionesVisitadas;
	}

}
