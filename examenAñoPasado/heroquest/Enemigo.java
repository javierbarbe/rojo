package heroquest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import cojones.imprime;

public class Enemigo {
	static String  []	razasEnemigos= {"Orco", "Goblin", "Momia", "Esqueleto", "Fimir"};
	
	
	private String raza;
	private int vida=1,magia,daño,resistencia,movimiento;
	private boolean razaEnemigoExiste=false;
	private static String []todosDaños= new String [razasEnemigos.length];
	private static String []todosMov= new String [razasEnemigos.length];
	private static String []todosMagia= new String [razasEnemigos.length];
	private static String []todosResistencia= new String [razasEnemigos.length];
	//private  static String todasLasRazas="",todosDaños="",todosResistencias="", todosMovimientos="";
	public Enemigo(String raza) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("examenAñoPasado/heroquest/monstruos.txt"));
			String linea="";
			ArrayList <String> contador = new ArrayList<>();
			while(linea!=null) {
				linea=br.readLine();
				contador.add(linea);
				
			}System.out.println(contador.size());
			int nula= contador.size();
	
			contador.remove(nula-1);
			System.out.println(contador);
		}
			catch (Exception e) {
				System.out.println("El archivo de enemigos no se encuentra");
			}
		this.raza=raza;
		existeRaza();
		inicializar();
		}
	
	public void existeRaza() {
		do{
			for ( String s : razasEnemigos) {
			if ( raza.equalsIgnoreCase(s)) {
				razaEnemigoExiste=true;
			}
			}if(!razaEnemigoExiste) {
				raza=JOptionPane.showInputDialog("Introduce una raza que exista");
			}
		}while(!razaEnemigoExiste);
	}
	
	public void inicializar() {
//		switch (raza) {
//		case "humano" : this.resistencia=2;
//						this.setVida(4);
//						daño=2;
//						magia=0;
//		}
		if(this.raza.equalsIgnoreCase("orco")) { //8pts
			resistencia=4;
			daño=4;
			magia=0;
			movimiento=6;
		}
		if(this.raza.equalsIgnoreCase("goblin")) { //8pts
			resistencia=2;
			daño=3;
			magia=0;
			movimiento=8;
		}
		if(this.raza.equalsIgnoreCase("momia")) { //8pts
			resistencia=6;
			daño=4;
			magia=0;
			movimiento=4;
		}
		if(this.raza.equalsIgnoreCase("Esqueleto")) { //8pts
			resistencia=2;
			daño=3;
			magia=0;
			movimiento=4;
		}
		if(this.raza.equalsIgnoreCase("fimir")) { //8pts
			resistencia=5;
			daño=5;
			magia=2;
			movimiento=6;
		}
		}
	public void gritar() {
		if (raza.equalsIgnoreCase("fimir")) {
			System.out.println("FIMIIIIIIIIIIIIIIIIIIIIIIIIIR!!!");
		}
		if (raza.equalsIgnoreCase("orco")) {
			System.out.println("WAAAAGH!");
		}
		if (raza.equalsIgnoreCase("goblin")) {
			System.out.println("ñañañaña");
		}
		if(raza.equalsIgnoreCase("esqueleto")) {
			System.out.println("cloclocloc");
		}
		if(raza.equalsIgnoreCase("momia")) {
			System.out.println("!! himoteph!! ");
		}
	}
	protected int getDaño() {
		return daño;
	}

	protected void setDaño(int daño) {
		this.daño = daño;
	}

	public void enemigoAtacan(Personaje personaje) {
		if(comprobarVida()>0) {
			if(movimiento>=personaje.getDistancia()) {
				personaje.setDistancia(0);
				gritar();
				int ataque = this.getDaño();
				int defensa= personaje.getResistencia();
				
				Dado d4 = new Dado(4);
				System.out.print("Resultado tirada monstruo= "+d4.getValor() );
				System.out.print("; Ataque monstruo= "+ataque);
				System.out.print("; Defensa heroe= "+defensa );
				System.out.print("; Vida previa= "+personaje.getVida());
				ataque=ataque +d4.getValor();
				if ( ataque >=defensa) {
					if(defensa==ataque) {
						personaje.recibeHeridas(-1);
					}
					personaje.recibeHeridas(defensa-ataque);
				}if(personaje.getVida()<1) {
					System.out.println("Has muerto!! \nFIN DE JUEGO");
					System.exit(0);
				}
				System.out.println( "; Vida resultante="+personaje.getVida());
			}else {
				int distanciaHeroe=personaje.getDistancia();
				int diferencia =distanciaHeroe-this.movimiento;
				personaje.setDistancia(diferencia);
				System.out.println("El heroe se ha alejado demasiado, ahora estas a "+diferencia+" casillas");
			}
		}
		
	}public void morir(Habitacion habitacion) {
		this.vida=0;
		comprobarVida();
		if(habitacion.listaMonstruosHabitacion.size()>0){
			habitacion.listaMonstruosHabitacion.remove();
			habitacion.setCantidadEnemigos(habitacion.getCantidadEnemigos()-1);
		}
		
	}
	public int comprobarVida() {
		if(this.vida<=0) {
			System.out.println("Monstruo muerto, no puedes atacar\n"
					+ "Valores a 0");
			this.daño=0;
			this.magia=0;
			this.movimiento=0;
			this.resistencia=0;
		}
		return vida;
	}
	public static void consultarTodasRazas() {
		for ( int j=0; j<1;j++) {
			for (int i = 0; i<razasEnemigos.length;i++) {
				//todasLasRazas= todasLasRazas.concat(razasEnemigos[i]+"\t");
				Enemigo n = new Enemigo(razasEnemigos[i]);
			//	String dañ= 
				todosDaños[i]=Integer.toString(n.daño);
				todosMagia[i]= Integer.toString(n.magia);
				todosResistencia[i]= Integer.toString(n.resistencia);
				todosMov[i]=Integer.toString(n.movimiento);
			}
			System.out.println("razas");
			imprimirArrayString(razasEnemigos,8);
			System.out.println("daños");
			imprimirArrayString(todosDaños);
			System.out.println("Magia");
			imprimirArrayString(todosMagia);
			System.out.println("resistencia");
			imprimirArrayString(todosResistencia);
			System.out.println("Movimiento");
			imprimirArrayString(todosMov);
		}
	}
//	public void imprimirTodasLasRazas() {
//		imprimirArrayString(todosDaños);
//	}
	public static void imprimirArrayString(String [] recibido,int dist) {
		for ( String i: recibido) {
			switch (dist) {
			case 8: 	System.out.printf("%7s  ",i);
			break;
			}
		}System.out.println();
	}
	public static void imprimirArrayString(String [] recibido) {
		for ( String i: recibido) {
			
			System.out.printf("%7s  ",i);
			
			
		}System.out.println();
	}
	public String toString() {
		return "Raza "+this.raza +"\n===========\nDaño "+this.daño+ "\nResistencia "+ this.resistencia+ "\nMagia "+this.magia+ 
				 "\nMovimiento "+this.movimiento ;
	}
	protected String getRaza() {
		return raza;
	}

	protected void setRaza(String raza) {
		this.raza = raza;
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

	public static void main (String args[]) {
		Enemigo orco = new Enemigo("fimr");
		System.out.println(orco);
		System.out.println(orco.getVida());
	}
}
